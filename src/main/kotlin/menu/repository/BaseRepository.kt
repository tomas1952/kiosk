package menu.repository

import common.exception.NotFoundException
import menu.entity.BaseEntity

abstract class BaseRepository<T : BaseEntity> {
    protected var entityName: String = ""
    protected var curId: Long = 0L
    protected val items: HashMap<Long, T> = hashMapOf()
    fun insert(entity: T): T {
        entity.id = ++curId
        items[curId] = entity
        return entity
    }
    fun update(id: Long, newEntity: T): T {
        findById(id)
        newEntity.id = id
        items[id] = newEntity
        return newEntity
    }
    fun findAll(): List<T>  = items.values.toList()

    fun findByIdOrNull(id: Long): T? {
        return items[id]
    }

    fun findById(id:Long): T = findByIdOrNull(id)
        ?: throw NotFoundException("일치하는 ${entityName}을 찾을 수 없습니다.")

    fun delete(id: Long) {
        val entity = findById(id)
        items.values.remove(entity)
    }
}
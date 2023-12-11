package menu.repository

import menu.entity.Cuisine

class CuisineRepository : BaseRepository<Cuisine>() {
    init {
        entityName = "음식"
    }

    fun findAllByCategory(categoryId: Long): List<Cuisine> {
        return items.values.filter { it.categoryId == categoryId }.toList()
    }
}
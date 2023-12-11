package menu.entity

import java.time.LocalDate

abstract class BaseEntity {
    var id: Long = -1L
    val createdAt: LocalDate = LocalDate.now()
    var modifiedAt: LocalDate = LocalDate.now()
}
package menu.dto

import menu.entity.CuisineCategory

class CuisineCategoryReadDto(
    val id: Long,
    val name: String,
    val koreanName: String,
    val description: String,
) {
    companion object {
        fun from(entity: CuisineCategory) = CuisineCategoryReadDto(
            id = entity.id,
            name = entity.name,
            koreanName = entity.koreanName,
            description = entity.description,
        )
    }
}
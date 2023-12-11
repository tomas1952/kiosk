package menu.dto

import menu.entity.CuisineCategory

class CuisineCategoryCreateDto(
    val name: String,
    val description: String,
) {
    fun toEntity() : CuisineCategory = CuisineCategory(
        name = name,
        description = description,
    )
}
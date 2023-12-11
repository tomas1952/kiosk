package menu.dto

import menu.entity.CuisineCategory

class CuisineCategoryCreateDto(
    val name: String,
    val koreanName: String,
    val description: String,
) {
    fun toEntity() : CuisineCategory = CuisineCategory(
        name = name,
        koreanName = koreanName,
        description = description,
    )
}
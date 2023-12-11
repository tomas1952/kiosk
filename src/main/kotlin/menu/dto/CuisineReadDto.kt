package menu.dto

import menu.entity.Cuisine
import menu.entity.CuisineCategory

class CuisineReadDto(
    val id: Long,
    val name: String,
    val description: String,
    val category: CuisineCategoryReadDto?,
    val price: Int,
    val eatingMethods: List<String>,
    val breakfastAvailability: Boolean = false,
) {
    companion object {
        fun from(entity: Cuisine, category: CuisineCategory? = null) = CuisineReadDto(
            id = entity.id,
            name = entity.name,
            description = entity.description,
            category = category?.let { CuisineCategoryReadDto.from(category) },
            price = entity.price,
            eatingMethods = entity.eatingMethods.map { it.methodKoreanName }.toList(),
            breakfastAvailability = entity.breakfastAvailability
        )
    }
}
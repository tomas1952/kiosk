package menu.dto

import menu.entity.Cuisine
import menu.entity.CuisineCategory

class CuisineReadDto(
    val id: Long,
    val name: String,
    val koreanName: String,
    val description: String,
    val category: CuisineCategoryReadDto?,
    val price: Int,
    val extraPrice: Int?,
    val eatingMethods: List<String>,
    val onlyBreakfast: Boolean = false,
) {
    companion object {
        fun from(entity: Cuisine, category: CuisineCategory? = null) = CuisineReadDto(
            id = entity.id,
            name = entity.name,
            koreanName = entity.koreanName,
            description = entity.description,
            category = category?.let { CuisineCategoryReadDto.from(category) },
            price = entity.price,
            extraPrice = entity.extraPrice,
            eatingMethods = entity.eatingMethods.map { it.methodKoreanName }.toList(),
            onlyBreakfast = entity.onlyBreakfast
        )
    }
}
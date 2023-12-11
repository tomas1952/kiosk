package menu.dto

import common.enumeration.EatingMethod
import menu.entity.Cuisine
import menu.entity.CuisineCategory

class CuisineCreateDto(
    val name: String,
    val koreanName: String,
    val description: String,
    val categoryId: Long?,
    val price: Int,
    val extraPrice: Int?,
    val eatingMethods: List<String>,
    val onlyBreakfast: Boolean,
) {
    fun toEntity(category: CuisineCategory?): Cuisine {
        val hashSet = HashSet<EatingMethod>()
        eatingMethods.map {
            rawIt -> EatingMethod.entries
                .filter { it.methodKoreanName == rawIt }
                .forEach { hashSet.add(it) }
        }

        return Cuisine(
                name = name,
                koreanName = koreanName,
                description = description,
                categoryId = category?.id,
                price = price,
                extraPrice = extraPrice,
                eatingMethods = hashSet,
                onlyBreakfast = onlyBreakfast,
            )
    }
}
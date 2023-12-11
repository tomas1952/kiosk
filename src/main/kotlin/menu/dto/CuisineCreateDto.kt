package menu.dto

import common.enumeration.EatingMethod
import menu.entity.Cuisine
import menu.entity.CuisineCategory

class CuisineCreateDto(
    var name: String,
    var description: String,
    var categoryId: Long?,
    var price: Int,
    var eatingMethods: List<String>,
    var breakfastAvailability: Boolean,
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
                description = description,
                categoryId = category?.id,
                price = price,
                eatingMethods = hashSet,
                breakfastAvailability = breakfastAvailability,
            )
    }
}
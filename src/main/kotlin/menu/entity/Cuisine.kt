package menu.entity

import common.enumeration.EatingMethod

class Cuisine(
    var name: String,
    var description: String,
    var categoryId: Long?,
    var price: Int,
    var eatingMethods: HashSet<EatingMethod> = hashSetOf(),
    var breakfastAvailability: Boolean = false,
) : BaseEntity()
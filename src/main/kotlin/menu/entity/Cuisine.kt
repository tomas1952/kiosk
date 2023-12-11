package menu.entity

import common.enumeration.EatingMethod

class Cuisine(
    var name: String,
    var koreanName: String,
    var description: String,
    var categoryId: Long?,
    var price: Int,
    var extraPrice: Int?,
    var eatingMethods: HashSet<EatingMethod> = hashSetOf(),
    var onlyBreakfast: Boolean = false,
) : BaseEntity()
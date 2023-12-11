package menu.repository

import menu.entity.CuisineCategory

class CuisineCategoryRepository: BaseRepository<CuisineCategory>() {
    init {
        entityName = "음식 카테고리"
    }
}
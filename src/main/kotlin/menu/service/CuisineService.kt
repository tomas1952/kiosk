package menu.service

import menu.dto.CuisineCategoryCreateDto
import menu.dto.CuisineCategoryReadDto
import menu.dto.CuisineCreateDto
import menu.dto.CuisineReadDto

interface CuisineService {
    fun createCategory(dto: CuisineCategoryCreateDto): CuisineCategoryReadDto
    fun findAllCategories(): List<CuisineCategoryReadDto>
    fun createCuisine(dto: CuisineCreateDto): CuisineReadDto
    fun findAllCuisine(): List<CuisineReadDto>
    fun findAllCuisineByCategory(categoryId: Long): List<CuisineReadDto>

}
package menu.service

import menu.dto.CuisineCategoryCreateDto
import menu.dto.CuisineCategoryReadDto
import menu.dto.CuisineCreateDto
import menu.dto.CuisineReadDto
import menu.repository.CuisineCategoryRepository
import menu.repository.CuisineRepository

class CuisineServiceImpl(
    private val categoryRepository: CuisineCategoryRepository,
    private val cuisineRepository: CuisineRepository,
) : CuisineService {
    override fun createCategory(dto: CuisineCategoryCreateDto): CuisineCategoryReadDto {
        val entity = categoryRepository.insert(dto.toEntity())
        return CuisineCategoryReadDto.from(entity)
    }

    override fun findAllCategories(): List<CuisineCategoryReadDto> {
        val result = categoryRepository.findAll()
        return result.map(CuisineCategoryReadDto::from).toList()
    }

    override fun createCuisine(dto: CuisineCreateDto): CuisineReadDto {
        val category = dto.categoryId?.let {
            categoryRepository.findByIdOrNull(it)
        }

        val entity = cuisineRepository.insert(dto.toEntity(category))
        return CuisineReadDto.from(entity, category)
    }

    override fun findAllCuisine(): List<CuisineReadDto> {
        val result = cuisineRepository.findAll()
        return result.map { it -> CuisineReadDto.from(it) }.toList()
    }

    override fun findAllCuisineByCategory(categoryId: Long): List<CuisineReadDto> {
        val result = cuisineRepository.findAllByCategory(categoryId)
        return result.map { it -> CuisineReadDto.from(it) }.toList()
    }
}
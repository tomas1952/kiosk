package menu

import common.enumeration.MainMenu

interface MenuCotroller {
    fun printMainMenu()
    fun inputMainMenu(): MainMenu
    fun printBurgerMenu()
    fun printFrozenCustardMenu()
    fun printDrinkMenu()
    fun printBeerMenu()
}
package menu

import common.enumeration.MainMenu

class MenuControllerImpl : MenuCotroller {
    override fun printMainMenu() {
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("[ SHAKESHACK MENU ]")
        MainMenu.entries.forEach {
            val format = String.format("%2s. %-13s | %s", it.order, it.menuName, it.description)
            println(format)
        }
    }

    override fun inputMainMenu(): MainMenu {
        while(true) {
            val menu = inputMenu()

            val filter = MainMenu.entries.filter { it.order == menu }
            if (filter.isEmpty())
                continue

            return filter.first()
        }
    }

    override fun printBurgerMenu() {
        TODO("Not yet implemented")
    }

    override fun printFrozenCustardMenu() {
        TODO("Not yet implemented")
    }

    override fun printDrinkMenu() {
        TODO("Not yet implemented")
    }

    override fun printBeerMenu() {
        TODO("Not yet implemented")
    }

    private fun inputMenu(): String {
        print("입력: ")
        return readln().trim()
    }
}
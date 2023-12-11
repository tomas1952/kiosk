import common.enumeration.MainMenu.*
import menu.MenuControllerImpl

fun main(args: Array<String>) {
    val menuController = MenuControllerImpl()
    while(true) {
        menuController.printMainMenu()
        when(menuController.inputMainMenu()) {
            BURGER -> TODO()
            CHICKEN -> TODO()
            FLAT_TOP_DOGS -> TODO()
            CUSTARD -> TODO()
            CONCRETES -> TODO()
            DRINKS -> TODO()
            WOOF -> TODO()
            BREAKFAST -> TODO()
            QUIT -> {
                println("프로그램을 종료합니다.")
                break
            }
        }
    }
}

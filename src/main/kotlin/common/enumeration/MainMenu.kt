package common.enumeration
enum class MainMenu(
    val order: String,
    val menuName: String,
    val description: String,
) {
    BURGER("1","Burgers", "쉐이크쉑의 시그니처 비프 패티와 쫄깃한 식감의 토종효모 포테이토 번, 토마토, 양상추에 쉑소스를 올려 만든 심플하면서도 맛있는 쉑버거와 그 외 다양한 버거 메뉴가 있습니다."),
    CHICKEN("2","Chicken", "신선한 치킨 통살을 버터밀크에 수비드 하여 주문과 동시에 바삭하게 튀겼습니다."),
    FLAT_TOP_DOGS("3","Flat-top dogs", "쉐이크쉑의 시작을 알리기도 했던 플랫-탑 도그를 버거와 함께 즐겨보세요!"),
    CUSTARD("5","Custard","매장에서 매일 신선하게 제조하는 쫀득하고 진한 커스터드를 드셔보버거를 먹을 때 사이드 메뉴가 빠져서는 안되죠! 바삭하게 튀겨낸 짭짤한 프라이를 달콤한 쉐이크에 찍어 먹으면 그날의 스트레스는 모두 날아갈 거예요!"),
    CONCRETES("6","Concretes","쫀득하고 진한 맛의 커스터드와 다양한 믹스-인이 만나 탄생한 쉐이크쉑만의 디저트 메뉴, 콘크리트를 만나보세요."),
    DRINKS("7","Drinks","매장에서 직접 만드는 상큼한 레몬에이드, 달지 않고 향긋한 아이스티, 레몬에이드와 아이스티를 반반 섞은 쉐이크쉑의 시그니처 음료 피프티/피프티도 잊지 마세요."),
    WOOF("8","Woof","우리 마음 속엔 언제나 귀여운 네 발 친구도 함께 합니다. (오직 포장만 가능합니다.)"),
    BREAKFAST("9", "Breakfast", "바쁜 하루를 시작하기 전, 든든하게 배를 채워보세요. (오직 아침에만 즐길 수 있습니다.)"),
    QUIT("0", "Quit", "프로그램을 종료합니다."),
    ;
}
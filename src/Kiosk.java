import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    private Order order = new Order();
    private ArrayList<Product> BurgerMenu = new ArrayList<Product>(); // 버거 메뉴판
    private ArrayList<Product> FrozenMenu = new ArrayList<Product>(); // 프로즌 메뉴판
    private ArrayList<Product> DrinkMenu = new ArrayList<Product>(); // 드링크 메뉴판


    public void loadMenu() {
        // 카테고리 메뉴판 출력(이넘 사용해볼 것)
//        Menu BurgerMenu = new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거");
//        Menu FrozenCustardMenu = new Menu("Forzen Custard", "매장에서 신선하게 만드는 아이스크림");
//        Menu DrinkMenu = new Menu("Drinks", "매장에서 직접 만드는 음료");
//        CategoryMenu.add(BurgerMenu);
//        CategoryMenu.add(FrozenCustardMenu);
//        CategoryMenu.add(DrinkMenu);

        // 버거 메뉴
        BurgerMenu.add(new Product("ShackBurger", 6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        BurgerMenu.add(new Product("SmokeShack", 8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        BurgerMenu.add(new Product("Burger", 9.4,"몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"));
        BurgerMenu.add(new Product("Cheeseburger", 6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));

        // 프로즌 메뉴
        FrozenMenu.add(new Product("Shakes", 5.9,"바닐라, 초콜렛, 스트로베리"));
        FrozenMenu.add(new Product("ShakeOfTheWeek", 6.5,"특별한 커스터드 플레이버"));
        FrozenMenu.add(new Product("Floats", 5.9,"루트 비어, 퍼플 카우, 크림시클"));

        // 드링크 메뉴
        DrinkMenu.add(new Product("Soda", 3.0,"코카콜라, 코카콜라 제로, 스프라이트"));
        DrinkMenu.add(new Product("IcedTea", 3.5,"직접 유기농 홍차를 우려낸 아이스티"));
        DrinkMenu.add(new Product("BottledWater", 1.0,"지리산 암반대수층으로 만든 프리미엄 생수"));
    }

//    public void display() throws InterruptedException {

//        }



}

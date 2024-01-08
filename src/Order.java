import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Order {
    private int waitNum = 0; // 대기번호
    private ArrayList<Product> Cart = new ArrayList<Product>();

    // 장바구니에 추가
    public void addOrder(Product product){
        Scanner sc = new Scanner(System.in);
        int input = 0;

        if (input != 0){
            product.show(); // 메뉴 | W 가격 | 이름
            orderQuestion(product);
        }
            
    }
    // 장바구니 추가 전 질문
    public void orderQuestion (Product product) {
        Scanner sc = new Scanner(System.in);
        int input;
        product.show();
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인          2.취소");
        input = sc.nextInt();
        if (input == 1) { // 장바구니 추가
            System.out.println(product.getName() + "가 장바구니에 추가되었습니다.");
            Cart.add(product);
        } else if (input == 2) {
            System.out.println("장바구니에 추가하지 않았습니다.");
        }
    }

    // 장바구니 보기, 총 가격 return
    public double getCart(){
        double totalPrice = 0;
        // totalPrice;
        HashSet<Product> totalProductSet = new HashSet<Product>(Cart);
        for (Product item : totalProductSet) {
            totalPrice += item.getPrice(); // 가격계산
        }
        totalPrice=Math.round((totalPrice*100))/100.0; //소수점 둘째자리까지 나타내고 반올림
        return totalPrice;
    }

    public int completeOrder() {
        Cart.clear();
        waitNum++; // 대기번호
        return waitNum;
    }
    public void cancelOrder() {
        Cart.clear();
    }
}

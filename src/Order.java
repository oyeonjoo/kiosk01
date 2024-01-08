import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Order {
    private int waitNum = 0; // 대기번호
    private ArrayList<Product> Cart = new ArrayList<Product>();

    // 장바구니에 추가
    public void addOrder(Product product){
        
            
    }
    // 장바구니 추가 전 질문
    public void orderQuestion (Product product) {
        
    }

    // 장바구니 보기, 총 가격 return
    public double getCart(){
        
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

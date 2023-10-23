import java.util.ArrayList;
import java.util.List;

public class Order extends Burger {

    List<String> orders = new ArrayList<String>();
    List<Double> money = new ArrayList<Double>();
    double sum = 0;
    int count = 0;

    void select(int x) {
        System.out.println(name[x - 1] + "|" + price[x - 1] + "|" + exp[x - 1]);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인");
        System.out.println("2. 취소");

    }

    void yes(int x, int y) {//문제발견
        System.out.println(name[y - 1] + "가 장바구니에 추가되었습니다\n");
        orders.add(name[y - 1]);
        money.add(price[y - 1]);

    }

    void pay() {
        sum = 0;
        System.out.println("아래와 같이 주문하시겠습니까?");
        System.out.println("[Orders]");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i) + "|" + money.get(i));
        }
        System.out.println("[ Total ]");

        for (int i = 0; i < money.size(); i++) {
            sum += money.get(i);
        }
        System.out.println(sum + "\n");
        System.out.println("1. 주문");
        System.out.println("2. 메뉴판");

    }

    void wait(int x) {
        if (x == 1) {
            System.out.println("주문이 완료되었습니다\n");
            System.out.println("대기번호는 [ 1 ] 번 입니다.");
            System.out.println("3초후 메뉴판으로 이동합니다");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            orders.clear();
            money.clear();
            count = 0;
            sum = 0;
        }

    }

    void cancel() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인");
        System.out.println("2. 취소");

    }

    void yesCancel(int x) {
        if (x == 1) {
            orders.clear();
            money.clear();
            System.out.println("진행하던 주문이 취소되었습니다.");
            count = 0;
        }
    }

}

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args)throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        MainMenu menu= new MainMenu();
        Products products = new Products();
        Order order = new Order();

        while(true) {
            menu.Menu();
            int menuNumber = sc.nextInt();
            switch (menuNumber) {
                case 1:
                    products.burger();
                    int orderNumber = sc.nextInt();
//                    if((orderNumber<0)||(orderNumber>7))
                    int i = 0;
                    order.select(orderNumber);
                    int yesNumber = sc.nextInt();
                    order.yes(yesNumber,orderNumber);
                    break;
                case 5:
                    order.pay();
                    int endNumber = sc.nextInt();
                    order.wait(endNumber);

                    break;
                case 6:
                    order.cancel();
                    int cancelNumber = sc.nextInt();
                    order.yesCancel(cancelNumber);
                    break;

                default:
                    System.out.println("잘못된 번호를 입력하셨습니다. 다시입력해주세요");
            }
        }
    }
}
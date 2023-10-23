public class Products extends Burger{

    void burger(){
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ BURGER MENU ]");
        int i;
        for(i=0; i<this.name.length; i++){
            System.out.println((i+1)+name[i]+"|"+price[i]+"|" + exp[i]);
        }


    }

}

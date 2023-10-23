public class MainMenu extends MenuName{

    void Menu(){
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");
        int i;
        for(i=0; i<4; i++){
            System.out.println((i+1)+name[i]+"|" + exp[i]);
        }
        System.out.println("\n[ ORDER MENU ]");
        int j;
        for(j=i;j<name.length;j++){
            System.out.println((j+1)+name[j]+"|" + exp[j]);
        }
    }
}

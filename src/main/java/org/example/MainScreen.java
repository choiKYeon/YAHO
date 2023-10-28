package org.example;

public class MainScreen {
    MemberController memberController = new MemberController();
    public void select(){
        System.out.println("\n○●○● YAHO의 메인화면 입니다. ●○●○");
        System.out.println("\n 1.지역선택 / 2.로그아웃");
        System.out.print("입력 :");
        String command2 = Container.getSc().nextLine().trim();

        if (command2.equals("지역선택")){

        } else if (command2.equals("로그아웃")) {
            memberController.logout();
        }
    }
}

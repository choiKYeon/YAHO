package org.example;

public class App {
    MemberController memberController = new MemberController();
    public void run(){

        System.out.println("○●○● YAHO에 오신걸 환영합니다. ●○●○");

        while (true){

            System.out.println("\n== 로그인을 진행해주세요. (계정이 없다면 회원가입을 진행해주세요.) ==");
            System.out.println("\n1.로그인 / 2.회원가입 / 3.종료");
            System.out.print("입력 :");
            String command = Container.getSc().nextLine().trim();

            if (command.equals("종료")){
                System.out.println("== 프로그램을 종료합니다. ==");
                Container.close();
                break;
            } else if (command.equals("로그인")) {
                memberController.login();
            } else if (command.equals("회원가입")) {
                memberController.sign();
            }
        }
    }
}

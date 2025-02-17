package org.example;

import org.example.Container;
import org.example.DefaultCommand;

public class Area {
    MoiuntainController moiuntainController = new MoiuntainController();
    // 지역을 선택하는 메인화면
    public void areaSelcet(){

        while (true) {
            System.out.println("\n== 지역을 선택해주세요. ==");
            System.out.println("\n1.경기도 / 2.강원도 / 3.충청도 / 4.전라도 / 5.경상도 / 6.제주도");
            System.out.print("입력 :");
            String commandArea = Container.getSc().nextLine().trim();

            switch (commandArea) {
                case "경기도":
                    moiuntainController.gyeonggiDo();
                    break;
                case "강원도":
                    moiuntainController.gangwonDo();
                    break;
                case "충청도":
                    moiuntainController.chungcheongDo();
                    break;
                case "전라도":
                    moiuntainController.jeollaDo();
                    break;
                case "경상도":
                    moiuntainController.kyongsangDo();
                    break;
                case "제주도":
                    moiuntainController.jejuDo();
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
}
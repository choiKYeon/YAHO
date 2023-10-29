package org.example;

public class MoiuntainController {
    public void gyeonggiDo() {
        while (true) {
            System.out.println("\n== 경기도 지역의 산을 선택해주세요. ==");
            System.out.print("입력 :");
            String commandMountain = Container.getSc().nextLine().trim();

            switch (commandMountain) {
                case "청계산":
                    break;
                case "불장산":
                    break;
                case "구룡산":
                    break;
                case "관악산":
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
    public void gangwonDo() {
        while (true) {
            System.out.println("\n== 강원도 지역의 산을 선택해주세요. ==");
            System.out.print("입력 :");
            String commandMountain = Container.getSc().nextLine().trim();

            switch (commandMountain) {
                case "오대산":
                    break;
                case "봉평산":
                    break;
                case "설악산":
                    break;
                case "태백산":
                    break;
                case "속리산":
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }

    public void chungcheongDo() {
        while (true) {
            System.out.println("\n== 충청도 지역의 산을 선택해주세요. ==");
            System.out.print("입력 :");
            String commandMountain = Container.getSc().nextLine().trim();

            switch (commandMountain) {
                case "계룡산":
                    break;
                case "백운산":
                    break;
                case "대덕산":
                    break;
                case "내장산":
                    break;
                case "소백산":
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
    public void kyongsangDo() {
        while (true) {
            System.out.println("\n== 경상도 지역의 산을 선택해주세요. ==");
            System.out.print("입력 :");
            String commandMountain = Container.getSc().nextLine().trim();

            switch (commandMountain) {
                case "공주산":
                    break;
                case "토함산":
                    break;
                case "대왕약산":
                    break;
                case "구룡산":
                    break;
                case "콘솔산":
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
    public void jeollaDo() {
        while (true) {
            System.out.println("\n== 전라도 지역의 산을 선택해주세요. ==");
            System.out.print("입력 :");
            String commandMountain = Container.getSc().nextLine().trim();

            switch (commandMountain) {
                case "월출산":
                    break;
                case "무등산":
                    break;
                case "무안고덕산":
                    break;
                case "장안산":
                    break;
                case "오리유산":
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
    public void jejuDo() {
        while (true) {
            System.out.println("\n== 제주도 지역의 산을 선택해주세요. ==");
            System.out.print("입력 :");
            String commandMountain = Container.getSc().nextLine().trim();

            switch (commandMountain) {
                case "한라산":
                    break;
                default:
                    DefaultCommand.DefaultCommand();
                    continue;
            }
            break;
        }
    }
}
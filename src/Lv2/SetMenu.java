package Lv2;

import java.util.Scanner;

public class SetMenu {
    Scanner sc = new Scanner(System.in);
    BaseBallGame baseBallGame = new BaseBallGame();

    public void SetMenu() {
        boolean out = true;

        while (out) {
            System.out.println("환영합니다! 원하시는 번호를 입력해주세요");
            System.out.println("1.게임 시작하기 2. 게임 기록 보기 3. 종료하기");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    baseBallGame.play();
                    break;

                case 2:
                    break;

                case 3:
                    System.out.println("게임을 종료합니다.");
                    out = false;
                    break;

                default:
                    System.out.println("잘못된 값을 입력하셨습니다.");
            }
        }
    }
}

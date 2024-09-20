package Lv4;

import java.util.ArrayList;
import java.util.Arrays;

public class BaseBallGame {

    private final InsertNumber insertNumber = new InsertNumber();
    private final CreateRandomNumber createRandomNumber = new CreateRandomNumber();
    private ArrayList <Integer> history = new ArrayList <> ();
    private int num = 3; //자리수 기본셋팅 변수 생성

    public void setnum() {
        System.out.println("설정하고자 하는 자리수를 입력하세요");
        num = insertNumber.zeronum();
        System.out.println(num+"자리수 난이도로 설정되었습니다.");
        System.out.println();
    }

    //몇번 시도 한지 출력 하는 매서드
    public void showhistory () {
        System.out.println("<게임기록보기>");
        if (history.size() == 0) {
            System.out.println("게임기록이 없습니다.");
        } else {
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + "번째게임 : 시도회수 - " + history.get(i));
            }
        }
        System.out.println();
    }

    public void play() {
        System.out.println("<BaseBallGame을 시작합니다>");
        int[] randomNum = createRandomNumber.BaseBallGame(num);
        System.out.println(Arrays.toString(randomNum));

        int count = 0;

        while (true) {
            int[] input = insertNumber.getnumber(num);

            int strike = 0;
            int ball = 0;
            count++;

            for (int i = 0; i < input.length; i++) {
                for (int j = 0; j < input.length; j++) {
                    if (input[i] == randomNum[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            if (strike == 0 && ball == 0) {
                System.out.println("Out");
            } else {
                System.out.println("Strike = " + strike + " ball = " + ball);
            }

            if (strike == num) {
                System.out.println("모두 맞추셨습니다. 시도회수 : "+ count);
                history.add(count);
                break;
            }
        }
    }
}

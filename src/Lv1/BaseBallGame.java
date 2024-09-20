package Lv1;

import java.util.*;

public class BaseBallGame {

    InsertNumber insertNumber = new InsertNumber();
    CreateRandomNumber createRandomNumber = new CreateRandomNumber();

    public void play() {
        System.out.println("<BaseBallGame을 시작합니다>");
        System.out.println("서로 다른 3자리수를 입력하세요");

        int [] randomNum = createRandomNumber.BaseBallGame();
        System.out.println(Arrays.toString(randomNum));

        while (true) {
            int[] input = insertNumber.getnumber();
            int strike = 0;
            int ball = 0;

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

            if (strike == 3) {
                System.out.println("모두 맞추셨습니다.");
                break;
            }
        }
    }
}

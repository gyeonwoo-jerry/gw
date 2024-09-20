package Lv1;

import java.util.Scanner;

public class InsertNumber {
    Scanner sc = new Scanner(System.in);

    public int [] getnumber() {

        //try catch 문으로 예외처리 로직 작성
        try {
            int[] num = new int[3];

            String number = sc.nextLine();
            String[] insert = number.split("");

            //0은 예외처리, 숫자 외 입력시 예외처리
            for (int i = 0; i < insert.length; i++) {
                if (insert[i].equals("0")) {
                    System.out.println("0은 입력할수 업습니다.");
                    throw new Exception();
                }
                //try에서 발생하는 오류는 catch로
                num[i] = Integer.parseInt(insert[i]);
            }

            //3개의 숫자만 받도록..예외처리
            if (insert.length != 3) {
                System.out.println("3개의 숫자만 입력하세요");
                throw new Exception();
            }

            //동일한숫자 불가능
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (num[i] == num[j]) {
                        System.out.println("동일한 숫자는 입력할 수 없습니다.");
                        throw new Exception();
                    }
                }
            }
            return num;
        } catch (NumberFormatException e) {  //형변환 과정에서 발생하는 오류는 이쪽으로
            System.out.println("숫자만 입력이 가능합니다.");
            return getnumber();
        } catch (Exception e) {
            return getnumber();
        }
    }
}

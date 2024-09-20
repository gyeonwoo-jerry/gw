package Lv4;

import java.util.Scanner;

public class InsertNumber {
    Scanner sc = new Scanner(System.in);

    public int [] getnumber(int n) {

        //try catch 문으로 예외처리 로직 작성
        try {
            int[] num = new int[n];

            String number = sc.nextLine();
            String[] insert = number.split("");

            //0은 예외처리, 숫자 외 입력시 예외처리
            for (int i = 0; i < insert.length; i++) {
                if (insert[i].equals("0")) {
                    System.out.println("0은 입력할수 업습니다.");
                    throw new Exception();
                }
                //try에서 형변환 하면서 발생하는 오류는 catch로
                num[i] = Integer.parseInt(insert[i]);
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

            //형변환 과정에서 발생하는 오류는 이쪽으로
        } catch (NumberFormatException e) {
            System.out.println("올바른 입력값이 아닙니다.");
            return getnumber(n);
        } catch (Exception e) {
            return getnumber(n);
        }
    }


    public int zeronum() {
        try {
            int num = sc.nextInt();
            if (num != 3 && num != 4 && num != 5) {
                throw new Exception();
            }
            return num;
        }
        catch (Exception e) {
            System.out.println("정상적인 입력값이 아닙니다.");
            return zeronum();
        }
    }
}

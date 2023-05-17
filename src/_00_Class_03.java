import java.util.Scanner;

public class _00_Class_03 {
    static _00_Class_03 b = new _00_Class_03();
    public static void main(String[] args) {
        //객체 선언
        Scanner scan = new Scanner(System.in);
        // 3개의 숫자를 입력받아 합계를 구하시오.
        // add메소드 사용
        int[] num = new int[3];int[] num2 = new int[3];int[] num3 = new int[3];int[] num4 = new int[3];
        for (int i=0; i<3; i++) {
            System.out.println((i+1)+"번째 숫자 입력");
            num[i] = scan.nextInt();}
        int result_plus = b.plus(num[0],num[1],num[2]);
        System.out.println("세 수의 결과 값은 :" + result_plus+ "입니다.");
        for (int i=0; i<3; i++) {
            System.out.println((i+1)+"번째 숫자 입력");
            num2[i] = scan.nextInt();}
        int result_plus2 = b.plus2(num[0],num[1],num[2]);
        System.out.println("세 수의 결과 값은 :" + result_plus2+ "입니다.");
        for (int i=0; i<3; i++) {
            System.out.println((i+1)+"번째 숫자 입력");
            num3[i] = scan.nextInt();}
        int result_plus3 = b.plus3(num[0],num[1],num[2]);
        System.out.println("세 수의 결과 값은 :" + result_plus3+ "입니다.");
        for (int i=0; i<3; i++) {
            System.out.println((i+1)+"번째 숫자 입력");
            num4[i] = scan.nextInt();}
        int result_plus4 = b.plus4(num[0],num[1],num[2]);
        System.out.println("세 수의 결과 값은 :" + result_plus4+ "입니다.");
    }

    int plus(int a, int b, int c) {int result_plus = (a + b) + c;return result_plus;   }
    int plus2(int a, int b, int c) {int result_plus2 = (a - b) - c;return result_plus2;   }
    int plus3(int a, int b, int c) {int result_plus3 = (a * b) * c;return result_plus3;   }
    int plus4(int a, int b, int c) {int result_plus4 = (a / b) / c;return result_plus4;   }
}

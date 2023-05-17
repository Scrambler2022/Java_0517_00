import java.util.Scanner;

public class _00_Class_02 {
    public static void main(String[] args) {
        int[] num1 = new int[2];//+
        int[] num2 = new int[2];//+
        int[] num3 = new int[2];//-
        int[] num4 = new int[2];//-
        int[] num5 = new int[2];//*
        int[] num6 = new int[2];//*
        int[] num7 = new int[2];// /
        int[] num8 = new int[2];// /
        Scanner scan = new Scanner(System.in);
        //객체선언
        _00_Class_02 a = new _00_Class_02();
        //System.out.println(result);//add에 대입이되고 리절트에 그 값을 저장하여 a.add에 다시 보낸다.
        //두수를 입력받아 출력
        int[] num10 = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 숫자를 입력");
            num10[i] = scan.nextInt();}
        int result = a.add(num10[0], num10[1]);
        System.out.println("두 수의 결과 값은 :" + result + "입니다.");
        //
        //빼기
        int[] num11 = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 숫자를 입력");
            num11[i] = scan.nextInt();}
        int result2 = a.add2(num11[0], num11[1]);
        System.out.println("두 수의 결과 값은 :" + result2 + "입니다.");

        //곱하기
        int[] num13 = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 숫자를 입력");
            num13[i] = scan.nextInt();}
        int result3 = a.add3(num13[0], num13[1]);
        System.out.println("두 수의 결과 값은 :" + result3 + "입니다.");
        //나누기
        int[] num14 = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "번째 숫자를 입력");
            num14[i] = scan.nextInt();}
        int result4 = a.add4(num14[0], num14[1]);
        System.out.println("두 수의 결과 값은 :" + result4 + "입니다.");
    }
    //더하기 메소드
    int add(int a, int b) {int result = a + b;return result;   }
    int add2(int a, int b) {int result2 = a - b;return result2;}
    int add3(int a, int b) {int result3 = a * b;return result3;}
    int add4(int a, int b) {int result4 = a / b;return result4;}
}
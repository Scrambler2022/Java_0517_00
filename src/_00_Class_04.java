import java.util.Scanner;

public class _00_Class_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        _00_Class_04 d = new _00_Class_04();
        //객체 선언 - 참조변수명,변수명, 참조변수명,메소드명()

        int a = 0, b = 0, c = 0;
        //
        while (true) {
            System.out.println("1번째 수를 입력하세요");
            a = scan.nextInt();
            System.out.println("2번째 수를 입력하세요");
            b = scan.nextInt();
            System.out.println("3번째 수를 입력하세요");
            c = scan.nextInt();
            int result = d.max(a,b,c);
            int result2 = d.min(a,b,c);
            System.out.println("3개의 수의 최대값 :"+ result);
            System.out.println("3개의 수의 최소값 :"+ result2);

            //while
//        while (true) {
//            System.out.println("1번째 수를 입력하세요");
//            num1 = scan.nextInt();
//            System.out.println("2번째 수를 입력하세요");
//            num2 = scan.nextInt();
//            System.out.println("작은 수는? :" + Math.min(num1, num2));
//            if (scan.nextInt() == 0) {
//                break;
//            }//if
        }//while
    }//main
    int max(int a,int b, int c) {
        int result =0;
        result = Math.max(Math.max(a,b),c);
        return  result;
    }
    int min(int a,int b, int c) {
        int result2 =0;
        result2 = Math.min(Math.min(a,b),c);
        return  result2;
    }
}//class


//max = Math.max(Math.min(num1,num2),num3);
        //min = Math.min(Math.min(num1,num2),num3);
//        for (int i =0; i<3; i++) {
//            System.out.println((i+1)+"번째 Num");
//            num[i] = scan.nextInt();
//            int numMax = c.numMax(num[0],num[1],num[2]);
//            System.out.println("최고로 큰 넘버는!!!" + numMax + "입니다.");
//
//        }//for
//    max = Math.max(Math.max(a,b),c);
//    int numMax(int a, int b, int c) {
//        if(a>b) {
//            if(a>c) {
//            max = a;
//            }
//        }else if (b>c) {
//            return b;
//        }else {
//            return c;
//        }

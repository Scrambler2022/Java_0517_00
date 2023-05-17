public class _00_Class_07 {
    public static void main(String[] args) {

        int[] num = new  int[2];
        int a = 10;
        int b = 5;

        calculator(num,a,b);
        System.out.println("합계 :"+num[0]); //15
        System.out.println("평균 :"+num[1]); //7

    }//main
    static void calculator(int[] num, int a, int b) {
        // 두수의 합, 평균
        num[0] = a+b;
        num[1] = (a+b)/2;
    }

}//class

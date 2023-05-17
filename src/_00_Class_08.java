import java.util.Scanner;
public class _00_Class_08 {
    public static void main(String[] args) {
        // calculator 메소드를 호출합니다.
        // 이 메소드는 사용자로부터 세 개의 숫자를 입력받아 오름차순으로 출력하는 역할을 합니다.
        calculator();
    }
    // calculator라는 이름의 정적 메소드를 정의합니다.
    // 이 메소드는 사용자로부터 세 개의 숫자를 입력받아 오름차순으로 출력하는 역할을 합니다.
    static void calculator() {
        // Scanner 객체를 생성합니다. 이 객체는 사용자로부터 콘솔 입력을 받는 데 사용됩니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력하세요:");
        int a = scanner.nextInt();
        System.out.println("두 번째 수를 입력하세요:");
        int b = scanner.nextInt();
        System.out.println("세 번째 수를 입력하세요:");
        int c = scanner.nextInt();
        if (a <= b && a <= c) {
            System.out.println(a);
            if (b <= c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
            // 만약 b가 a와 c보다 작거나 같다면 b가 가장 작은 숫자입니다.
        } else if (b <= a && b <= c) {
            System.out.println(b);
            // 그 다음으로 작은 숫자를 찾아 출력합니다. a와 c를 비교하여 작은 숫자를 출력합니다.
            if (a <= c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
            // a와 b가 c보다 크다면 c가 가장 작은 숫자입니다.
        } else {
            System.out.println(c);
            // 그 다음으로 작은 숫자를 찾아 출력합니다. a와 b를 비교하여 작은 숫자를 출력합니다.
            if (a <= b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }//else
        // 사용자로부터의 입력을 더 이상 필요하지 않으므로, Scanner를 닫아줍니다.
        // 이렇게 하지 않으면 사용하지 않는 리소스가 계속 열려있게 되어 메모리 누수가 발생할 수 있습니다.
        scanner.close();
    }//calculator
}//class

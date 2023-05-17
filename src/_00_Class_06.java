public class _00_Class_06 {
    public static void main(String[] args) {
        data d = new data();
        d.x = 10;
        System.out.println("d.x : "+d.x);
        System.out.println("----------");
        d.x = change(d.x);
        System.out.println("change d.x :" + d.x);
    }
    static int change(int x) {
        x= 1000;
        System.out.println("x : "+ x);
        return x;
    }

}

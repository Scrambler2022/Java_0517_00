public class _00_Class_01 {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        c1.width = 500;
        c1.number= 25;
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        Card c3 = new Card();
        System.out.println("c1 카드종류 : "+ c1.kind);
        System.out.println("c1 카드종류 : "+ c1.number);
        System.out.println("c1 가로길이 : "+ Card.width);
        System.out.println("c1 가로길이 : "+ Card.height);
        System.out.println("-----------------------");
        System.out.println("c1 카드종류 : "+ c2.kind);
        System.out.println("c1 카드종류 : "+ c2.number);
        System.out.println("c1 가로길이 : "+ Card.width);
        System.out.println("c1 가로길이 : "+ Card.height);
        System.out.println("-----------------------");
        System.out.println("c3 가로길이 : "+ Card.width);
    }
}
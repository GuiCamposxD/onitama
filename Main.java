public class Main {
    public static void main(String[] args) {
        Position[] p = new Position[]{new Position(1, 0)};
        Card card = new Card("Tiger", Color.BLUE, p);

        System.out.println(card.getName());
    }
}

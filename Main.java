public class Main {
    public static void main(String[] args) {
        Card[] cartas = new Card[2];

        Position[] posicoes = new Position[10];

        Card tigre = new Card("tigre", Color.RED, posicoes);
        Card gansa = new Card("gansa", Color.RED, posicoes);
        Card pato = new Card("pato", Color.RED, posicoes);

        cartas[0] = tigre;
        cartas[1] = gansa;

        Player p1 = new Player("Guilherme", Color.RED, cartas);

        for (int i = 0; i < cartas.length; i++)
            System.out.println(p1.getCards()[i].getName());

        System.out.println("--------------------------------------------------------------------------------");

        p1.swapCard(tigre, gansa);

        for (int i = 0; i < cartas.length; i++)
            System.out.println(p1.getCards()[i].getName());

        System.out.println("--------------------------------------------------------------------------------");

        p1.swapCard(gansa, tigre);

        for (int i = 0; i < cartas.length; i++)
            System.out.println(p1.getCards()[i].getName());

        System.out.println("--------------------------------------------------------------------------------");
    }
}

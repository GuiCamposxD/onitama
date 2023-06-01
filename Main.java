import java.util.List;
public class Main {
    public static void main(String[] args) {
        Card[] cartas = new Card[2];

        Position[] posicoesTigre = new Position[2];
        Position[] posicoesGansa = new Position[4];

        posicoesTigre[0] = new Position(-1, 0);
        posicoesTigre[1] = new Position(1, 0);

        Card tigre = new Card("tigre", Color.RED, posicoesTigre);
        Card gansa = new Card("gansa", Color.RED, posicoesGansa);

        cartas[0] = tigre;
        cartas[1] = gansa;

        Player p1 = new Player("Guilherme", Color.RED, cartas);

        System.out.print("O nome das Cartas Do Jogador " + p1.getName() + " São: ");
        for (int i = 0; i < cartas.length; i++)
            System.out.print(p1.getCards()[i].getName() + " ");

        System.out.println();

        System.out.println("--------------------------------------------------------------------------------");

        Card[] c = Card.createCards();
    }
}

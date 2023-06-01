import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Classe que contém informações das cartas
 */
public class Card {
    private final String nome;
    private final Color cor;
    private final Position[] positions;

    /**
     * Construtor que define os principais atributos de uma cara
     * @param name Nome da carta
     * @param color Cor da carta
     * @param positions Todas as posições relativas de movimento
     */
    public Card(String name, Color color, Position[] positions) {
        this.nome = name;
        this.cor = color;
        this.positions = positions;
    }

    /**
     * Método que devolve o nome da carta
     * @return String que contém o nome da carta
     */
    public String getName() {
        return this.nome;
    }

    /**
     * Método que devolve a cor da carta
     * @return Enum Color que contém a cor da carta
     */
    public Color getColor() {
        return this.cor;
    }

    /**
     * Método que devolve todas as possíveis posições relativas de movimento.
     * A posição atual da peça é o ponto de origem (0,0). Uma carta possui as possíveis posições de movimento em relação ao ponto de origem.
     * @return Um array de Position contendo todas as possíveis posições de movimento em relação ao ponto de origem
     */
    public Position[] getPositions() {
        return this.positions;
    }

    /**
     * Método que cria todas as cartas do jogo, embaralha-as e devolve as 5 que serão utilizadas na partida.
     * @return Vetor de cartas com todas as cartas do jogo
     */
    public static Card[] createCards() {
        Integer[][] tigerPositions = new Integer[2][2];
        tigerPositions[0][0] = -1;
        tigerPositions[0][1] = 0;
        tigerPositions[1][0] = 1;
        tigerPositions[1][1] = 0;
        Position[] pTiger = createPositionCard(2, tigerPositions);
        Card tiger = new Card("Tiger", Color.NONE, pTiger);

        Integer[][] frogPositions = new Integer[3][2];
        frogPositions[0][0] = 1;
        frogPositions[0][1] = 1;
        frogPositions[1][0] = -1;
        frogPositions[1][1] = 0;
        frogPositions[2][0] = 0;
        frogPositions[2][1] = -2;
        Position[] pFrog = createPositionCard(3, frogPositions);
        Card frog = new Card("Frog", Color.NONE, pFrog);

        Integer[][] crabPositions = new Integer[3][2];
        crabPositions[0][0] = 0;
        crabPositions[0][1] = -2;
        crabPositions[1][0] = 1;
        crabPositions[1][1] = 0;
        crabPositions[2][0] = 0;
        crabPositions[2][1] = 2;
        Position[] pCrab = createPositionCard(3, crabPositions);
        Card crab = new Card("Crab", Color.NONE, pCrab);

        Integer[][] goosePositions = new Integer[4][2];
        goosePositions[0][0] = 0;
        goosePositions[0][1] = 1;
        goosePositions[1][0] = 1;
        goosePositions[1][1] = 1;
        goosePositions[2][0] = 0;
        goosePositions[2][1] = -1;
        goosePositions[3][0] = -1;
        goosePositions[3][1] = -1;
        Position[] pGoose = createPositionCard(4, goosePositions);
        Card goose = new Card("Goose", Color.NONE, pGoose);

        Integer[][] dragonPositions = new Integer[4][2];
        dragonPositions[0][0] = 1;
        dragonPositions[0][1] = 1;
        dragonPositions[1][0] = -1;
        dragonPositions[1][1] = -2;
        dragonPositions[2][0] = 1;
        dragonPositions[2][1] = 1;
        dragonPositions[3][0] = -1;
        dragonPositions[3][1] = 2;
        Position[] pDragon = createPositionCard(4, dragonPositions);
        Card dragon = new Card("Dragon", Color.NONE, pDragon);

        Integer[][] rabbitPositions = new Integer[3][2];
        rabbitPositions[0][0] = 1;
        rabbitPositions[0][1] = 1;
        rabbitPositions[1][0] = -1;
        rabbitPositions[1][1] = 1;
        rabbitPositions[2][0] = 0;
        rabbitPositions[2][1] = 2;
        Position[] pRabbit = createPositionCard(3, rabbitPositions);
        Card rabbit = new Card("Rabbit", Color.NONE, pRabbit);

        Integer[][] elephantPositions = new Integer[4][2];
        elephantPositions[0][0] = 0;
        elephantPositions[0][1] = -1;
        elephantPositions[1][0] = -1;
        elephantPositions[1][1] = -1;
        elephantPositions[2][0] = 0;
        elephantPositions[2][1] = 1;
        elephantPositions[3][0] = 1;
        elephantPositions[3][1] = 1;
        Position[] pElephant = createPositionCard(4, elephantPositions);
        Card elephant = new Card("Eelephant", Color.NONE, pElephant);

        Integer[][] roosterPositions = new Integer[4][2];
        roosterPositions[0][0] = 0;
        roosterPositions[0][1] = -1 ;
        roosterPositions[1][0] = 1;
        roosterPositions[1][1] = -1;
        roosterPositions[2][0] = 0;
        roosterPositions[2][1] = 1;
        roosterPositions[3][0] = -1;
        roosterPositions[3][1] = 1;
        Position[] pRooster = createPositionCard(4, roosterPositions);
        Card rooster = new Card("crab", Color.NONE, pRooster);

        Card[] cardArray = {tiger, frog, crab, goose, dragon, rabbit, elephant, rooster};
        List<Card> cards = Arrays.asList(cardArray);
        Collections.shuffle(cards);

        return cardArray;
    }

    public static Position[] createPositionCard(int numberOfPositions, Integer[][] matrizPosition) {
        Position[] arrayPositions = new Position[numberOfPositions];

        for (int i = 0; i < numberOfPositions; i++) {
            for (int j = 0; j < 2; j++) {
                arrayPositions[i] = new Position(matrizPosition[i][0], matrizPosition[0][j]);
            }
        }

        return arrayPositions;
    }
}
/**
 * Classe que contém informações e ações básicas relacionadas aos jogadores
 */
public class Player {
    private String name;
    private Color piecesColor;
    private Card[] cards;

    /**
     * Construtor que define informações básicas do jogador
     * @param name Nome do jogador
     * @param pieceColor Cor das peças do jogador
     * @param cards Cartas na mão do jogador
     */
    public Player(String name, Color pieceColor, Card[] cards) {
        this.setName(name);
        this.setPiecesColor(pieceColor);
        this.setCards(cards);
    }

    /**
     * Construtor que define informações básicas do jogador
     * @param name Nome do jogador
     * @param pieceColor Cor das peças do jogador
     * @param card1 A primeira carta na mão do jogador
     * @param card2 A segunda carta na mão do jogador
     */
    public Player(String name, Color pieceColor, Card card1, Card card2) {
        this.cards = new Card[2];
        this.setName(name);
        this.setPiecesColor(pieceColor);
        this.cards[0] = card1;
        this.cards[1] = card2;
    }

    /**
     * Método que devolve o nome do jogador(a)
     * @return String com o nome do jogador(a)
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método que devolve a cor das peças do jogador
     * @return Enum Color com a cor das peças do jogador
     */
    public Color getPieceColor() {
        return this.piecesColor;
    }

    /**
     * Método que devolve as cartas da mão do jogador
     * @return Booleano true para caso seja um mestre e false caso contrário
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Método que troca uma carta da mão por outra carta (idealmente da mesa)
     * @param oldCard A carta que será substituída
     * @param newCard A carta que irá substituir
     * @exception InvalidCardException Caso a carta não esteja na mão do jogador e/ou na mesa
     */
    protected void swapCard(Card oldCard, Card newCard) throws InvalidCardException {
        for (int i = 0; i < getCards().length; i++) {
            if (this.getCards()[i].getName().equals(oldCard.getName())) {
                this.getCards()[i] = newCard;
                return;
            }
        }

        throw new InvalidCardException("Não foi possível efetuar a troca, pois a carta não está na mão do jogador.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPiecesColor(Color piecesColor) {
        this.piecesColor = piecesColor;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }
}

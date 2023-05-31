/**
 * Classe que contém informações e ações básicas relacionadas aos jogadores
 */
public class Player {
    private String nome;
    private Color corDasPecas;
    private Card[] cartas;

    /**
     * Construtor que define informações básicas do jogador
     * @param name Nome do jogador
     * @param pieceColor Cor das peças do jogador
     * @param cards Cartas na mão do jogador
     */
    public Player(String name, Color pieceColor, Card[] cards) {
        this.setNome(name);
        this.setCorDasPecas(pieceColor);
        this.setCartas(cards);
    }

    /**
     * Construtor que define informações básicas do jogador
     * @param name Nome do jogador
     * @param pieceColor Cor das peças do jogador
     * @param card1 A primeira carta na mão do jogador
     * @param card2 A segunda carta na mão do jogador
     */
    public Player(String name, Color pieceColor, Card card1, Card card2) {
        this.cartas = new Card[2];
        this.nome = name;
        this. corDasPecas = pieceColor;
        this.cartas[0] = card1;
        this.cartas[1] = card2;
    }

    /**
     * Método que devolve o nome do jogador(a)
     * @return String com o nome do jogador(a)
     */
    public String getName() {
        return this.nome;
    }

    /**
     * Método que devolve a cor das peças do jogador
     * @return Enum Color com a cor das peças do jogador
     */
    public Color getPieceColor() {
        return this.corDasPecas;
    }

    /**
     * Método que devolve as cartas da mão do jogador
     * @return Booleano true para caso seja um mestre e false caso contrário
     */
    public Card[] getCards() {
        return this.cartas;
    }

    /**
     * Método que troca uma carta da mão por outra carta (idealmente da mesa)
     * @param oldCard A carta que será substituída
     * @param newCard A carta que irá substituir
     * @exception InvalidCardException Caso a carta não esteja na mão do jogador e/ou na mesa
     */
    protected void swapCard(Card oldCard, Card newCard) throws InvalidCardException {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCorDasPecas(Color corDasPecas) {
        this.corDasPecas = corDasPecas;
    }

    public void setCartas(Card[] cartas) {
        this.cartas = cartas;
    }
}

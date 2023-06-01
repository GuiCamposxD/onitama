/**
 * Classe usada para definição de estrutura de posições e movimentos do jogo
 */
public class Position {
    private final int linha;
    private final int coluna;

    /**
     * Construtor que define o valor da Linha e da Coluna da posição, baseado no plano cartesiano]
     * @param row Linha
     * @param col Coluna
     */
    public Position(int row, int col) {
        this.linha = row;
        this.coluna = col;
    }

    /**
     * Método que devolve o valor do eixo X da posição
     * @return Um valor int representando o eixo X
     */
    public int getRow() {
        return this.linha;
    }

    /**
     * Método que devolve o valor do eixo Y da posição
     * @return Um valor int representando o eixo Y
     */
    public int getCol() {
        return this.coluna;
    }
}

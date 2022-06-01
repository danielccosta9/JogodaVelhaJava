package jogovelha;

public interface Interface {
    public String [] [] tabuleiroJogo();
    public String mostrarTabuleiro();
    public String ganhador(int jogadas);
    public boolean posicaoTabela(String posicao);
    public void jogadasPosicao(String posicao, String jogadas);
}

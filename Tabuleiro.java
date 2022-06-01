package jogovelha;

public class Tabuleiro implements Interface {

    private String[][] tabuleiro = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

    @Override
    public String [] [] tabuleiroJogo(){
        return tabuleiro;
    }

    @Override
    public String mostrarTabuleiro() {
        System.out.println("");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("   " + tabuleiro[linha][coluna]);
            }
            System.out.println("\n");
        }
        return "";
    }

    @Override
    public boolean posicaoTabela(String posicao){
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (tabuleiro[linha] [coluna].equals(posicao))
                    return true;
                }
            }
        return false;
    }

    @Override
    public void jogadasPosicao(String posicao, String jogadas) {
        if(posicao.equals("1")){
            tabuleiro[0][0] = jogadas;
        }else if(posicao.equals("2")){
            tabuleiro[0][1] = jogadas;
        }else if(posicao.equals("3")){
            tabuleiro[0][2] = jogadas;
        }else if(posicao.equals("4")){
            tabuleiro[1][0] = jogadas;
        }else if(posicao.equals("5")){
            tabuleiro[1][1] = jogadas;
        }else if(posicao.equals("6")){
            tabuleiro[1][2] = jogadas;
        }else if(posicao.equals("7")){
            tabuleiro[2][0] = jogadas;
        }else if(posicao.equals("8")){
            tabuleiro[2][1] = jogadas;
        }else if(posicao.equals("9")){
            tabuleiro[2][2] = jogadas;
        }
    }

    @Override
    public String ganhador(int jogadas) {
       String[] tabu = new String[8];
       String vencedor = "null";
       if(jogadas == 9){
            vencedor = "EMPATE";
       }
       
       tabu[0] = tabuleiro[0] [0] + tabuleiro[0] [1] + tabuleiro[0] [2];
       tabu[1] = tabuleiro[1] [0] + tabuleiro[1] [1] + tabuleiro[1] [2];
       tabu[2] = tabuleiro[2] [0] + tabuleiro[2] [1] + tabuleiro[2] [2];
       tabu[3] = tabuleiro[0] [0] + tabuleiro[1] [0] + tabuleiro[2] [0];
       tabu[4] = tabuleiro[0] [1] + tabuleiro[1] [1] + tabuleiro[2] [1];
       tabu[5] = tabuleiro[0] [2] + tabuleiro[1] [2] + tabuleiro[2] [2];
       tabu[6] = tabuleiro[0] [0] + tabuleiro[1] [1] + tabuleiro[2] [2];
       tabu[7] = tabuleiro[0] [2] + tabuleiro[1] [1] + tabuleiro[2] [0];

       for(int i=0; i<tabu.length; i++){
           if(tabu[i].equals("XXX")){
               vencedor = "Jogador 1";
           }
           else if (tabu[i].equals("OOO")){
               vencedor = "Jogador 2";
           }
        }
       return vencedor;
    }
}


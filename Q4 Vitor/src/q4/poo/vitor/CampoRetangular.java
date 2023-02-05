package  q4.poo.vitor;

public class CampoRetangular {

    private Bola bola;
    private ParOrdenado posicaoCampo;
    private int comprimento, altura;

    public CampoRetangular(Bola bola, ParOrdenado posicaoCantoEsquerdo, int comprimento, int altura) {
        this.bola = bola;
        this.posicaoCampo = posicaoCantoEsquerdo;
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public Bola getBola() {
        return bola;
    }

    public ParOrdenado getPosicaoCampo() {
        return posicaoCampo;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public boolean bolaTocaBordaEsquerda() {

        if (bola.getPosicaoDaBola().getX() <= posicaoCampo.getX()) {

            return true;
        }

        return false;

    }

    public boolean bolaTocaBordaDireita() {
        if (bola.getPosicaoDaBola().getX() >= comprimento) {
            return true;
        }

        return false;

    }

    public boolean bolaTocaBordaSuperior() {
        if (bola.getPosicaoDaBola().getY() <= posicaoCampo.getY()) {
            return true;
        }
        return false;
    }

    public boolean bolaTocaBordaInferior() {
        if (bola.getPosicaoDaBola().getY() >= altura) {
            return true;
        }
        return false;
    }

    
    public void movimentaBola() {

        bola.movimenta();

        if (bolaTocaBordaEsquerda()) {
            bola.setVelocidadeHorizontal(bola.getVelocidade().getX() *-1);
        }
        else if (bolaTocaBordaDireita()) {
            bola.setVelocidadeHorizontal(bola.getVelocidade().getX() *-1);
        }
        else if (bolaTocaBordaSuperior()) {
            bola.setVelocidadeVertical(bola.getVelocidade().getY() *-1);
        }
        else if (bolaTocaBordaInferior()) {
            bola.setVelocidadeVertical(bola.getVelocidade().getY() *-1);
        }
    }

   
}

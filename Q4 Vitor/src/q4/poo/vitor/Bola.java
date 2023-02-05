package  q4.poo.vitor;

public class Bola {

    private ParOrdenado posicaoDaBola;
    private ParOrdenado velocidade;
    private final double Raio;

    public Bola(int posicaoX, int posicaoY, int velocidadeX, int velocidadeY, double raio) {
        this.posicaoDaBola = new ParOrdenado(posicaoX, posicaoY);
        this.velocidade = new ParOrdenado(velocidadeX, velocidadeY);
        this.Raio = raio;
    }

    public ParOrdenado getVelocidade() {
        return velocidade;
    }

    public void setVelocidadeHorizontal(int velocidadeX) {
        this.velocidade.setX(velocidadeX);
    }

    public void setVelocidadeVertical(int velocidadeY) {
        this.velocidade.setY(velocidadeY);
    }

    public ParOrdenado getPosicaoDaBola() {
        return posicaoDaBola;
    }

    public double getRaio() {
        return Raio;
    }

    public void movimenta() {
        this.posicaoDaBola.setX(posicaoDaBola.getX()+velocidade.getX());
        this.posicaoDaBola.setY(posicaoDaBola.getY()+velocidade.getY());
    }

    @Override
    public String toString() {
        return "A bola está na posição " + posicaoDaBola.toString() + " se movendo a uma velocidade " + velocidade
                + " pixels por movimento";
    }

}

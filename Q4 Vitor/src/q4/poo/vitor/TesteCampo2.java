package  q4.poo.vitor;

import java.util.Scanner;

public class TesteCampo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ParOrdenado dimensoesCampo = new ParOrdenado(0, 0);
        ParOrdenado posicaoCampo = new ParOrdenado(0, 0);

        double raio;

        System.out.println("Insira a altura do campo: ");
        dimensoesCampo.setY(entrada.nextInt());
        System.out.println("Insira a largura do campo: ");
        dimensoesCampo.setX(entrada.nextInt());
        System.out.println("Insira o raio da bola: ");
        raio = entrada.nextDouble();

        double randomX = 5 + (int) (6 * Math.random());
        double percentualX = (randomX / 100);

        double randomY = 5 + (int) (6 * Math.random());
        double percentualY = (randomY / 100);

        Double velox = (percentualX * dimensoesCampo.getX());
        Double veloy = (percentualY * dimensoesCampo.getY());

        int velocidadeX = velox.intValue();
        int velocidadeY = veloy.intValue();

        Bola bola = new Bola(dimensoesCampo.getX() / 2, dimensoesCampo.getY() / 2, velocidadeX, velocidadeY, raio);

        CampoRetangular campo = new CampoRetangular(bola, posicaoCampo, dimensoesCampo.getX(), dimensoesCampo.getY());

        System.out.println("Posição inicial da bola :"+ bola.toString());

        for (int i = 0; i <30; i++) {
            TesteCampo.movimenta_Exibe(campo, bola);

        }
    }
}

package  q4.poo.vitor;

import java.util.Scanner;

public class TesteCampo {

    public static void movimenta_Exibe(CampoRetangular campo, Bola bola) {
        
        campo.movimentaBola();
        System.out.println(bola.toString());
    }
    
    public static void main(String[] args) {

        

        ParOrdenado posicaoCampo = new ParOrdenado(0, 0);
        ParOrdenado dimensoesCampo = new ParOrdenado(0, 0);
        ParOrdenado posicaoBola = new ParOrdenado(0, 0);
        ParOrdenado velocidadeBola = new ParOrdenado(0, 0);
        double raio;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o eixo X da posição do campo: ");
        posicaoCampo.setX(entrada.nextInt());
        System.out.println("Insira o eixo Y da posição do campo: ");
        posicaoCampo.setY(entrada.nextInt());

        System.out.println("Insira o comprimento do campo: ");
        dimensoesCampo.setX(entrada.nextInt());
        System.out.println("Insira a altura do campo: ");
        dimensoesCampo.setY(entrada.nextInt());

        System.out.println("Insira o eixo X da posição da bola: ");
        posicaoBola.setX(entrada.nextInt());
        System.out.println("Insira o eixo Y da posição da bola: ");
        posicaoBola.setY(entrada.nextInt());

        System.out.println("Insira a velocidade horizontal da bola: ");
        velocidadeBola.setX(entrada.nextInt());
        System.out.println("Insira a velocidade vertical da bola: ");
        velocidadeBola.setY(entrada.nextInt());
        System.out.println("Insira o raio da bola: ");
        raio = entrada.nextDouble();

        
        Bola bola = new Bola(posicaoBola.getX(), posicaoBola.getY(), velocidadeBola.getX(), velocidadeBola.getY(),raio);
        
        CampoRetangular campo = new CampoRetangular(bola, posicaoCampo, dimensoesCampo.getX(), dimensoesCampo.getY());

        System.out.println("Posição inicial da bola :"+ bola.toString());

        for (int i = 0; i < 30; i++) {
            movimenta_Exibe(campo, bola);    
        }
        
        
    }


    
}

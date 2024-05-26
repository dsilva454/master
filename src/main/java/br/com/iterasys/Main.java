//1 - Pacote
package br.com.iterasys;
//2 - Referencias as bibliotecas

//3 - Classe
public class Main {
    //3.1 - Atributos - caracteristicas

    //3.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Meu primeiro codigo em java!!!");
        System.out.println("Calculo de Areas");
        System.out.println("Boa noite!!");
    }

    public void calcularAreaModoextenso(){

        //Calculo de area - Exemplo o tamanho do tapete ou do piso

        //definaição das váriaveis
        int largura;
        int comprimento;
        int resultado;

        //Atribuição de valores para o calculo

        largura = 25;
        comprimento = 30;

        resultado = largura * comprimento;

        System.out.println("Para largura de " + largura + " e o comprimento de "
                + comprimento + " A area e de " + resultado + " m2");
    }

    public void calcularAreaModoCompacto(){
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para largura de " + largura + " e o comprimento de "
                + comprimento + " A area e de " + largura * comprimento + " m2");
    }
}
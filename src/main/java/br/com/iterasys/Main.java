//1 - Pacote
package br.com.iterasys;
//2 - Referencias as bibliotecas

import java.sql.SQLOutput;
import java.util.Scanner;

//3 - Classe
public class Main {
    //3.1 - Atributos - caracteristicas

    //3.2 - Métodos e Funções
    public static void main(String[] args) {
           switchCase();
    }

    //metodo switch/case
    public static void switchCase(){
        // Condicional = Verificar uma condicao - fazer uma pergunta para uma pessoa, um hardware ou software

        //Utilizar a clase Scanner do java para ler a escolha do usuario no console

        // instanciar uma entrada do sistema
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU DE OPÇÕES");
        System.out.println("c - Calcular Area modo compacto");
        System.out.println("e - Calcular Area modo extenso");
        System.out.println("i - IfSimples");
        System.out.println("Digite a opçao desejada: ");

        String opcao = scanner.next();

        //switch - selecionar o comportamento do programa  conforme a escola da pessoa ou do software

        //String opcao = "curto";

        switch (opcao){
            case  "i":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case  "c":
                System.out.println("Você escolheu executar o método compacto");
                calcularAreaModoCompacto();
                break;
            case  "e":
                System.out.println("Você escolheu executar o método extenso");
                calcularAreaModoextenso();
                break;
            default:
                System.out.println("Você não escolheu um método válido");
                break;
        }

    }

    // metodo if/else simples

    public static void ifSimples(){
        // Condicional = Verificar uma condicao - fazer uma pergunta para uma pessoa, um hardware ou software

        // if = se
        // else = se nao

        String modo = "curto";

        if(modo == "curto"){
            calcularAreaModoCompacto();
        }
        else {
            calcularAreaModoextenso();
        }
    }

    //--------------------------------------------------------------------------------
    //Criar metodo extenso para calculo de area.

    public static void calcularAreaModoextenso(){

        //Calculo de area - Exemplo o tamanho do tapete ou do piso

        System.out.println("Calculo de Areas modo extenso");

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
// Criar metodo compacto para calculo de area.

    public static void calcularAreaModoCompacto(){

        System.out.println("Calculo de Areas compacto");

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para largura de " + largura + " e o comprimento de "
                + comprimento + " A area e de " + largura * comprimento + " m2");
    }
}
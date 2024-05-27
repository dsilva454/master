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
        System.out.println("c ou C - Calcular Area modo compacto");
        System.out.println("d ou D - Contar Ate 10");
        System.out.println("e ou E - Calcular Area modo extenso");
        System.out.println("i ou I - IfSimples");
        System.out.println("r ou R - Contagem Regressiva");
        System.out.println("Digite a opçao desejada: ");

        String opcao = scanner.next();

        //switch - selecionar o comportamento do programa  conforme a escola da pessoa ou do software

        //String opcao = "curto";

        switch (opcao){
            case  "c":
            case  "C":
                System.out.println("Você escolheu executar o método compacto");
                calcularAreaModoCompacto();
                break;
            case  "d":
            case  "D":
                System.out.println("Você escolheu contar Ate 10");
                contarAteDez();
                break;
            case  "e":
            case  "E":
                System.out.println("Você escolheu executar o método extenso");
                calcularAreaModoextenso();
                break;
            case  "i":
            case  "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case  "r":
            case  "R":
                System.out.println("Você escolheu Contagem regressiva");
                contarDeDezAZero();
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

    //Metodo contagem progressiva

    public static void contarAteDez(){
        // Loops ou Repetições
        // for = repetição incondicional

        System.out.println("Contagem crescente");

        for (int numero = 1; numero < 11; numero++){
            System.out.println(numero);
        }
    }

    //Método contagem regressiva

    public static void contarDeDezAZero(){
        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);
        }
    }
}
package Questao03;

import java.util.Scanner;
public class CalculadoraMain {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int op;
        String repetir;

        do{
            System.out.println("====< Calculadora Java >===");
            System.out.println("Escolha a operação desejada: ");
            System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
            op = input.nextInt();
            input.nextLine();
            switch (op){

                case 1: calc.somar(); break;
                case 2: calc.subtrair(); break;
                case 3: calc.multiplicar(); break;
                case 4: calc.dividir(); break;
            }
            System.out.println("Deseja repetir? (S ou N): ");
            repetir = input.nextLine();

        }while(repetir.equalsIgnoreCase("S"));
        System.out.println("*".repeat(50));
        System.out.println("Obrigado por usar a Questao03.Calculadora Java");
    }
}

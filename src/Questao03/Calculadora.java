package Questao03;

import java.util.Scanner;
public class Calculadora {

    int total, n1, n2;
    Scanner input = new Scanner(System.in);
    public void somar(){
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();

        total = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + total);
    }

    public void subtrair(){
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();
        input.nextLine();
        total = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + total);
    }

    public void multiplicar(){
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();
        total = n1 * n2;
        System.out.println(n1 + " x " + n2 + " = " + total);
    }

    public void dividir(){
        System.out.println("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();

        total = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + total);
    }
}

package Questao02;

import java.util.Scanner;

public class MediaAlunoMain {
    public static void main(String[] args){
        double soma = 0;
        int qtNotas = 0;
        String situacao, repetir, nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora de média do aluno!");
        System.out.print("Insira o nome do aluno: ");
        nome = sc.nextLine();

        do{
            System.out.print("Insira uma nota do aluno: ");
            double nota = sc.nextDouble();
            if(nota < 0 || nota > 10 ){
                System.out.println("Digite uma nota válida (entre 0 e 10)");
            }else{
                soma += nota;
                qtNotas++;
            }

            System.out.print("Deseja inserir outra nota? ('S' ou 'N'): ");
            repetir = sc.next();
        }while(repetir.equalsIgnoreCase("S"));

        double media = soma / qtNotas;
        if(media >= 7){
            situacao = "Aprovado!";
        }else if (media <= 4){
            situacao = "Reprovado!";
        }else{
            situacao = "Vai pra final!";
        }

        System.out.println("Aluno: " + nome);
        System.out.println("Média das notas: " + media);
        System.out.println("Situação: " + situacao);
        System.out.println("*".repeat(50));

    }
}

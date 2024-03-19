package Questao01;

public class Funcionario {
    String nome;
    int matricula;
    double salarioBruto, inss, salarioLiquido;

    public void desconto(){
         inss = salarioBruto * 0.15;
         salarioLiquido = salarioBruto - inss;
    }

    public void detalhes(){
        System.out.println("*".repeat(60));
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Desconto do INSS: R$" + inss);
        System.out.println("Salário líquido: R$" + salarioLiquido);
    }
}

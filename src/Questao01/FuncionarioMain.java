package Questao01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FuncionarioMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        String repetir;


        do {

            Funcionario funcionario = new Funcionario();

            System.out.print("Digite o nome do funcionário: ");
            funcionario.nome = sc.nextLine();
            System.out.print("Digite a matrícula: ");
            funcionario.matricula = sc.nextInt();
            System.out.print("Digite o salário bruto: R$");
            funcionario.salarioBruto = sc.nextDouble();

            funcionario.desconto();

            funcionarios.add(funcionario);

            sc.nextLine();

            System.out.println("Deseja cadastrar outro funcionário? (Digite 'S' ou 'N': ");
            repetir = sc.nextLine();

        } while (repetir.equalsIgnoreCase("S"));

        System.out.println("Detalhes dos funcionários cadastrados: ");

        for (Funcionario func : funcionarios) {
            func.detalhes();
        }
        sc.close();
    }
}

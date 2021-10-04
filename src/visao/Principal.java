package visao;

import modelo.*;
import controle.Controle;
import java.util.Scanner;

public class Principal {
    public static void main (String []args){
        int op = 0;
        Controle ctrl = new Controle();
        Scanner input = new Scanner(System.in);
        ProfessorHorista profHr;
        ProfessorDE proDe;
        System.out.println("Iniciando sistema...");

        while (op != 9){
            System.out.println("1-Incluir professor");
            System.out.println("2-Listar Professores");
            System.out.println("3-Apresentar dados dos professores");
            System.out.println("9-Fim");
            op = input.nextInt(); input.nextLine();

            switch(op){
                case 1:
                    System.out.println("Informe o tipo de professor\n1-Horista\n2-Dedicado");
                    int tipo = input.nextInt(); input.nextLine();
                    System.out.println("Informe o nome: ");
                    String nome = input.nextLine();
                    System.out.println("Informe a matricula: ");
                    String matricula = input.nextLine();
                    System.out.println("Informe o salário: ");
                    double salario = input.nextDouble();
                    switch (tipo){
                        case 1:
                            System.out.println("Informe as horas trabalhadas");
                            double horas = input.nextDouble();
                            ctrl.incluirProfessor(new ProfessorHorista(nome,matricula,salario,horas));
                            break;
                        case 2:
                            System.out.println("Informe a quantidade de licenças prêmio");
                            int licenca = input.nextInt();
                            ctrl.incluirProfessor(new ProfessorDE(nome,matricula,salario,licenca) );
                            break;
                    }

                    break;
                case 2:
                    System.out.println(ctrl.listarProfessores());
                    break;
                case 3:
                    System.out.println(ctrl.mostraDados());
                    break;
                case 9:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;


            }

        }

    }
}

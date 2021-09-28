import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main (String []args){
        Scanner entry = new Scanner(System.in);
        ArrayList<Professor> listaProf = new ArrayList<>();
        int op = 0;
        while (op != 9){
            System.out.println("1-Cadastrar Professor Horista");
            System.out.println("2-Cadastrar Professor DE");
            System.out.println("3-Consultar através da matricula");
            System.out.println("9-Fim");
            op = entry.nextInt(); entry.nextLine();

        switch (op){
            case 1 :
                String nome;
                String matricula = "";
                int salario;
                int horas;
                System.out.println("Informe o nome:");
                nome = entry.nextLine();
                System.out.println("Informe a matricula");
                matricula = entry.nextLine();
                System.out.println("Informe o salario");
                salario = entry.nextInt();
                System.out.println("Informe as horas trabalhadas");
                horas = entry.nextInt();
                listaProf.add(new ProfessorHorista(nome,matricula,salario,horas));
                break;
            case 2:
                String nome2;
                String matricula2 = "";
                int salario2;
                int premio;
                System.out.println("Informe o nome:");
                nome = entry.nextLine();
                System.out.println("Informe a matricula");
                matricula = entry.nextLine();
                System.out.println("Informe o salario");
                salario = entry.nextInt(); entry.nextLine();
                System.out.println("Informe a quantidade de licenças prêmio");
                premio = entry.nextInt(); entry.nextLine();
                listaProf.add(new ProfessorDE(nome,matricula,salario,premio));
                break;

            case 3:
                boolean achouProf = false;
                Professor prof;
                System.out.println("Informe a matrícula do professor a ser consultado");
                String matricula3 = entry.nextLine();
                for (int i = 0; i < listaProf.size();i++){
                    prof = listaProf.get(i);
                    if (prof.getMatricula().equals(matricula3)){
                        System.out.println("Nome: " + prof.getNome() + "\n" + "Salario: " + prof.getSalario());
                        achouProf = true;
                        break;
                    }
                }
                if (!achouProf){
                    System.out.println("Professor não cadastrado");
                }
                break;
        }

        }
    }
}

package controle;
import modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Controle {
    Scanner input = new Scanner(System.in);
    ArrayList<Professor> listaProfessor;
    

    public Controle(){
        listaProfessor = new ArrayList<Professor>();
    }

    public void incluirProfessor(Professor prof){
       listaProfessor.add(prof);
    }

    public String listarProfessores(){
        String saida = "";
        Professor prof;
            for (int i = 0; i < listaProfessor.size();i++){
                prof = listaProfessor.get(i);
                saida += "Nome: " + prof.getNome() + " Salário: " + prof.getSalario() + "\n";
            }
        return saida;
    }

    public ArrayList<Professor> arraylistProfessor(){
        return listaProfessor;
    }

    public String mostraDados(){
        String saida = "";
        Professor prof;
        for(int i = 0; i < listaProfessor.size();i++){
           prof = listaProfessor.get(i);
           saida += prof.getDados() + "\n";
        }
        return saida;
    }

}

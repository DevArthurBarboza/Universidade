package controle;

import modelo.*;
import java.util.ArrayList;

public class Controle {
    ArrayList<Professor> listaProfessor;

    public Controle(){
        listaProfessor = new ArrayList<Professor>();
    }

    public void incluirProfessor(Professor prof){
       listaProfessor.add(prof);
    }

    public String listarProfessores(){
        String saida = "";
        Professor aux;
            for (int i = 0; i < listaProfessor.size();i++){
                aux = listaProfessor.get(i);
                saida += "Nome: " + aux.getNome() + " Salário: " + aux.getSalario() + "\n";
            }
        return saida;
    }

    public ArrayList<Professor> arraylistProfessor(){
        return listaProfessor;
    }

    public String mostraDados(){
        String saida = "";
        Professor aux;
        for(int i = 0; i < listaProfessor.size();i++){
           aux = listaProfessor.get(i);
           saida += aux.getDados() + "\n";
        }
        return saida;
    }

    public String consultaProf(String matricula){
        String saida = "";
        Professor aux;
        boolean achouProf = false;
        for (int i = 0; i < listaProfessor.size();i++){
            aux = listaProfessor.get(i);
            if (aux.getMatricula().equals(matricula)){
                achouProf = true;
                saida = aux.getDados();
                break;
            }
        }

        if (achouProf){
            return saida;
        } else{
            return ("Não achou");
        }

    }

    public String testeIntancia(String matricula){
        Professor aux;
        boolean isTrue = false;
        for (int i=0; i <listaProfessor.size();i++){
            aux = listaProfessor.get(i);
            if ((aux.getMatricula().equals(matricula)) && (aux instanceof ProfessorDE)){
                    isTrue = true;
            } else {
                isTrue = false;
            }
        }

        if(isTrue){
            return "verdadeiro";
        } else {
            return null;
        }
    }


}

package modelo;

public class ProfessorHorista extends Professor {
    private double horasTrabalhadas;


    public ProfessorHorista(String nome, String matricula, double salario,double horas) {
        super(nome, matricula, salario);
        this.horasTrabalhadas = horas;
    }

    public void setHorasTrabalhadas(int horas){
        this.horasTrabalhadas = horas;
    }

    public double getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }

    public double getSalario(){
        return super.salario*horasTrabalhadas;
    }

    public String getDados(){
        return super.getDados() + "\nHoras trabalhadas :" + getHorasTrabalhadas();
    }
}

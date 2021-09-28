public class ProfessorHorista extends Professor{
    public int horasTrabalhadas;


    public ProfessorHorista(String nome, String matricula, int salario,int horas) {
        super(nome, matricula, salario);
        this.horasTrabalhadas = horas;
    }

    public void setHorasTrabalhadas(int horas){
        this.horasTrabalhadas = horas;
    }

    public int getHorasTrabalhadas(){
        return this.horasTrabalhadas;
    }

    public int getSalario(){
        return super.getSalario()*horasTrabalhadas;
    }
}

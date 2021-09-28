public class ProfessorDE extends Professor{
    private int licencaPremio;

    public ProfessorDE(String nome,String matricula,int salario, int qntdPremio){
        super(nome,matricula,salario);
        this.licencaPremio = qntdPremio;
    }

    public void setQntdPremio(int qntdPremio){
        this.licencaPremio = qntdPremio;
    }

    public int getQntdPremio(){
        return this.licencaPremio;
    }

}

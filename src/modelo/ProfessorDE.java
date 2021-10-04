package modelo;

public class ProfessorDE extends Professor {
    private int licencaPremio;

    public ProfessorDE(String nome,String matricula,double salario, int qntdPremio){
        super(nome,matricula,salario);
        this.licencaPremio = qntdPremio;
    }

    public void setQntdPremio(int qntdPremio){
        this.licencaPremio = qntdPremio;
    }

    public int getLicencaPremio(){
        return this.licencaPremio;
    }

    public String getDados(){
        return super.getDados() + "\nLicença Prêmio: " + getLicencaPremio();
    }

}

package modelo;

public class Professor {
    protected double salario;
    protected String nome;
    protected String matricula;

    public double getSalario(){
        return this.salario;
    }

    public String getDados(){
        return "Nome: " + getNome() + "\nSalário: " + getSalario() + "\nMatrícula:" + getMatricula();
    }

    public void setSalario(int novoSalario){
        this.salario = novoSalario;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setMatricula(String novaMatricula){
        this.matricula=novaMatricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public Professor(String nome, String matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

}

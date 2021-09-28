public class Professor {
    private int salario;
    private String nome;
    private String matricula;

    public int getSalario(){
        return this.salario;
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

    public Professor(String nome, String matricula, int salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

}

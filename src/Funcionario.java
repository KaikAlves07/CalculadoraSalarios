abstract class Funcionario {
    protected String nome;
    protected String experiencia;
    protected String tipoContratacao;

    public Funcionario(String nome, String experiencia, String tipoContratacao) {
        this.nome = nome;
        this.experiencia = experiencia;
        this.tipoContratacao = tipoContratacao;
    }

    public abstract double calcularSalarioBruto();

    public abstract double calcularSalarioLiquido();
}
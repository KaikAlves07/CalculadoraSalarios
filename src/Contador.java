class Contador extends Funcionario {
    private double salarioMensal;

    public Contador(String nome, String experiencia, String tipoContratacao, double salarioMensal) {
        super(nome, experiencia, tipoContratacao);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioMensal;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioBruto = calcularSalarioBruto();
        // Adicionar lógica para calcular o salário líquido
        return salarioBruto;
    }
}

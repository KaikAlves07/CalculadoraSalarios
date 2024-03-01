class Analista extends Funcionario {
    private double salarioBase;

    public Analista(String nome, String experiencia, String tipoContratacao, double salarioBase) {
        super(nome, experiencia, tipoContratacao);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioBruto = calcularSalarioBruto();
        // Adicionar lógica para calcular o salário líquido
        return salarioBruto;
    }
}
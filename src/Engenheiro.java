class Engenheiro extends Funcionario {
    private double horasTrabalhadas;
    private double precoBaseHora;

    public Engenheiro(String nome, String experiencia, String tipoContratacao, double horasTrabalhadas, double precoBaseHora) {
        super(nome, experiencia, tipoContratacao);
        this.horasTrabalhadas = horasTrabalhadas;
        this.precoBaseHora = precoBaseHora;
    }

    @Override
    public double calcularSalarioBruto() {
        return horasTrabalhadas * precoBaseHora;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioBruto = calcularSalarioBruto();
        // Adicionar lógica para calcular o salário líquido
        return salarioBruto;
    }
}

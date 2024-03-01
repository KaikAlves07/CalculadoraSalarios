public class CalculadoraSalario {
    public static double calcularSalario(Funcionario funcionario) {
        double salarioBruto = funcionario.calcularSalarioBruto();
        double salarioLiquido = funcionario.calcularSalarioLiquido();
        return salarioLiquido;
    }
}
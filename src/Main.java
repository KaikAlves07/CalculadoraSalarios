public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("João", "Pleno", "CLT", 160, 50.0);
        Analista analista = new Analista("Maria", "Júnior", "PJ", 5000.0);
        Contador contador = new Contador("José", "Sênior", "Horista", 4000.0);

        double salarioLiquidoEngenheiro = CalculadoraSalario.calcularSalario(engenheiro);
        double salarioLiquidoAnalista = CalculadoraSalario.calcularSalario(analista);
        double salarioLiquidoContador = CalculadoraSalario.calcularSalario(contador);

        System.out.println("Salário líquido do Engenheiro: " + salarioLiquidoEngenheiro);
        System.out.println("Salário líquido do Analista: " + salarioLiquidoAnalista);
        System.out.println("Salário líquido do Contador: " + salarioLiquidoContador);
    }
}
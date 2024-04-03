package strategy;

public class main {
    public static void main(String[] args) {
        Imposto iss = new CalcularIss();
        Imposto imcs = new CalcularImcs();

        Orcamento orcamento = new Orcamento(500.0);
        CalculadorDeImposto calculador = new CalculadorDeImposto();

        calculador.RealizaCalculo(orcamento, imcs);
        calculador.RealizaCalculo(orcamento, iss);
    }
}

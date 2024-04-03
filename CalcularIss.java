package strategy;

public class CalcularIss implements  Imposto{

    @Override
    public double Calcula(Orcamento orcamento) {
        return orcamento.valor * 0.06;
    }
}

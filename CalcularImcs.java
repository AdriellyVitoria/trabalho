package strategy;

public class CalcularImcs implements Imposto {
    @Override
    public double Calcula(Orcamento orcamento) {
        return orcamento.valor * 0.1;
    }
}

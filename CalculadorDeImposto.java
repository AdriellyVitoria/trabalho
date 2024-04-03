package strategy;

public class CalculadorDeImposto {
    public void RealizaCalculo( Orcamento orcamento, Imposto imposto){
            double icms = imposto.Calcula(orcamento);
            System.out.println(icms);
    }
}

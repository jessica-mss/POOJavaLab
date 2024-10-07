public class Boleto implements MetodoPagamento {

    String codigoBarras;


    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento  de R$" + valor + " realizado via boleto!");
    }

    @Override
    public String getDetalhesPagamento() {
        return "código de barras: " + codigoBarras;
    }
}

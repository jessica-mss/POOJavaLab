public class Paypal implements MetodoPagamento{

    String email;

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento  de R$" + valor + " realizado via Paypal");
    }

    @Override
    public String getDetalhesPagamento() {
        return "Pagamento efetuado pela conta de email " + email;
    }
}

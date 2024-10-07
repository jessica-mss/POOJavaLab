public class Main {
    public static void main(String[] args) {

        CartaoCredito cartaoCredito = new CartaoCredito();
        Boleto boleto = new Boleto();
        Paypal paypal = new Paypal();

        cartaoCredito.pagar(100);
        boleto.pagar(100);
        paypal.pagar(100);
    }
}
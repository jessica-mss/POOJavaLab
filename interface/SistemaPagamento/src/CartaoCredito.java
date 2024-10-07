import java.time.LocalDateTime;

public class CartaoCredito implements MetodoPagamento{

    int numeroCartao;
    String nomeTitular;
    String dataValidade;

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via cartão de crédito");
    }

    @Override
    public String getDetalhesPagamento() {
        return "Pagamento realizado dia " + dataValidade + " pelo cartão de número " + numeroCartao;
    }
}

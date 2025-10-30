public class PagamentoBoleto extends Pagamento{
    @Override
    public String processarPagamento(){
        return "Processando pagamento via boleto bancario...";
    }
}
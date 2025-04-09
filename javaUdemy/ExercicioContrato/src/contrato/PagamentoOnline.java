package contrato;

public interface PagamentoOnline {
	double taxaDePagamento(double quantia);
	double jurus(double quantia, int meses);
		
}

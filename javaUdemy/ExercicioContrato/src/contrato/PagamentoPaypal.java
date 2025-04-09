package contrato;

public class PagamentoPaypal implements PagamentoOnline {

	@Override
	public double taxaDePagamento(double quantia) {
		// TODO Auto-generated method stub
		return quantia * 0.02;
	}

	@Override
	public double jurus(double quantia, int meses) {
		// TODO Auto-generated method stub
		return quantia*0.01*meses;
	}
	
}

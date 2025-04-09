package contrato;

import java.time.LocalDate;

public class ServicoContrato {
	private PagamentoOnline pagamentoOnline;

	public ServicoContrato(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}
	
	
	
	public void ProcessoDePagamento(Contrato contrato, int meses) {
		double cotaBasica = contrato.getValorTotal()/meses;
		for(int i = 1; i<= meses; i++) {
			LocalDate dueData = contrato.getData().plusMonths(i); 
			double jurus = pagamentoOnline.jurus(cotaBasica, i);
			double parcela = pagamentoOnline.taxaDePagamento(cotaBasica + jurus);
			double cotaTotal = cotaBasica + jurus + parcela;
			
			contrato.getParcelas().add(new Parcela(dueData, cotaTotal));
		}
	}
	
}

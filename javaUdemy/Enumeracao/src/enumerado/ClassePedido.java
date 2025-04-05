package enumerado;

import java.util.Date;

public class ClassePedido {
	private Integer id;
	private Date momento;
	private Pedido situacao;
	
	
	
	public ClassePedido() {
	}
	
	public ClassePedido(Integer id, Date momento, Pedido situacao) {
		this.id = id;
		this.momento = momento;
		this.situacao = situacao;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public Pedido getSituacao() {
		return situacao;
	}
	public void setSituacao(Pedido situacao) {
		this.situacao = situacao;
	}
	
	
	@Override
	public String toString() {
		return "ClassePedido [id=" + id + ", momento=" + momento + ", situacao=" + situacao + "]";
	}
	
}

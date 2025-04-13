package Logs;

import java.util.Date;
import java.util.Objects;

public class EntradaLog {
	private String NomeUsuario;
	private Date momento;
	public EntradaLog(String nomeUsuario, Date momento) {
		NomeUsuario = nomeUsuario;
		this.momento = momento;
	}
	public EntradaLog() {
	}
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(NomeUsuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntradaLog other = (EntradaLog) obj;
		return Objects.equals(NomeUsuario, other.NomeUsuario);
	}
	
	
}

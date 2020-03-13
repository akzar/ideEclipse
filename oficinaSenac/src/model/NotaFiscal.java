package model;

import java.sql.Date;

public class NotaFiscal {
	private int codNotaFiscal;
	private String numNotaFiscal;
	private Date emissaoNotaFiscal;
	private Double valorNotaFiscal;
	private Servico notaFiscalServico;
	public int getCodNotaFiscal() {
		return codNotaFiscal;
	}
	public void setCodNotaFiscal(int codNotaFiscal) {
		this.codNotaFiscal = codNotaFiscal;
	}
	public String getNumNotaFiscal() {
		return numNotaFiscal;
	}
	public void setNumNotaFiscal(String numNotaFiscal) {
		this.numNotaFiscal = numNotaFiscal;
	}
	public Date getEmissaoNotaFiscal() {
		return emissaoNotaFiscal;
	}
	public void setEmissaoNotaFiscal(Date emissaoNotaFiscal) {
		this.emissaoNotaFiscal = emissaoNotaFiscal;
	}
	public Double getValorNotaFiscal() {
		return valorNotaFiscal;
	}
	public void setValorNotaFiscal(Double valorNotaFiscal) {
		this.valorNotaFiscal = valorNotaFiscal;
	}
	public Servico getNotaFiscalServico() {
		return notaFiscalServico;
	}
	public void setNotaFiscalServico(Servico notaFiscalServico) {
		this.notaFiscalServico = notaFiscalServico;
	}

}

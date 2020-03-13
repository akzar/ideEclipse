package model;

public class Revisao {
	private int codServico, idRevisao;
	private String tipoRevisao, descricaoRevisao;
	public int getCodServico() {
		return codServico;
	}
	public void setCodServico(int codServico) {
		this.codServico = codServico;
	}
	public int getIdRevisao() {
		return idRevisao;
	}
	public void setIdRevisao(int idRevisao) {
		this.idRevisao = idRevisao;
	}
	public String getTipoRevisao() {
		return tipoRevisao;
	}
	public void setTipoRevisao(String tipoRevisao) {
		this.tipoRevisao = tipoRevisao;
	}
	public String getDescricaoRevisao() {
		return descricaoRevisao;
	}
	public void setDescricaoRevisao(String descricaoRevisao) {
		this.descricaoRevisao = descricaoRevisao;
	}

}

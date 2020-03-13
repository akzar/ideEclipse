package model;

public class Avaliar {
	private int codServico, codRevisao;
	private ItemRevisao avaliarItemRevisao;
	private Revisao avaliarRevisao;
	public int getCodServico() {
		return codServico;
	}
	public void setCodServico(int codServico) {
		this.codServico = codServico;
	}
	public int getCodRevisao() {
		return codRevisao;
	}
	public void setCodRevisao(int codRevisao) {
		this.codRevisao = codRevisao;
	}
	public ItemRevisao getAvaliarItemRevisao() {
		return avaliarItemRevisao;
	}
	public void setAvaliarItemRevisao(ItemRevisao avaliarItemRevisao) {
		this.avaliarItemRevisao = avaliarItemRevisao;
	}
	public Revisao getAvaliarRevisao() {
		return avaliarRevisao;
	}
	public void setAvaliarRevisao(Revisao avaliarRevisao) {
		this.avaliarRevisao = avaliarRevisao;
	}

}

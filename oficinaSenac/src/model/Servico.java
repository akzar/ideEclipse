package model;

import java.sql.Date;
import java.sql.Time;

public class Servico {
	private int codServico, idServico;
	private Date inicioServico, fimServico;
	private Double valorServico, valorDesconto;
	private Time horaInicioServico;
	private String descricaoServico;

	// Método que calcula um desconto para servicos acima de 1000 reais;

	public void DescontoServico() {
		if (this.valorServico > this.valorDesconto) {
			System.out.println("Serviço sujeito a desconto");
		}
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public int getCodServico() {
		return codServico;
	}

	public void setCodServico(int codServico) {
		this.codServico = codServico;
	}

	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public Date getInicioServico() {
		return inicioServico;
	}

	public void setInicioServico(Date inicioServico) {
		this.inicioServico = inicioServico;
	}

	public Date getFimServico() {
		return fimServico;
	}

	public void setFimServico(Date fimServico) {
		this.fimServico = fimServico;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public Time getHoraInicioServico() {
		return horaInicioServico;
	}

	public void setHoraInicioServico(Time horaInicioServico) {
		this.horaInicioServico = horaInicioServico;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

}

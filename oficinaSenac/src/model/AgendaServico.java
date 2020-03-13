package model;

import java.sql.Date;

public class AgendaServico {
	private int codAgenda, idAgenda;
	private Date dataAgenda;
	private String descricaoAgenda;
	private Cliente agendaCliente;
	private Funcionario agendaFuncionario;
	public int getCodAgenda() {
		return codAgenda;
	}
	public void setCodAgenda(int codAgenda) {
		this.codAgenda = codAgenda;
	}
	public int getIdAgenda() {
		return idAgenda;
	}
	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}
	public Date getDataAgenda() {
		return dataAgenda;
	}
	public void setDataAgenda(Date dataAgenda) {
		this.dataAgenda = dataAgenda;
	}
	public String getDescricaoAgenda() {
		return descricaoAgenda;
	}
	public void setDescricaoAgenda(String descricaoAgenda) {
		this.descricaoAgenda = descricaoAgenda;
	}
	public Cliente getAgendaCliente() {
		return agendaCliente;
	}
	public void setAgendaCliente(Cliente agendaCliente) {
		this.agendaCliente = agendaCliente;
	}
	public Funcionario getAgendaFuncionario() {
		return agendaFuncionario;
	}
	public void setAgendaFuncionario(Funcionario agendaFuncionario) {
		this.agendaFuncionario = agendaFuncionario;
	}
	
	

}

package model;

import java.sql.Date;

public class Cliente {
	private int codCliente, idCliente;
	private String nomeCliente, sobrenomeCliente, cnhCliente, telefoneCliente, emailCliente, logradouroCliente,
			bairroCliente, cidadeCliente, cepCliente;
	private Date nascimentoCliente;
	private char sexoCliente, dddCliente, estadoCliente;
	private long cpfCliente;
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	public String getCnhCliente() {
		return cnhCliente;
	}
	public void setCnhCliente(String cnhCliente) {
		this.cnhCliente = cnhCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getLogradouroCliente() {
		return logradouroCliente;
	}
	public void setLogradouroCliente(String logradouroCliente) {
		this.logradouroCliente = logradouroCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getCidadeCliente() {
		return cidadeCliente;
	}
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}
	public String getCepCliente() {
		return cepCliente;
	}
	public void setCepCliente(String cepCliente) {
		this.cepCliente = cepCliente;
	}
	public Date getNascimentoCliente() {
		return nascimentoCliente;
	}
	public void setNascimentoCliente(Date nascimentoCliente) {
		this.nascimentoCliente = nascimentoCliente;
	}
	public char getSexoCliente() {
		return sexoCliente;
	}
	public void setSexoCliente(char sexoCliente) {
		this.sexoCliente = sexoCliente;
	}
	public char getDddCliente() {
		return dddCliente;
	}
	public void setDddCliente(char dddCliente) {
		this.dddCliente = dddCliente;
	}
	public char getEstadoCliente() {
		return estadoCliente;
	}
	public void setEstadoCliente(char estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	public long getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

}

package model;

public class Empresa {
	private int codEmpresa, idEmpresa;
	private String nomeEmpresa, telefoneEmpresa, logradouroEmpresa, bairroEmpresa, cepEmpresa, emailEmpresa;
	private long cnpjEmpresa;
	private char dddEmpresa, estadoEmpresa;

	

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public int getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public String getLogradouroEmpresa() {
		return logradouroEmpresa;
	}

	public void setLogradouroEmpresa(String logradouroEmpresa) {
		this.logradouroEmpresa = logradouroEmpresa;
	}

	public String getBairroEmpresa() {
		return bairroEmpresa;
	}

	public void setBairroEmpresa(String bairroEmpresa) {
		this.bairroEmpresa = bairroEmpresa;
	}

	public String getCepEmpresa() {
		return cepEmpresa;
	}

	public void setCepEmpresa(String cepEmpresa) {
		this.cepEmpresa = cepEmpresa;
	}

	public long getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(long cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public char getDddEmpresa() {
		return dddEmpresa;
	}

	public void setDddEmpresa(char dddEmpresa) {
		this.dddEmpresa = dddEmpresa;
	}

	public char getEstadoEmpresa() {
		return estadoEmpresa;
	}

	public void setEstadoEmpresa(char estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}

}

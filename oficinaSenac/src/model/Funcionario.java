package model;

import java.sql.Date;

public class Funcionario {
	private int codFuncioanrio, idFuncionario;
	private String nomeFuncionario, telefoneFuncionario, logradouroFuncionario, bairroFuncionario, cidadeFuncionario,
			cepFuncionario;
	private Date nascimentoFuncionario;
	private char sexoFuncionario, dddFuncionario, estadoFuncionario;
	private long cpfFuncionario;
	private Empresa funcionarioEmpresa;
	private Departamento funcionarioDepartamento;
	private Setor funcionarioSetor;
	private Cargo funcionarioCargo;
	public int getCodFuncioanrio() {
		return codFuncioanrio;
	}
	public void setCodFuncioanrio(int codFuncioanrio) {
		this.codFuncioanrio = codFuncioanrio;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}
	public void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
	public String getLogradouroFuncionario() {
		return logradouroFuncionario;
	}
	public void setLogradouroFuncionario(String logradouroFuncionario) {
		this.logradouroFuncionario = logradouroFuncionario;
	}
	public String getBairroFuncionario() {
		return bairroFuncionario;
	}
	public void setBairroFuncionario(String bairroFuncionario) {
		this.bairroFuncionario = bairroFuncionario;
	}
	public String getCidadeFuncionario() {
		return cidadeFuncionario;
	}
	public void setCidadeFuncionario(String cidadeFuncionario) {
		this.cidadeFuncionario = cidadeFuncionario;
	}
	public String getCepFuncionario() {
		return cepFuncionario;
	}
	public void setCepFuncionario(String cepFuncionario) {
		this.cepFuncionario = cepFuncionario;
	}
	public Date getNascimentoFuncionario() {
		return nascimentoFuncionario;
	}
	public void setNascimentoFuncionario(Date nascimentoFuncionario) {
		this.nascimentoFuncionario = nascimentoFuncionario;
	}
	public char getSexoFuncionario() {
		return sexoFuncionario;
	}
	public void setSexoFuncionario(char sexoFuncionario) {
		this.sexoFuncionario = sexoFuncionario;
	}
	public char getDddFuncionario() {
		return dddFuncionario;
	}
	public void setDddFuncionario(char dddFuncionario) {
		this.dddFuncionario = dddFuncionario;
	}
	public char getEstadoFuncionario() {
		return estadoFuncionario;
	}
	public void setEstadoFuncionario(char estadoFuncionario) {
		this.estadoFuncionario = estadoFuncionario;
	}
	public long getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(long cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public Empresa getFuncionarioEmpresa() {
		return funcionarioEmpresa;
	}
	public void setFuncionarioEmpresa(Empresa funcionarioEmpresa) {
		this.funcionarioEmpresa = funcionarioEmpresa;
	}
	public Departamento getFuncionarioDepartamento() {
		return funcionarioDepartamento;
	}
	public void setFuncionarioDepartamento(Departamento funcionarioDepartamento) {
		this.funcionarioDepartamento = funcionarioDepartamento;
	}
	public Setor getFuncionarioSetor() {
		return funcionarioSetor;
	}
	public void setFuncionarioSetor(Setor funcionarioSetor) {
		this.funcionarioSetor = funcionarioSetor;
	}
	public Cargo getFuncionarioCargo() {
		return funcionarioCargo;
	}
	public void setFuncionarioCargo(Cargo funcionarioCargo) {
		this.funcionarioCargo = funcionarioCargo;
	}

}

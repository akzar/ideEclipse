package model;

public class Setor {
	private int codSetor;
	private int idSetor;
	private String nomeSetor;
	private char dddSetor;
	private String telefoneSetor;
	private Empresa setorEmpresa;
	private Departamento setorDepartamento;
	public int getCodSetor() {
		return codSetor;
	}
	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}
	public int getIdSetor() {
		return idSetor;
	}
	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}
	public String getNomeSetor() {
		return nomeSetor;
	}
	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}
	public char getDddSetor() {
		return dddSetor;
	}
	public void setDddSetor(char dddSetor) {
		this.dddSetor = dddSetor;
	}
	public String getTelefoneSetor() {
		return telefoneSetor;
	}
	public void setTelefoneSetor(String telefoneSetor) {
		this.telefoneSetor = telefoneSetor;
	}
	public Empresa getSetorEmpresa() {
		return setorEmpresa;
	}
	public void setSetorEmpresa(Empresa setorEmpresa) {
		this.setorEmpresa = setorEmpresa;
	}
	public Departamento getSetorDepartamento() {
		return setorDepartamento;
	}
	public void setSetorDepartamento(Departamento setorDepartamento) {
		this.setorDepartamento = setorDepartamento;
	}

}

package model;

public class Departamento {
	private int codDEpartamento, idDepartamento;
	private String nomeDepartamento;
	private Empresa empresaDepartamento;
	public int getCodDEpartamento() {
		return codDEpartamento;
	}
	public void setCodDEpartamento(int codDEpartamento) {
		this.codDEpartamento = codDEpartamento;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	public Empresa getEmpresaDepartamento() {
		return empresaDepartamento;
	}
	public void setEmpresaDepartamento(Empresa empresaDepartamento) {
		this.empresaDepartamento = empresaDepartamento;
	}

}

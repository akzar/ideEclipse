package model;

public class Cargo {
	private int codCargo, idCargo;	
	private String nomeCargo;
	private Empresa cargoEmpresa;
	private Departamento cargoDepartamento;
	private Setor cargoSetor;
	public int getCodCargo() {
		return codCargo;
	}
	public void setCodCargo(int codCargo) {
		this.codCargo = codCargo;
	}
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getNomeCargo() {
		return nomeCargo;
	}
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	public Empresa getCargoEmpresa() {
		return cargoEmpresa;
	}
	public void setCargoEmpresa(Empresa cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
	}
	public Departamento getCargoDepartamento() {
		return cargoDepartamento;
	}
	public void setCargoDepartamento(Departamento cargoDepartamento) {
		this.cargoDepartamento = cargoDepartamento;
	}
	public Setor getCargoSetor() {
		return cargoSetor;
	}
	public void setCargoSetor(Setor cargoSetor) {
		this.cargoSetor = cargoSetor;
	}

}

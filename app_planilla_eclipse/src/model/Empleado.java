package model;


public class Empleado {
	int id, idDomiciliado, idEstadoCivil, idNivelEducativo;
	int idDepartamento, idProvincia, idDistrito;
	String Dni, Ruc, Nombre, ApellidoPaterno, ApellidoMaterno, FechaNacimiento;
	String Direccion, Correo, Celular, Passwordd;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdDomiciliado() {
		return idDomiciliado;
	}
	public void setIdDomiciliado(int idDomiciliado) {
		this.idDomiciliado = idDomiciliado;
	}
	public int getIdEstadoCivil() {
		return idEstadoCivil;
	}
	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}
	public int getIdNivelEducativo() {
		return idNivelEducativo;
	}
	public void setIdNivelEducativo(int idNivelEducativo) {
		this.idNivelEducativo = idNivelEducativo;
	}
	public int getIdDepartamente() {
		return idDepartamento;
	}
	public void setIdDepartamente(int idDepartamente) {
		this.idDepartamento = idDepartamente;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getRuc() {
		return Ruc;
	}
	public void setRuc(String ruc) {
		Ruc = ruc;
	}
	public String getApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		ApellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		ApellidoMaterno = apellidoMaterno;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getPasswordd() {
		return Passwordd;
	}
	public void setPasswordd(String password) {
		Passwordd = password;
	}
	public Empleado() {}
	public void SetRegistro(String[] aRegistro) {
		if (aRegistro == null) return;
		
		id = Integer.parseInt(aRegistro[0]);
		Dni = aRegistro[2];
		Ruc = aRegistro[3];
		Nombre = aRegistro[4];
		ApellidoPaterno = aRegistro[5];
		ApellidoMaterno = aRegistro[6];
		FechaNacimiento = aRegistro[7];
		Direccion = aRegistro[8];
		Correo = aRegistro[9];
		Celular = aRegistro[10];
		Passwordd = aRegistro[11];
		
		idDomiciliado = Integer.parseInt(aRegistro[12]);
		idEstadoCivil = Integer.parseInt(aRegistro[13]);
		idNivelEducativo = Integer.parseInt(aRegistro[14]);
		idDepartamento = Integer.parseInt(aRegistro[15]);
		idProvincia = Integer.parseInt(aRegistro[16]);
		idDistrito = Integer.parseInt(aRegistro[17]);
		
		
		
	}
	public void setRegistro(Object registro) {
		// TODO Auto-generated method stub
		
	}

}

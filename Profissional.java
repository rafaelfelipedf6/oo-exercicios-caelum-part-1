public class Profissional extends Contato{
	private String TelefoneComercial;
	private String Organizacao;
	private String Cargo;

	public void setTelefoneComercial(String UmTelefoneComercial){
		TelefoneComercial = UmTelefoneComercial;
	}
	public String getTelefoneComercial(){
		return TelefoneComercial;

	}
	public void setOrganizacao(String UmaOrganizacao){
		Organizacao = UmaOrganizacao;
	}
	public String getOrganizacao(){
		return Organizacao;

	}public void setCargo(String UmCargo){
		Cargo = UmCargo;
	}
	public String getCargo(){
		return Cargo;

	}

}

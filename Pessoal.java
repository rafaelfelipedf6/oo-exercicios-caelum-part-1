
public class Pessoal extends Contato{
	private String RedeSocial;
	private String Celular;
	

	public Pessoal(String nome, String telefone){
		super(nome, telefone);
	}
	public Pessoal(String nome){
		super(nome);
	}
	public void setRedeSocial(String Rede){
		RedeSocial = Rede;
	}
	public String getRedeSocial(){
		return RedeSocial;
	}
	public void setCelular(String umCelular){
		Celular = umCelular;
	}
	public String getCelular(){
		return Celular;
	}
	
}

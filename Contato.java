public class Contato {
	private String nome;
	private String telefone;
	private int sexo; //0-masculino  | 1-feminino
	
	//metodos acessadores dos atributos (getters e setters)
	public void setNome (String umNome) {
		nome=umNome;
	}
	
	public  String getNome() {
		return nome;
	
	}
	public void setTelefone (String umTelefone){
		telefone=umTelefone;
	
	}	
	public  String getTelefone() {
		return telefone;
	}
	
	public void setSexo (int umSexo) {
		sexo=	umSexo;
	}
	
	public int getsexo() {
		return sexo;
	}
}


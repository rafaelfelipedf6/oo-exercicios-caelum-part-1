public class funcionario{
	
	//declarando atributos da Classe funcionario
	private String nome;
	private String departamento;
	private double salario,salarioAnual;
	private String datadeEntrada;
	private String rg;
	
	//fazendo método recebeAumento
	public double recebeAumento(double umSalario){
		salario = umSalario;
		double aumento = 0.1*salario;
		return salario+aumento;
	}
	//fazendo método calculaGanhoAnual
	public double calculaGanhoAnual(){
		
		salarioAnual=salario*12;
		return salarioAnual;
	}

	//fazendo getters e setters
	public String setNome(String umNome){
		this.nome = umNome;
	}

	public String getNome(){
		return nome;
	}

	public double setSalario(double umSalario){
		salario = umSalario;
	}

	public double getSalario(){
		return salario;
	}

	public String setDepartamento(String umDepartamento){
		departamento = umDepartamento;
	
	}
	public String getDepartamento(){
		return departamento;
	}
	public String setDatadeEntrada(String umaData){
		datadeEntrada = umaData;
	
	}
	public String getDatadeEntrada(){
		return datadeEntrada;

	}
	public String setRg(String umRg){
		rg = umRg;
	
	}
	public String getRg(){
		return rg;

	}
}

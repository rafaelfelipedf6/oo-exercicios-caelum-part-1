public class funcionario
{
	
	//declarando atributos da Classe funcionario
	private String nome;
	private String departamento;
	private double salario;
	private double salarioAnual;
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
	public void setNome(String umNome){
		nome = umNome;
	}

	public String getNome(){
		return nome;
	}

	public void setSalario(double umSalario){
		salario = umSalario;
	}

	public double getSalario(){
		return salario;
	}

	public void setDepartamento(String umDepartamento){
		departamento = umDepartamento;
		}
	public String getDepartamento(){
		return departamento;
	}
	public void setDatadeEntrada(String umaData){
		datadeEntrada = umaData;
		}
	public String getDatadeEntrada(){
		return datadeEntrada;
	}
	public void setRg(String umRg){
		rg = umRg;
		}
	public String getRg(){
		return rg;
	}

	//Criando método MOSTRA() que imprime todas as informações digitadas
	public void mostra(){
		System.out.println("Nome:"+getNome());
		System.out.println("Departamento:"+getDepartamento());
		System.out.println("Salário:"+getSalario());
		System.out.println("Data de Entrada:"+ getDatadeEntrada());
		System.out.println("RG:"+ getRg());
	
		System.out.println("Ganho Anual: "+ calculaGanhoAnual());
		System.out.println("Agora receber: "+ recebeAumento(salario));
	
	}
}

import	java.util.*;

public class TestaFuncionario
{
    public static void main (String[] args){

	//Declarando Objeto e o chamando como lerTeclado para ler caracteres do Teclado
	Scanner lerTeclado = new Scanner(System.in);
	
	//Declarando objeto Funcionario() cujos atributos estão contidos na Classe funcionario;	
	funcionario func1 = new funcionario();    
		//fazendo leitura de umNome no teclado
		System.out.println("Digite o Nome do Funcionário");
		String umNome = lerTeclado.nextLine();
		func1.setNome(umNome);

		System.out.println("Digite o Departamento que ele trabalha");
		String umDepartamento = lerTeclado.nextLine();
		func1.setDepartamento(umDepartamento);

		System.out.println("Digite o Salário que recebe");
		double umSalario = Double.parseDouble(lerTeclado.nextLine());
		func1.setSalario(umSalario);
		
		System.out.println("Digite a Data de Entrada na Empresa");
		String umaData = lerTeclado.nextLine();
		func1.setDatadeEntrada(umaData);

		System.out.println("Digite o RG");
		String umRg = lerTeclado.nextLine();
		func1.setRg(umRg);



		func1.mostra();
	}
}

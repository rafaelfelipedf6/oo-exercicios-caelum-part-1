import	java.util.*;

public class TestaFuncionario
{
    public static void main (String[] args){

	//Declarando Objeto e o chamando como lerTeclado para ler caracteres do Teclado
	Scanner lerTeclado = new Scanner(System.in);
	
	//Declarando objeto Funcionario() cujos atributos estão contidos na Classe funcionario;	
	funcionario func1 = new funcionario();   


	//Criando o novo funcionario para Comparar os Dados inseridos pelo TECLADO

	funcionario func2 = func1 ;  // Quando é inserido esta linha de código os Funcionarios são iguais


		//fazendo leitura de umNome no teclado
		
		String umNome = "João";
		func1.setNome(umNome);

	
		String umDepartamento ="Eletrônica";
		func1.setDepartamento(umDepartamento);

	
		double umSalario = 1000;
		func1.setSalario(umSalario);
		
		
		String umaData = "20";
		func1.setDatadeEntrada(umaData);

		
		String umRg = "2222222";
		func1.setRg(umRg);


	


		if(func1 == func2){
			System.out.println("São Iguais");}
		else{
			System.out.println("São diferentes");
		}

	}
}

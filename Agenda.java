public class Agenda{

	public static void main (String[] args){

		Scanner lerTeclado = new Scanner(System.in);
		Contato umContato = new Contato();
		ArrayList<Contato> listaContatos = new ArrayList<Contato>();

		System.out.println("Digite o nome do Contato:");
		String umNome = lerTeclado.nextLine();
		umContato.setNome(umNome);

		System.out.println("Digite o telefone do Contato:");
		String umTelefone = lerTeclado.nextLine();
		umContato.setTelefone(umTelefone);

		listaContatos.add(umContato);

		System.out.println("Contato inserido com sucesso!");
		System.out.println("Nome: " + umContato.getNome());
		System.out.println("Telefone: " + umContato.getTelefone());
	}
}

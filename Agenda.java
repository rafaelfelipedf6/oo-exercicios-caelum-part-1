import	java.util.*;

public class Agenda
{


    public static void main (String[] args)


    {

        Scanner lerTeclado = new Scanner(System.in);
        ArrayList<Contato> listaContatos = new ArrayList<Contato>();

        int opcao;




        do
        {
            System.out.println("Menu de Opções");
            System.out.println("\n");
            System.out.println("Para criar um novo contato digite 1: ");
            System.out.println("Para listar um contato digite 2: ");
            System.out.println("Para remover um contato digite 3: ");
            System.out.println("Para parar o programa digite 0.");


            opcao= lerTeclado.nextInt();
            lerTeclado.nextLine();
            switch (opcao)
            {

            case 1:
                Contato umContato = new Contato();

                System.out.println("Digite o nome do contato: ");
                String umNome = lerTeclado.nextLine();
                umContato.setNome(umNome);
                System.out.println("\n");

                System.out.println("Digite o número do contato: ");
                String umTelefone = lerTeclado.nextLine();
                umContato.setTelefone(umTelefone);
                System.out.println("\n");

                System.out.println("Digite o sexo do contato : 0-MASC , 1-FEM ");
                int umSexo = lerTeclado.nextInt();
                umContato.setSexo(umSexo);
                System.out.println("\n");

                while(umSexo !=1 && umSexo !=0)
                {
                    System.out.println("Sexo inválido ");
                    System.out.println("Digite Novamente: ");
                    umSexo = lerTeclado.nextInt();
                    umContato.setSexo(umSexo);
                }
                listaContatos.add(umContato);

                System.out.println("Contato inferido com sucesso");
                System.out.println("\n");
                System.out.println("Nome: " + umContato.getNome() );
                System.out.println("Telefone: " + umContato.getTelefone() );

                if(umSexo == 0)
                {
                    System.out.println("Sexo Masculino");
                    System.out.println("\n");
                }

                if(umSexo == 1)
                {
                    System.out.println("Sexo Feminino");
                    System.out.println("\n");
                }
                break;


            case 2:

                int arrayTamanho;
                arrayTamanho = listaContatos.size();
                int contador;

                for(contador=0; contador<arrayTamanho; contador++)
                {
                    System.out.println("Contato número: " + (contador+1));
                    System.out.println("\n");
                    System.out.println("Nome: " +listaContatos.get(contador).getNome());
                    System.out.println("Telefone: " + listaContatos.get(contador).getTelefone());

                    if (listaContatos.get(contador).getsexo() == 0)
                    {
                        System.out.println("Sexo: Masculino");
                    }
                    if(listaContatos.get(contador).getsexo() == 1)
                    {
                        System.out.println("Sexo: Feminino");
                    }
                    System.out.println("\n");
                }

                break;

            case 3:
                int numeroRemocao;

                System.out.println("Digite o número do contato que deseja remover");
                numeroRemocao= lerTeclado.nextInt();

                listaContatos.remove(numeroRemocao-1);
                lerTeclado.nextLine();
                System.out.println("\n");
                System.out.println("Contato removido com sucesso");
                System.out.println("\n");
                break;

            }//fim switch

        }//fim do
        while(opcao!=0);


    }//fim main


}//fim classe




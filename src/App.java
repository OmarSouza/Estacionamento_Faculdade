import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Instancia das classes e metodos utilizados
        Funções_Basicas funções_Basicas = new Funções_Basicas();
        Scanner scanner = new Scanner(System.in);

        int retorno = 1; //Variavel de retorno do Menu Principal

        while(retorno == 1){
            retorno = 0;

            funções_Basicas.menuPrincipal();
            int escolha_MenuPrincipal = scanner.nextInt();

            //Switch de ajuda do Menu encaminhando o usuario para a area desejada
            switch(escolha_MenuPrincipal){
                case 1:

                break;
                case 2:

                break;
                case 3:
                    //Caso de finalização do programa.
                    System.out.println("Obrigado por utilizar o programa!\n\nDesenvolvido por Omar Souza e Guilherme Cristiano");
                break;
                default:
                    //Caso de escapa do programa para informação incorreta inserida.
                    System.out.println("Opção Invalida!\nRetornando ao Menu Principal!");
                    retorno = 1;
                    System.out.println("\n\n");
                break;
            }
        }
    }
}

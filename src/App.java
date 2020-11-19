import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Instancia das classes e metodos utilizados
        Funções_Basicas funcoes_Basicas = new Funções_Basicas();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estacionamento> lEstacionamento = new ArrayList<Estacionamento>();
        ListaCircular func = new ListaCircular();

        func.inserirNoComeco("Ricardo Alves Souza");
        func.inserirNoFim("Maria Nunes Santos");
        func.inserirNoFim("Mateus Santos de Oliveira");

        int retorno = 1; //Variavel de retorno do Menu Principal

        No nofunc = func.getPrimeiro();
        while(retorno == 1){
            retorno = 0;

            funcoes_Basicas.menuPrincipal(nofunc.getValor());
            int escolha_MenuPrincipal = scanner.nextInt();

            //Switch de ajuda do Menu encaminhando o usuario para a area desejada
            switch(escolha_MenuPrincipal){
                case 1:
                    int retorno_Estacionamento = 1;

                    while(retorno_Estacionamento == 1){
                        retorno_Estacionamento = 0;
                        
                        funcoes_Basicas.menuEstacionamento();
                        int escolha_Estacionamento = scanner.nextInt();
                    
                        switch(escolha_Estacionamento){
                            case 1:

                                System.out.print("Vaga Ocupada: ");
                                int vaga_ocupada = scanner.nextInt();
                                System.out.print("Motorista:");
                                String motorista = scanner.next();
                                System.out.print("Placa: ");
                                String placa_Veiculo = scanner.next();
                                System.out.print("Entrada:");
                                String entrada_Veiculo = scanner.next();

                                lEstacionamento.add(new Estacionamento(vaga_ocupada, placa_Veiculo, motorista, entrada_Veiculo));

                                retorno_Estacionamento = 1;
                            break;
                            case 2:
                            break;
                            case 3: 

                                System.out.print("Liberar vaga:");
                                lEstacionamento.remove(scanner.nextInt() - 1);
                                retorno_Estacionamento = 1; 
                            case 4:
                                System.out.println("Retornando ao Menu Principal");
                                retorno = 1;
                                System.out.println("\n\n");
                            break;
                            default:
                            System.out.println("Opção Invalida!\nRetornando ao Menu do Estacionamento!");
                            retorno_Estacionamento = 1;
                            System.out.println("\n\n");
                            break;
                        }
                    }
                break;
                case 2:
                nofunc = nofunc.getProximo();
                retorno = 1;
                break;
                case 3:
                    //Caso de finalização do programa.
                    System.out.println("Obrigado por utilizar o programa!\n\nDesenvolvido por Omar Souza e Guilherme Cristiano");
                break;
                case 4:


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

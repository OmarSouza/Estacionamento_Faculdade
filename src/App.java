import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instancia das classes e metodos utilizados
        Funções_Basicas funcoes_Basicas = new Funções_Basicas();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estacionamento> lEstacionamento = new ArrayList<Estacionamento>();
        ListaCircular func = new ListaCircular();

        // Insere o nome dos funcionários na lista encadeada
        func.inserirNoComeco("Ricardo Alves Souza");
        func.inserirNoFim("Maria Nunes Santos");
        func.inserirNoFim("Mateus Santos de Oliveira");

        int retorno = 1; // Variavel de retorno do Menu Principal

        No nofunc = func.getPrimeiro();
        while (retorno == 1) {
            retorno = 0;

            funcoes_Basicas.menuPrincipal(nofunc.getValor());
            int escolha_MenuPrincipal = scanner.nextInt();

            // Switch de ajuda do Menu encaminhando o usuario para a area desejada
            switch (escolha_MenuPrincipal) {
                case 1:
                    int retorno_Estacionamento = 1;

                    while (retorno_Estacionamento == 1) {
                        retorno_Estacionamento = 0;

                        funcoes_Basicas.menuEstacionamento();
                        int escolha_Estacionamento = scanner.nextInt();

                        switch (escolha_Estacionamento) {
                            case 1:
                                // Inserção de dados na Entrada de Veículos

                                System.out.print("Vaga Ocupada: ");
                                int vaga_ocupada = scanner.nextInt();
                                System.out.print("Motorista: ");
                                String motorista = scanner.next();
                                System.out.print("Placa: ");
                                String placa_Veiculo = scanner.next();
                                System.out.print("Entrada: ");
                                String entrada_Veiculo = scanner.next();

                                lEstacionamento.add(new Estacionamento(vaga_ocupada, placa_Veiculo, motorista, entrada_Veiculo));
                                System.out.println("Veículo registrado com sucesso!");

                                retorno_Estacionamento = 1;
                                break;
                            case 2:
                                // Método de Consulta de Veículos

                                System.out.println(lEstacionamento.size() + " veículo(s) encontrados.");
                                for (Estacionamento e : lEstacionamento) {
                                    System.out.println(e);
                                }
                                retorno_Estacionamento = 1;
                                break;
                            case 3:
                                // Cálculo de permanência e retirada do veículo
                                System.out.print("Liberar vaga:");
                                lEstacionamento.remove(scanner.nextInt() - 1);
                                retorno_Estacionamento = 1;


                                System.out.println("Informe o tempo de permanencia do veiculo: (em minutos)");
                                double tempo_permanencia = scanner.nextInt();
                                double preco_Final = (tempo_permanencia / 60) * 15.00;
                                System.out.println("Valor a ser cobrado: R$" + preco_Final);
                                retorno_Estacionamento = 1;
                            case 4:
                                // Função para retornar ao menu principal

                                System.out.println("Retornando ao Menu Principal");
                                retorno = 1;
                                System.out.println("\n");
                                break;
                            default:
                                // Método reservado para caso o usuário digite algo irreconhecível

                                System.out.println("Opção Invalida!\nRetornando ao Menu do Estacionamento!");
                                retorno_Estacionamento = 1;
                                System.out.println("\n\n");
                                break;
                        }
                    }
                    break;
                case 2:
                    // Fecha o expediente e troca para o próximo funcionário

                    System.out.println("Expediente encerrado. O funcionário agora será trocado para o próximo da lista...\n\n");
                    nofunc = nofunc.getProximo();
                    retorno = 1;
                    break;
                case 3:
                    // Caso de finalização do programa.
                    System.out.println(
                            "Obrigado por utilizar o programa!\n\nDesenvolvido por Omar Souza e Guilherme Cristiano");
                    break;
                default:
                    // Caso de escapa do programa para informação incorreta inserida.
                    System.out.println("Opção Invalida!\nRetornando ao Menu Principal!");
                    retorno = 1;
                    System.out.println("\n\n");
                    break;
            }
        }
    }
}

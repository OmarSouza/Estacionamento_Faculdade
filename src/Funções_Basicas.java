public class Funções_Basicas {
    //Craição de menu para a Tela Principal.
    public void menuPrincipal(String func) {
        System.out.println("Funcionário no cargo: " + func + "\n\n");
        System.out.println("Menu Inicial do Estacionamento:");
        System.out.println("1 - Entrada e Saida de Veiculo.");
        System.out.println("2 - Fechar Expediente (Rotatividade de Funcionários).");
        System.out.println("3 - Finalizar Programa.\n");
    }

    //Criação do menu para a tela de entrada e saida de veiculos.
    public void menuEstacionamento() {
        System.out.println("\nMenu de Entrada e Saida de Veiculos:");
        System.out.println("1 - Entrada de Veiculos");
        System.out.println("2 - Consulta de Veiculos.");
        System.out.println("3 - Saida de Veiculos.");
        System.out.println("4 - Sair do Menu.\n");
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Funções_Basicas {
    public void menuPrincipal(){
        System.out.println("Menu Inicial do Estacionamento:");
        System.out.println("1 - Entrada e Saida de Veiculo.");
        System.out.println("2 - Rotatividade de Funcionarios.");
        System.out.println("3 - Finalizar Programa.");
    }
    public void menuEstacionamento(){
        System.out.println("Menu de Entrada e Saida de Veiculos:");
        System.out.println("1 - Entrada de Veiculos");
        System.out.println("2 - Consulta de Veiculos.");
        System.out.println("3 - Saida de Veiculos.");
        System.out.println("4 - Sair do Menu.");
    }

    public void menuFuncionarios(){
        System.out.println("Menu de Rotatividae de Funcionarios: ");
        System.out.println("");
    }

    public String somaHora(String hora, String hora2) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
        long min_1 = getMinutos(hora, formatter);
        long min_2 = getMinutos(hora2, formatter);
        long result = (min_1 + min_2) * 60 * 1000;
        Date data = new Date(result);
        return formatter.format(data);
    }

    private long getMinutos(String hora2, SimpleDateFormat formatter) {
        return 0;
    }
}

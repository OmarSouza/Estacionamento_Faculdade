public class Estacionamento {
    private int vaga;
    private String hora_Entrada;
    private String placa;
    private String motorista;

    public Estacionamento(int vaga, String placa, String motorista, String hora_Entrada){
        this.vaga = vaga;
        this.placa = placa;
        this.motorista = motorista;
        this.hora_Entrada = hora_Entrada;
    }

    @Override
    public String toString(){
        return "Vaga: " + vaga + " / Placa: " + placa + " / Motorista: " + motorista + " / Entrada: " + hora_Entrada; 
    }
}

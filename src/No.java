public class No {
    private String valor;
    private No proximo;
    private No anterior;

    public String getValor() {
        return valor;
    }

    public No getAnterior() {
        return anterior;
    }

    public No getProximo() {
        return proximo;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

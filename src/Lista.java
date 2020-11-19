public class Lista {
    protected No primeiro;
    protected No ultimo;
    protected int tamanho = 0;

    public void imprime() {
        No temp = primeiro;

        System.out.println("\nImpressão dos valores: ");

        for (int i = 0; i < tamanho; i++) {
            System.out.println(temp.getValor());
            temp = temp.getProximo();
        }
    }

    public void inserirNoComeco(String valor) {
        No novoNo = new No();
        novoNo.setValor(valor);

        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = primeiro;
        } else {
            novoNo.setProximo(primeiro);
            primeiro.setAnterior(novoNo);
            primeiro = novoNo;
        }
        tamanho++;
    }

    public void inserirNoFim(String valor) {
        if (primeiro == null) {
            inserirNoComeco(valor);
        } else {
            No novoNo = new No();
            novoNo.setValor(valor);

            ultimo.setProximo(novoNo);
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;

            tamanho++;
        }
    }

    public boolean remover(String valor) {

        if (tamanho == 0)
            return false;

            int indice = 0;
            No temp = primeiro;

            boolean encontrouValor = false;

            for (indice = 0; indice < tamanho; indice++){
                if (temp.getValor().equals(valor)){
                    encontrouValor = true;
                    break;
                }
            }

            temp = temp.getProximo();

            if(!encontrouValor)
            return false;

            if(indice == 0){
                primeiro = primeiro.getProximo();
                primeiro.setAnterior(null);
            } else if(indice == tamanho - 1){
                No anterior = temp.getAnterior();
                anterior.setProximo(null);
                ultimo = anterior;
            } else {
                No anterior = temp.getAnterior();
                anterior.setProximo(temp.getProximo());

                temp.getProximo().setAnterior(anterior);
            }

            tamanho--;
            return true;
    }

    public int getTamanho() {
        return tamanho;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
}

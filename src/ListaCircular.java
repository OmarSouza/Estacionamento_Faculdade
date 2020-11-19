public class ListaCircular extends Lista {
    public void atualizarReferenciasCirculares(){
        if(primeiro != null && ultimo != null){
            primeiro.setAnterior(ultimo);
            ultimo.setProximo(primeiro);
        }
    }

    @Override
    public void inserirNoComeco(String valor){
        super.inserirNoComeco(valor);
        atualizarReferenciasCirculares();
    }


    @Override
    public void inserirNoFim(String valor){
        super.inserirNoFim(valor);
        atualizarReferenciasCirculares();
    }

    @Override
    public boolean remover(String valor){
        boolean retornoSuper = super.remover(valor);

        if(retornoSuper)
        atualizarReferenciasCirculares();

        return retornoSuper;
    }
}

public class ListaDinamica {
    private No primeiro;
    private No ultimo;

    public ListaDinamica() {
        primeiro = null;
        ultimo = null;
    }

    public boolean vazia() { //OK
        if (primeiro == null)
            return true;
        else
            return false;
    }

    public void addInicio(int elemento) { // OK
        No novo = new No(elemento);
        if (!vazia()) {
            novo.proximo = primeiro;
        }
        primeiro = novo;
    }

    public void addFinal(int elemento) { //OK
        No novo = new No(elemento);
        No aux = null;
        if (vazia())
            primeiro = novo;
        else {
            aux = primeiro;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
    }

    public No removerInicio() throws Exception { //OK
        No removido = null;
        if (vazia())
            throw new Exception("Estrutura vazia!");
        else {
            removido = primeiro;
            primeiro = primeiro.proximo;
        }
        return removido;
    }

    public No removerFinal() throws Exception { //OK
        No removido = null;
        No aux = null;
        if (vazia())
            throw new Exception("Lista vazia!");
        else {
            removido = aux = primeiro;
            while (removido.proximo != null) {
                aux = removido;
                removido = removido.proximo;
            }
            aux.proximo = null;
        }
        return removido;
    }

    public void addPosicao(int elemento, int posicao) { //Ok
        if (vazia()) {
            addInicio(elemento);
        } else {
            No novo = new No(elemento);
            No aux = primeiro;
            int indice = 1;
            while (indice < posicao && aux != null) {
                aux = aux.proximo;
                indice++;
            }
            if (aux == null)
                addFinal(elemento);
            else {
                novo.proximo = aux.proximo;
                aux.proximo = novo;
            }
        }
    }

    public No removerPosicao(int posicao) throws Exception { //OK
        No removido = null;
        No aux = null;
        if (vazia() || posicao <= 1)
            removido = removerInicio();
        else {
            removido = aux = primeiro;
            int indice = 1;
            while (indice < posicao && removido != null) {
                aux = removido;
                removido = removido.proximo;
                indice++;
            }
            if (removido == null)
                removido = removerFinal();
            else
                aux.proximo = removido.proximo;
        }
        return removido;
    }

    public void exibir() {//OK
        No aux = primeiro;
        while (aux != null) {
            System.out.print(aux.dado);
            System.out.print(' ');
            aux = aux.proximo;
        }

    }
}



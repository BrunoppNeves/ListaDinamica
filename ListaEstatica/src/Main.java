import ListaEstatica.lista;

public class Main {
    public static void main(String[] args) throws Exception {
        lista teste = new lista(5);
        teste.adicionarPosicao(1,0);
        teste.adicionarPosicao(1,1);
        teste.adicionarPosicao(2,2);
        teste.adicionarPosicao(2,3);
        teste.adicionarPosicao(3,4);
        //teste.eliminaRepetido();
        teste.exibe();
        System.out.println(" ");
        teste.eliminaRepetido();
        System.out.println(" ");
        teste.exibe();


    }
}

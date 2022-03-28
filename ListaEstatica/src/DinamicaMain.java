public class DinamicaMain {
    public static void main(String[] args) throws Exception {
        ListaDinamica lista = new ListaDinamica();
        lista.addFinal(7);
        lista.addInicio(1);
        lista.addFinal(1);
        lista.addFinal(5);
        lista.addFinal(6);
        lista.removerFinal();
        lista.exibir();

    }
}

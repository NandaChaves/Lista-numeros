package ListaNUmeros;

public class Teste {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.inserirNumero(4);
		lista.inserirNumero(6);
		lista.inserirNumero(3);
		lista.inserirNumero(11);
		lista.inserirNumero(4);
		lista.inserirNumero(20);
		lista.inserirNumero(3);
		lista.imprimeLista();
		lista.elimina(40);
		lista.elimina(3);
		lista.imprimeLista();
		lista.elimina(6);
		lista.imprimeLista();
	}

}

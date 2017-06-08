package pokerhand

/**
 * Created by henriquemota on 06/06/17.
 */
interface Categoria {
	boolean pertence(List<Carta> cartas);
	int obterValorDesempate(List<Carta> cartas);
}

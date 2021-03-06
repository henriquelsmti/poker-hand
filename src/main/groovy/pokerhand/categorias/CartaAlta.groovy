package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria

/**
 * Created by henriquemota on 06/06/17.
 */
class CartaAlta implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {
		true
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas) {
		cartas = CategoriaUtil.ordenarPorValor(cartas)
		return Arrays.asList(cartas[cartas.size() - 1].valor.ordinal())
	}
}

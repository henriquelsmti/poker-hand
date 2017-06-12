package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria

/**
 * Created by henriquemota on 06/06/17.
 */
class Sequencia implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {
		CategoriaUtil.emSequanciaDeValor(cartas)
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		cartas = CategoriaUtil.ordenarPorValor(cartas)
		cartas[cartas.size() - 1].valor.ordinal()
	}
}

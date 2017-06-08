package pokerhand.categorias

import pokerhand.Carta

/**
 * Created by henriquemota on 06/06/17.
 */
class CartaAlta extends Base{
	@Override
	boolean pertence(List<Carta> cartas) {
		true
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		cartas = helper.ordenarPorValor(cartas)
		cartas[cartas.size() - 1].valor.ordinal()
	}
}

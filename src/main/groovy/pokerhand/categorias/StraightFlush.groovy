package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.PokerHandHelper

/**
 * Created by henriquemota on 06/06/17.
 */
class StraightFlush extends Base{

	@Override
	boolean pertence(List<Carta> cartas) {
		if(!helper.eDoMesmoNipe(cartas))
			return false;

		helper.emSequanciaDeValor(cartas);
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		cartas = helper.ordenarPorValor(cartas);
		cartas[cartas.size() - 1].valor.ordinal();
	}
}

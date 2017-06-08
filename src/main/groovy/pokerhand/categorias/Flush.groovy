package pokerhand.categorias

import pokerhand.Carta

/**
 * Created by henriquemota on 06/06/17.
 */
class Flush extends Base {
	@Override
	boolean pertence(List<Carta> cartas) {
		helper.eDoMesmoNipe(cartas)
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		helper.obterCartasMaiorValor(cartas)[0].valor.ordinal()
	}
}

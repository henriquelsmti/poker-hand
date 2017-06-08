package pokerhand.categorias

import pokerhand.Carta

/**
 * Created by henriquemota on 06/06/17.
 */
class Trinca extends Base {
	@Override
	boolean pertence(List<Carta> cartas) {
		helper.contarMaiorOcorrenciadeMesmoValor(cartas) == 3
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		List<Carta> cartasMenores = new ArrayList<>(cartas)
		cartasMenores.removeAll(helper.obterCartasMaiorValor(cartas))
		cartasMenores = helper.ordenarPorValor(cartasMenores)
		cartasMenores[cartasMenores.size() -1].valor.ordinal()
	}
}

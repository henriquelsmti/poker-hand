package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class FullHolse extends Base{
	@Override
	boolean pertence(List<Carta> cartas) {
		helper.contarMaiorOcorrenciadeMesmoValor(cartas) == 3 && helper.contarCartasPorValor(cartas).size() == 2
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		Map<ValorDaCarta, Integer> map = helper.contarCartasPorValor(cartas)
		helper.obterValorDaCartaDaMaiorOcorrencia(map).ordinal()
	}
}

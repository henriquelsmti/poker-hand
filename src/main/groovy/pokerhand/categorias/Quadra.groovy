package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class Quadra implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {
		CategoriaUtil.contarMaiorOcorrenciadeMesmoValor(cartas) == 4
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas) {
		Map.Entry<ValorDaCarta, Integer> kicker = null
		for(Map.Entry<ValorDaCarta, Integer> item in CategoriaUtil.contarCartasPorValor(cartas)){
			if(!kicker || (kicker && kicker.value > item.value)){
				kicker = item
			}
		}
		return Arrays.asList(kicker.key.ordinal())
	}

}

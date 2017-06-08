package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class Quadra extends Base{
	@Override
	boolean pertence(List<Carta> cartas) {
		helper.contarMaiorOcorrenciadeMesmoValor(cartas) == 4;
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		Map.Entry kicker;
		for(Map.Entry<ValorDaCarta, Integer> item in helper.contarCartasPorValor(cartas)){
			if(!kicker || (kicker && kicker.value > item.value)){
				kicker = item;
			}
		}
		kicker.key.ordinal();
	}

}

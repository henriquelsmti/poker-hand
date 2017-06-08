package pokerhand.categorias

import pokerhand.Carta
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class DoisPares extends Base {
	@Override
	boolean pertence(List<Carta> cartas) {
		Map<ValorDaCarta, Integer> map = helper.contarCartasPorValor(cartas)

		int i = 0;
		for(Map.Entry<ValorDaCarta, Integer> item in helper.contarCartasPorValor(cartas)){
			if(item.value == 2){
				i++
			}
		}
		i == 2;
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

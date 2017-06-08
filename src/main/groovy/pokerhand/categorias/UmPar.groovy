package pokerhand.categorias

import pokerhand.Carta
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class UmPar extends Base{
	@Override
	boolean pertence(List<Carta> cartas) {
		Map<ValorDaCarta, Integer> map = helper.contarCartasPorValor(cartas);
		map.containsValue(2) && map.containsValue(1) && !map.containsValue(3) && !map.containsValue(4);
	}

	@Override
	int obterValorDesempate(List<Carta> cartas) {
		Map.Entry maior;
		for(Map.Entry<ValorDaCarta, Integer> item in helper.contarCartasPorValor(cartas)){
			if(!maior || (maior && maior.value < item.value)){
				maior = item;
			}
		}

		List<Carta> cartasSemPares = new ArrayList<>(cartas);

		for(Carta carta in cartas){
			if(carta.valor == maior.key)
				cartasSemPares.remove(carta);
		}
		cartasSemPares = helper.ordenarPorValor(cartasSemPares);
		cartasSemPares[cartasSemPares.size() - 1].valor.ordinal();
	}
}

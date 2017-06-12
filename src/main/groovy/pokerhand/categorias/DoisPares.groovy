package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class DoisPares implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {

		int i = 0
		for(Map.Entry<ValorDaCarta, Integer> item in CategoriaUtil.contarCartasPorValor(cartas)){
			if(item.value == 2){
				i++
			}
		}
		return i == 2
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas){
		List<Integer> retorno = []
		Map.Entry<ValorDaCarta, Integer> kicker = obterEntryKicker(cartas)
		cartas = removerKicker(cartas)
		retorno.add(CategoriaUtil.ordenarPorValor(cartas).get(cartas.size() - 1).valor.ordinal())
		retorno.add(kicker.key.ordinal())
		return retorno
	}

	private List<Carta> removerKicker(List<Carta> cartas) {
		Map.Entry<ValorDaCarta, Integer> kicker = obterEntryKicker(cartas)
		List<Carta> pares = new ArrayList<>(cartas);

		for (Carta carta in cartas) {
			if (carta.valor == kicker.key) {
				pares.remove(carta)
			}
		}
		return pares
	}

	private Map.Entry<ValorDaCarta, Integer> obterEntryKicker(List<Carta> cartas) {
		Map.Entry<ValorDaCarta, Integer> kicker = null
		for(Map.Entry<ValorDaCarta, Integer> item in CategoriaUtil.contarCartasPorValor(cartas)){
			if(!kicker || (kicker && kicker.value > item.value)){
				kicker = item
			}
		}
		return kicker
	}
}

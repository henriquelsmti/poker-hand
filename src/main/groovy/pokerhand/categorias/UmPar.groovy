package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class UmPar implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {
		Map<ValorDaCarta, Integer> map = CategoriaUtil.contarCartasPorValor(cartas)
		map.containsValue(2) && map.containsValue(1) && !map.containsValue(3) && !map.containsValue(4)
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas){
		Map.Entry<ValorDaCarta, Integer> maior = obterEntryMaiorContagem(cartas)
		List<Integer> retorno = []
		List<Carta> cartasSemPares = new ArrayList<>(cartas)
		for(Carta carta in cartas){
			if(carta.valor == maior.key){
				cartasSemPares.remove(carta)
			}
		}
		retorno.add(maior.key.ordinal())
		cartasSemPares = CategoriaUtil.ordenarPorValor(cartasSemPares)
		cartasSemPares = cartasSemPares.reverse()
		cartasSemPares.each {
			retorno.add(it.valor.ordinal())
		}
		return retorno;
	}

	private obterEntryMaiorContagem(List<Carta> cartas){
		Map.Entry<ValorDaCarta, Integer> maior = null
		for(Map.Entry<ValorDaCarta, Integer> item in CategoriaUtil.contarCartasPorValor(cartas)){
			if(!maior || (maior && maior.value < item.value)){
				maior = item
			}
		}
		return maior
	}
}

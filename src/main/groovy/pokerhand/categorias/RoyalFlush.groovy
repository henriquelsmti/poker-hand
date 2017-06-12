package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.type.Nipe
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class RoyalFlush implements Categoria{

	@Override
	boolean pertence(List<Carta> cartas){
		if(!CategoriaUtil.eDoMesmoNipe(cartas))
			return false

		return contemOValor(cartas, ValorDaCarta.DEZ) &&
				contemOValor(cartas, ValorDaCarta.VALETE) &&
				contemOValor(cartas, ValorDaCarta.RAINHA) &&
				contemOValor(cartas, ValorDaCarta.REI) &&
				contemOValor(cartas, ValorDaCarta.AS)

	}



	private boolean contemOValor(List<Carta> cartas, ValorDaCarta valor){
		for(Carta carta in cartas){
			if(carta.valor == valor)
				return true
		}
		false
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas){
		return Arrays.asList(Integer.MAX_VALUE)
	}
}

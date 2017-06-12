package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.RoyalFlush
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class RoyalFlushSpec extends Specification{


	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("TC JC QC KC AC")

		expect:
		new RoyalFlush().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("TC JC QC KC AC")

		expect:
		new RoyalFlush().obterValorDesempate(cartas) == Integer.MAX_VALUE
	}
}

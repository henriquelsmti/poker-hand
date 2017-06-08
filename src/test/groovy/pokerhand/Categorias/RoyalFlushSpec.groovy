package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.Quadra
import pokerhand.categorias.RoyalFlush
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class RoyalFlushSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper()

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("TC JC QC KC AC")

		expect:
		new RoyalFlush().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("TC JC QC KC AC")

		expect:
		new RoyalFlush().obterValorDesempate(cartas) == Integer.MAX_VALUE
	}
}

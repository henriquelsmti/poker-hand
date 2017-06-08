package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.Sequencia
import pokerhand.categorias.StraightFlush
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class StraightFlushSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper()

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("2C 3C 4C 5C 6C")

		expect:
		new StraightFlush().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("2C 3C 4C 5C 6C")

		expect:
		new StraightFlush().obterValorDesempate(cartas) == ValorDaCarta.SEIS.ordinal()
	}
}

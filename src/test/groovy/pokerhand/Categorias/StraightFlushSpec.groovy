package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.StraightFlush
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class StraightFlushSpec extends Specification{


	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("2C 3C 4C 5C 6C")

		expect:
		new StraightFlush().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("2C 3C 4C 5C 6C")

		expect:
		new StraightFlush().obterValoresDesempate(cartas) ==  Arrays.asList(ValorDaCarta.SEIS.ordinal())
	}
}

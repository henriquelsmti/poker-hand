package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.Quadra
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class QuadraSpec extends Specification{
	PokerHandHelper helper = new PokerHandHelper();

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("5H 5C 5C 5S TS")

		expect:
		new Quadra().pertence(cartas)

	}

	def "testar obterValorDesempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("5H 5C 5C 5S TS")

		expect:
		new Quadra().obterValorDesempate(cartas) == ValorDaCarta.DEZ.ordinal()
	}
}

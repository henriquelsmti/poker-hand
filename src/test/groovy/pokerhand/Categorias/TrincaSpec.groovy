package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.StraightFlush
import pokerhand.categorias.Trinca
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class TrincaSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper();

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("TD 3C KH KS KC")

		expect:
		new Trinca().pertence(cartas)

	}

	def "testar obterValorDesempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("TD 3C KH KS KC")

		expect:
		new Trinca().obterValorDesempate(cartas) == ValorDaCarta.DEZ.ordinal()
	}
}

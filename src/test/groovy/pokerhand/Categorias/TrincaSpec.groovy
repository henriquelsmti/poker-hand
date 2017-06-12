package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.Trinca
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class TrincaSpec extends Specification{


	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("TD 3C KH KS KC")

		expect:
		new Trinca().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("TD 3C KH KS KC")

		expect:
		new Trinca().obterValorDesempate(cartas) == ValorDaCarta.DEZ.ordinal()
	}
}

package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.Quadra
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class QuadraSpec extends Specification{

	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5H 5C 5C 5S TS")

		expect:
		new Quadra().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5H 5C 5C 5S TS")

		expect:
		new Quadra().obterValorDesempate(cartas) == ValorDaCarta.DEZ.ordinal()
	}
}

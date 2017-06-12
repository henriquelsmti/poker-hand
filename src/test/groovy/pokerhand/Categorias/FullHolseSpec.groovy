package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.FullHolse
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class FullHolseSpec extends Specification{

	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5S 5D AC AS AH")

		expect:
		new FullHolse().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5S 5D AC AS AH")

		expect:
		new FullHolse().obterValorDesempate(cartas) == ValorDaCarta.AS.ordinal()
	}
}

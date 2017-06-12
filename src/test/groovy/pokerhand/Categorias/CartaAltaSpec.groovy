package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.CartaAlta
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class CartaAltaSpec extends Specification{


	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5C JH 4S 3S 8S")

		expect:
		new CartaAlta().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5C JH 4S 3S 8S")

		expect:
		new CartaAlta().obterValorDesempate(cartas) == ValorDaCarta.VALETE.ordinal()
	}
}

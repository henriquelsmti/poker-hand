package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.CartaAlta
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class CartaAltaSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper();

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("5C JH 4S 3S 8S")

		expect:
		new CartaAlta().pertence(cartas)

	}

	def "testar obterValorDesempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("5C JH 4S 3S 8S")

		expect:
		new CartaAlta().obterValorDesempate(cartas) == ValorDaCarta.VALETE.ordinal()
	}
}

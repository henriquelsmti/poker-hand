package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.CartaAlta
import pokerhand.categorias.DoisPares
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class DoisParesSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper();

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("TC TS QS QH AS")

		expect:
		new DoisPares().pertence(cartas)

	}

	def "testar obterValorDesempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("TC TS QS QH AS")

		expect:
		new DoisPares().obterValorDesempate(cartas) == ValorDaCarta.AS.ordinal()
	}
}

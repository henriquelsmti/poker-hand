package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.Flush
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class FlushSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper();

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("AS AS KS 7S 3S")

		expect:
		new Flush().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("AS AS KS 7S 3S")

		expect:
		new Flush().obterValorDesempate(cartas) == ValorDaCarta.AS.ordinal()
	}
}

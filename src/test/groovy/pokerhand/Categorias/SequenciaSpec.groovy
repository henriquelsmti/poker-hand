package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.RoyalFlush
import pokerhand.categorias.Sequencia
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class SequenciaSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper();

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("2S 3H 4D 5H 6C")

		expect:
		new Sequencia().pertence(cartas)

	}

	def "testar obterValorDesempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("2S 3H 4D 5H 6C")

		expect:
		new Sequencia().obterValorDesempate(cartas) == ValorDaCarta.SEIS.ordinal()
	}
}

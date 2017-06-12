package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.Sequencia
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class SequenciaSpec extends Specification{


	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("2S 3H 4D 5H 6C")

		expect:
		new Sequencia().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("2S 3H 4D 5H 6C")

		expect:
		new Sequencia().obterValorDesempate(cartas) == ValorDaCarta.SEIS.ordinal()
	}
}

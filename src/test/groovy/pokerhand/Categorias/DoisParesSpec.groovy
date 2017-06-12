package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.DoisPares
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class DoisParesSpec extends Specification{

	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("TC TS QS QH AS")

		expect:
		new DoisPares().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("TC TS QS QH AS")

		expect:
		new DoisPares().obterValoresDesempate(cartas) == Arrays.asList(ValorDaCarta.RAINHA.ordinal(), ValorDaCarta.AS.ordinal())
	}
}

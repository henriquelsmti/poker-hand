package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.UmPar
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class UmParSpec extends Specification{


	def "testar pertence"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5C 8H 4S AS AS")

		expect:
		new UmPar().pertence(cartas)

	}

	def "testar obter valor do desempate"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("5C 8H 4S AS AS")

		expect:
		new UmPar().obterValoresDesempate(cartas) ==  Arrays.asList(ValorDaCarta.AS.ordinal(),
				ValorDaCarta.OITO.ordinal(),
				ValorDaCarta.CINCO.ordinal(),
				ValorDaCarta.QUATRO.ordinal())
	}
}

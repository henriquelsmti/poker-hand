package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.Trinca
import pokerhand.categorias.UmPar
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class UmParSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper();

	def "testar pertence"(){
		given:
		List<Carta> cartas = helper.construirCartas("5C 8H 4S AS AS")

		expect:
		new UmPar().pertence(cartas)

	}

	def "testar obterValorDesempate"(){
		given:
		List<Carta> cartas = helper.construirCartas("5C 8H 4S AS AS")

		expect:
		new UmPar().obterValorDesempate(cartas) == ValorDaCarta.OITO.ordinal()
	}
}

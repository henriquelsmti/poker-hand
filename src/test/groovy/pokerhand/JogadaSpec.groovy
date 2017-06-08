package pokerhand

import pokerhand.categorias.Flush
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class JogadaSpec extends Specification{

	PokerHandHelper helper = new PokerHandHelper();

	def "valor de desenpate da jogada"(){
		given:
		Jogada jogada = helper.contruirJogada("AS AS KS 7S 3S")

		expect:
		jogada.obterValorDesempate() == ValorDaCarta.AS.ordinal()
	}
}

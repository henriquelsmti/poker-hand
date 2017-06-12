package pokerhand

import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class JogadaSpec extends Specification{


	def "valor de desenpate da jogada"(){
		given:
		Jogada jogada = PokerHandUtil.contruirJogada("AS AS KS 7S 3S")

		expect:
		jogada.obterValoresDesempate() == Arrays.asList(ValorDaCarta.AS.ordinal())
	}
}

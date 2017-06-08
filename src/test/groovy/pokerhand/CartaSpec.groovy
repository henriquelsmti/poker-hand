package pokerhand

import pokerhand.type.Nipe
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class CartaSpec extends Specification{

	def "testar equals"(){
		given:
		Carta carta1 = new Carta(Nipe.ESPADAS, ValorDaCarta.OITO)
		Carta carta2 = new Carta(Nipe.ESPADAS, ValorDaCarta.OITO)

		expect:
		carta1 == carta2
	}

	def "testar toString"(){
		given:
		Carta carta = new Carta(Nipe.ESPADAS, ValorDaCarta.OITO)

		expect:
		carta.toString() == "8S"
	}

}


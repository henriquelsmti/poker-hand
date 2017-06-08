package pokerhand

import pokerhand.type.Nipe
import pokerhand.type.Regra
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class PokerHandHelperSpec extends Specification{

	def "contrução das cartas"(){
		given:
		String mao = "${ carta1 } ${ carta2 } ${ carta3 } ${ carta4 } ${ carta5 }"

		when:
		List<Carta> cartas = new PokerHandHelper().construirCartas(mao)
		then:
		cartas.contains carta1
		cartas.contains carta2
		cartas.contains carta3
		cartas.contains carta4
		cartas.contains carta5
		where:
		carta1                                     | carta2                                     | carta3                                  | carta4                                 | carta5
		new Carta(Nipe.COPAS, ValorDaCarta.DOIS)   | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.OUROS, ValorDaCarta.TRES)   | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)  | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.ESPADAS, ValorDaCarta.CINCO)| new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.OUROS, ValorDaCarta.SEIS)   | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.PAUS, ValorDaCarta.SEIS)    | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.COPAS, ValorDaCarta.OITO)   | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.OUROS, ValorDaCarta.NOVE)   | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.COPAS, ValorDaCarta.DEZ)    | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.PAUS, ValorDaCarta.RAINHA)  | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)
		new Carta(Nipe.ESPADAS, ValorDaCarta.REI)  | new Carta(Nipe.OUROS, ValorDaCarta.VALETE) | new Carta(Nipe.COPAS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.DEZ) | new Carta(Nipe.PAUS, ValorDaCarta.QUATRO)

	}

	def "construção das categorias"(){
		when:
		PokerHandHelper helper = new PokerHandHelper()
		Regra regraCriada = helper.obterRegra(helper.construirCartas(jogada))

		then:
		regraCriada == regra

		where:
		jogada           | regra
		"TC JC QC KC AC" | Regra.ROYAL_FLUSH
		"2C 3C 4C 5C 6C" | Regra.STRAIGHT_FLUSH
		"5H 5C 5C 5S TS" | Regra.QUADRA
		"5S 5D AC AS AH" | Regra.FULL_HOLSE
		"AS AS KS 7S 3S" | Regra.FLUSH
		"2S 3H 4D 5H 6C" | Regra.SEQUENCIA
		"TD 3C KH KS KC" | Regra.TRINCA
		"TC TS QS QH AS" | Regra.DOIS_PARES
		"5C 8H 4S AS AS" | Regra.UM_PAR
		"5C JH 4S 3S 8S" | Regra.CARTA_ALTA

	}
}

package pokerhand

import pokerhand.type.Nipe
import pokerhand.type.Regra
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class PokerHandHelper {

	Jogada contruirJogada(String jogadaString){
		List<Carta> cartas = construirCartas(jogadaString)
		return new Jogada(cartas, obterRegra(cartas))
	}

	List<Carta> construirCartas(String jogadaString){
		List<Carta> cartas = []
		for(String carta in jogadaString.split(" ")){
			cartas.add(new Carta(Nipe.obterPorValor(carta[1]), ValorDaCarta.obterPorValor(carta[0])))
		}
		cartas
	}

	Regra obterRegra(List<Carta> cartas){
		for(Regra tipo in Regra.values()){
			if(tipo.categoria.pertence(cartas)){
				return tipo
			}
		}
		throw new RuntimeException("A categoria não foi encontrada")
	}
}

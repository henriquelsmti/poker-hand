package pokerhand

import pokerhand.type.Regra

/**
 * Created by henriquemota on 06/06/17.
 */
class Jogada {

	List<Carta> cartas;
	Regra regra;

	Jogada(List<Carta> cartas, Regra regra){
		this.cartas = cartas;
		this.regra = regra;
	}

	int obterValorDesempate(){
		regra.categoria.obterValorDesempate(cartas);
	}

}

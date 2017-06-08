package pokerhand

import pokerhand.type.Nipe
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class Carta {

	Nipe nipe;
	ValorDaCarta valor;

	Carta(Nipe nipe, ValorDaCarta valor){
		this.nipe = nipe;
		this.valor = valor;
	}

	@Override
	boolean equals(Object obj) {
		if(!obj || !(obj instanceof Carta)){return false}

		Carta carta = obj as Carta

		return nipe == carta.nipe && valor == carta.getValor()

	}

	@Override
	String toString() {
		return "${valor.valor}${nipe.valor}"
	}
}

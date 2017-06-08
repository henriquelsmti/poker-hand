package pokerhand.type

import pokerhand.Categoria
import pokerhand.categorias.CartaAlta
import pokerhand.categorias.DoisPares
import pokerhand.categorias.Flush
import pokerhand.categorias.FullHolse
import pokerhand.categorias.Quadra
import pokerhand.categorias.RoyalFlush
import pokerhand.categorias.Sequencia
import pokerhand.categorias.StraightFlush
import pokerhand.categorias.Trinca
import pokerhand.categorias.UmPar

/**
 * Created by henriquemota on 06/06/17.
 */
enum Regra {

	ROYAL_FLUSH(new RoyalFlush()),
	STRAIGHT_FLUSH(new StraightFlush()),
	QUADRA(new Quadra()),
	FULL_HOLSE(new FullHolse()),
	FLUSH(new Flush()),
	SEQUENCIA(new Sequencia()),
	TRINCA(new Trinca()),
	DOIS_PARES(new DoisPares()),
	UM_PAR(new UmPar()),
	CARTA_ALTA(new CartaAlta())


	private Categoria categoria

	private Regra(Categoria categoria) {
		this.categoria = categoria
	}

	Categoria getCategoria(){
		this.categoria
	}
}
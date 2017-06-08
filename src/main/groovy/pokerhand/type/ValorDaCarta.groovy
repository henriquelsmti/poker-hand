package pokerhand.type

/**
 * Created by henriquemota on 06/06/17.
 */
enum ValorDaCarta {
	DOIS("2"),
	TRES("3"),
	QUATRO("4"),
	CINCO("5"),
	SEIS("6"),
	SETE("7"),
	OITO("8"),
	NOVE("9"),
	DEZ("T"),
	VALETE("J"),
	RAINHA("Q"),
	REI("K"),
	AS("A")

	private String valor

	private ValorDaCarta(String valor){
		this.valor = valor
	}

	String getValor(){
		this.valor
	}

	int getPeso(){
		this.ordinal()
	}

	static ValorDaCarta obterPorValor(valor){
		for(ValorDaCarta item in values()){
			if(item.valor == valor) {
				return item
			}
		}
		throw new RuntimeException("O valor ${valor} não foi encontrado no enum!")
	}

}

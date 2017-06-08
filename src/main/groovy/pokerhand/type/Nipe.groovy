package pokerhand.type

/**
 * Created by henriquemota on 06/06/17.
 */
enum Nipe {

	ESPADAS("S"),
	COPAS("H"),
	OUROS("D"),
	PAUS("C");

	private String valor;

	private Nipe(value){
		this.valor = value;
	}

	static Nipe obterPorValor(valor){
		for(Nipe item in Nipe.values()){
			if(item.valor.equals(valor)) {
				return item;
			}
		}
		throw new RuntimeException("O valor ${valor} não foi encontrado no enum!");
	}

	String getValor(){
		return valor
	}



}
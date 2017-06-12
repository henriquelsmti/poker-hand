package pokerhand

import pokerhand.type.Result

/**
 * Created by henriquemota on 06/06/17.
 */
class PokerHand {

	Jogada jogada

	PokerHand(String jogada){
		this.jogada = PokerHandUtil.contruirJogada(jogada)
	}

	Result compareWith(PokerHand other){
		int result = other.getJogada().regra.ordinal().compareTo(jogada.regra.ordinal())

		if(result == 0){
			List<Integer> desenpateThis = jogada.obterValoresDesempate()
			List<Integer> desenpateOther =  other.getJogada().obterValoresDesempate()

			for(int i = 0; i < desenpateThis.size(); i++){
				result = desenpateThis[i].compareTo(desenpateOther[i]);
				if(result != 0){
					return obterRetorno(result)
				}
			}
		}

		obterRetorno(result)
	}

	private Result obterRetorno(int result){
		if(result > 0){
			return Result.WIN
		}else if(result < 0){
			return Result.LOSS
		}
		return null
	}

}

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
			return jogada.obterValorDesempate().compareTo(other.getJogada().obterValorDesempate()) > 0? Result.WIN : Result.LOSS
		}

		if(result > 0){
			return Result.WIN
		}else if(result < 0){
			return Result.LOSS
		}
		null
	}

}

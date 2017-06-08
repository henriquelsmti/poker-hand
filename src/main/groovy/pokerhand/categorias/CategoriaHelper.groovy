package pokerhand.categorias

import pokerhand.Carta
import pokerhand.type.Nipe
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class CategoriaHelper {


	int contarMaiorOcorrenciadeMesmoValor(List<Carta> cartas) {
		Map<ValorDaCarta, Integer> map = contarCartasPorValor(cartas);
		obterMaiorContagem(map);
	}

	List<Carta> obterCartasMaiorValor(List<Carta> cartas){
		Map<ValorDaCarta, Integer> map = contarCartasPorValor(cartas);
		ValorDaCarta maior = obterValorDaCartaDaMaiorContagem(map);
		List<Carta> retorno = new ArrayList<>();
		for(Carta carta in cartas){
			if(carta.valor == maior)
				retorno.add(carta);
		}
		return retorno;
	}

	private int obterMaiorContagem(Map<ValorDaCarta, Integer> map){
		Integer maior;
		for(Map.Entry<ValorDaCarta, Integer> item in map.entrySet()) {
			if (!maior || (maior && maior < item.value)) {
				maior = item.value;
			}
		}
		return maior
	}

	ValorDaCarta obterValorDaCartaDaMaiorContagem(Map<ValorDaCarta, Integer> map){
		Map.Entry maior;
		for(Map.Entry<ValorDaCarta, Integer> item in map.entrySet()){
			if(!maior || (maior && maior.value < item.value)){
				maior = item;
			}
		}
		maior.key;
	}

	Map<ValorDaCarta, Integer> contarCartasPorValor(List<Carta> cartas){
		Map<ValorDaCarta, Integer> map = new HashMap<>();
		for (Carta carta in cartas) {
			Integer cont = map.get(carta.valor);
			if(cont){
				map.put(carta.valor, cont + 1);
			}else{
				map.put(carta.valor, 1);
			}
		}
		map;
	}

	boolean eDoMesmoNipe(List<Carta> cartas){
		Nipe nipe = cartas[0].nipe;
		for(Carta carta in cartas){
			if(nipe != carta.nipe)
				return false;
		}
		true;
	}

	boolean emSequanciaDeValor(List<Carta> cartas){
		cartas = ordenarPorValor(cartas);
		int fatorDaOrdem = cartas.get(0).valor.ordinal();

		for(Carta carta in cartas){
			if(carta.valor.ordinal() != fatorDaOrdem)
				return false;
			fatorDaOrdem++;
		}
		true;
	}

	List<Carta> ordenarPorValor(List<Carta> cartas){
		List<Carta> listaOrdenada = new ArrayList<>(cartas);
		listaOrdenada.sort{it.valor.ordinal()};
		listaOrdenada;
	}

}
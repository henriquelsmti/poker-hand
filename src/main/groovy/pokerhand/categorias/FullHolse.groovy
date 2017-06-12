package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria
import pokerhand.type.ValorDaCarta

/**
 * Created by henriquemota on 06/06/17.
 */
class FullHolse implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {
		CategoriaUtil.contarMaiorOcorrenciadeMesmoValor(cartas) == 3 && CategoriaUtil.contarCartasPorValor(cartas).size() == 2
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas) {
		Map<ValorDaCarta, Integer> map = CategoriaUtil.contarCartasPorValor(cartas)
		return Arrays.asList(CategoriaUtil.obterValorDaCartaDaMaiorOcorrencia(map).ordinal())
	}
}

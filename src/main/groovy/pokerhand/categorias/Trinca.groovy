package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria

/**
 * Created by henriquemota on 06/06/17.
 */
class Trinca implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {
		CategoriaUtil.contarMaiorOcorrenciadeMesmoValor(cartas) == 3
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas) {
		List<Carta> cartasMenores = new ArrayList<>(cartas)
		cartasMenores.removeAll(CategoriaUtil.obterCartasMaiorValor(cartas))
		cartasMenores = CategoriaUtil.ordenarPorValor(cartasMenores)

		return Arrays.asList(cartasMenores[cartasMenores.size() -1].valor.ordinal())
	}
}

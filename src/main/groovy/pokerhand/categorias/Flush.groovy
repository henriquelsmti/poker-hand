package pokerhand.categorias

import pokerhand.Carta
import pokerhand.Categoria

/**
 * Created by henriquemota on 06/06/17.
 */
class Flush implements Categoria{
	@Override
	boolean pertence(List<Carta> cartas) {
		CategoriaUtil.eDoMesmoNipe(cartas)
	}

	@Override
	List<Integer> obterValoresDesempate(List<Carta> cartas) {
		List<Integer> list = Arrays.asList(CategoriaUtil.obterCartasMaiorValor(cartas)[0].valor.ordinal())
		//comportamento estranho, alista e limpa ao retornar
		return new ArrayList<Integer>(list)
	}
}

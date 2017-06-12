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
	int obterValorDesempate(List<Carta> cartas) {
		CategoriaUtil.obterCartasMaiorValor(cartas)[0].valor.ordinal()
	}
}

package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandHelper
import pokerhand.categorias.CategoriaHelper
import pokerhand.type.Nipe
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class CategoriaHelperSpec extends Specification{

	PokerHandHelper pokerHandHelper = new PokerHandHelper()
	CategoriaHelper helper = new CategoriaHelper()


	def "conta a maior ocorrenciade de mesmo valor"() {
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("7H 7C QC JS TS")

		expect:
		helper.contarMaiorOcorrenciadeMesmoValor(cartas) == 2
	}

	def "obtem as cartas maior valor"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("AH AC QC JS TS")
		List<Carta> resultado = pokerHandHelper.construirCartas("AH AC")

		expect:
		helper.obterCartasMaiorValor(cartas) == resultado
	}


	def "obtem o valor da carta com a maior ocorrencia de valor"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("AH AC QC JS TS")
		Map<ValorDaCarta, Integer> map = helper.contarCartasPorValor(cartas)
		expect:
		helper.obterValorDaCartaDaMaiorOcorrencia(map) == ValorDaCarta.AS
	}

	def "contar cartas por valor"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("AH AC QC JS TS")
		Map<ValorDaCarta, Integer> resultado = [:]
		resultado.put(ValorDaCarta.AS , 2)
		resultado.put(ValorDaCarta.RAINHA, 1)
		resultado.put(ValorDaCarta.VALETE, 1)
		resultado.put(ValorDaCarta.DEZ, 1)

		expect:
		helper.contarCartasPorValor(cartas) == resultado
	}

	def "é do mesmo nipe"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("AH AH QH JH TH")

		expect:
		helper.eDoMesmoNipe(cartas)
	}

	def "não do mesmo nipe"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("AH AC QC JS TS")

		expect:
		!helper.eDoMesmoNipe(cartas)
	}

	def "em sequancia de valor"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("2H 3C 4C 5S 6S")

		expect:
		helper.emSequanciaDeValor(cartas)
	}

	def "não esta em sequancia de valor"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("AH AC QC JS TS")

		expect:
		!helper.emSequanciaDeValor(cartas)
	}

	def "ordenar por valor"(){
		given:
		List<Carta> cartas = pokerHandHelper.construirCartas("AH AC QC 2S TS")

		expect:
		helper.ordenarPorValor(cartas).get(0).valor == ValorDaCarta.DOIS
		helper.ordenarPorValor(cartas).get(cartas.size() - 1).valor == ValorDaCarta.AS
	}
}

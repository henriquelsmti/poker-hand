package pokerhand.Categorias

import pokerhand.Carta
import pokerhand.PokerHandUtil
import pokerhand.categorias.CategoriaUtil
import pokerhand.type.ValorDaCarta
import spock.lang.Specification

/**
 * Created by henriquemota on 08/06/17.
 */
class CategoriaHelperSpec extends Specification{



	def "conta a maior ocorrenciade de mesmo valor"() {
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("7H 7C QC JS TS")

		expect:
		CategoriaUtil.contarMaiorOcorrenciadeMesmoValor(cartas) == 2
	}

	def "obtem as cartas maior valor"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("AH AC QC JS TS")
		List<Carta> resultado = PokerHandUtil.construirCartas("AH AC")

		expect:
		CategoriaUtil.obterCartasMaiorValor(cartas) == resultado
	}


	def "obtem o valor da carta com a maior ocorrencia de valor"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("AH AC QC JS TS")
		Map<ValorDaCarta, Integer> map = CategoriaUtil.contarCartasPorValor(cartas)
		expect:
		CategoriaUtil.obterValorDaCartaDaMaiorOcorrencia(map) == ValorDaCarta.AS
	}

	def "contar cartas por valor"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("AH AC QC JS TS")
		Map<ValorDaCarta, Integer> resultado = [:]
		resultado.put(ValorDaCarta.AS , 2)
		resultado.put(ValorDaCarta.RAINHA, 1)
		resultado.put(ValorDaCarta.VALETE, 1)
		resultado.put(ValorDaCarta.DEZ, 1)

		expect:
		CategoriaUtil.contarCartasPorValor(cartas) == resultado
	}

	def "é do mesmo nipe"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("AH AH QH JH TH")

		expect:
		CategoriaUtil.eDoMesmoNipe(cartas)
	}

	def "não do mesmo nipe"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("AH AC QC JS TS")

		expect:
		!CategoriaUtil.eDoMesmoNipe(cartas)
	}

	def "em sequancia de valor"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("2H 3C 4C 5S 6S")

		expect:
		CategoriaUtil.emSequanciaDeValor(cartas)
	}

	def "não esta em sequancia de valor"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("AH AC QC JS TS")

		expect:
		!CategoriaUtil.emSequanciaDeValor(cartas)
	}

	def "ordenar por valor"(){
		given:
		List<Carta> cartas = PokerHandUtil.construirCartas("AH AC QC 2S TS")

		expect:
		CategoriaUtil.ordenarPorValor(cartas).get(0).valor == ValorDaCarta.DOIS
		CategoriaUtil.ordenarPorValor(cartas).get(cartas.size() - 1).valor == ValorDaCarta.AS
	}
}

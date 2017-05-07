package tests;

import org.junit.Test;

import pack.Pedregal;

public class TestPedregal {

	@Test
	public void testCaso00() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/00_CasoEjemplo/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/00_CasoEjemplo/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso01() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/01_LaCasaCabeJustoEnElPedregalPeroLosPeñascosEstorban/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/01_LaCasaCabeJustoEnElPedregalPeroLosPeñascosEstorban/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso02() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/02_LaCasaNoCabeEnElPedregal/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/02_LaCasaNoCabeEnElPedregal/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso03() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/03_LaCasaCabeYTodosLosCasillerosNoOcupadosTienenPeñascos/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/03_LaCasaCabeYTodosLosCasillerosNoOcupadosTienenPeñascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso04() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/04_SoloHayUnaUbicaciónParaLaCasa/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/04_SoloHayUnaUbicaciónParaLaCasa/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso05() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/05_TodoElTerrenoTienePeñascos/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/05_TodoElTerrenoTienePeñascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso06() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/06_PeñascosEnLasPuntasYEnElCentro/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/06_PeñascosEnLasPuntasYEnElCentro/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso07() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/07_VariasUbicacionesPosiblesParaLaCasa/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/07_VariasUbicacionesPosiblesParaLaCasa/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso08() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/08_LaCasaSoloCabeEnLasFronterasDelTerreno/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/08_LaCasaSoloCabeEnLasFronterasDelTerreno/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso09() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/09_LaCasaCaberíaSiSeVoltease/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/09_LaCasaCaberíaSiSeVoltease/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso10() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/10_CasoFatiga1000Peñascos/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/10_CasoFatiga1000Peñascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso11() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/11_CasoFatigaCasaConUnaDimensiónMáxima/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/11_CasoFatigaCasaConUnaDimensiónMáxima/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso12() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/12_CasoFatigaTerrenoConUnaDimensiónMáxima/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/12_CasoFatigaTerrenoConUnaDimensiónMáxima/salida producida/pedregal.out");
	}
	
}

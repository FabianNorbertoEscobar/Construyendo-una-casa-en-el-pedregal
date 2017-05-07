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
		Pedregal pedregal = new Pedregal("LoteDePrueba/01_LaCasaCabeJustoEnElPedregalPeroLosPe�ascosEstorban/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/01_LaCasaCabeJustoEnElPedregalPeroLosPe�ascosEstorban/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso02() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/02_LaCasaNoCabeEnElPedregal/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/02_LaCasaNoCabeEnElPedregal/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso03() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/03_LaCasaCabeYTodosLosCasillerosNoOcupadosTienenPe�ascos/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/03_LaCasaCabeYTodosLosCasillerosNoOcupadosTienenPe�ascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso04() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/04_SoloHayUnaUbicaci�nParaLaCasa/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/04_SoloHayUnaUbicaci�nParaLaCasa/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso05() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/05_TodoElTerrenoTienePe�ascos/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/05_TodoElTerrenoTienePe�ascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso06() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/06_Pe�ascosEnLasPuntasYEnElCentro/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/06_Pe�ascosEnLasPuntasYEnElCentro/salida producida/pedregal.out");
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
		Pedregal pedregal = new Pedregal("LoteDePrueba/09_LaCasaCaber�aSiSeVoltease/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/09_LaCasaCaber�aSiSeVoltease/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso10() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/10_CasoFatiga1000Pe�ascos/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/10_CasoFatiga1000Pe�ascos/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso11() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/11_CasoFatigaCasaConUnaDimensi�nM�xima/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/11_CasoFatigaCasaConUnaDimensi�nM�xima/salida producida/pedregal.out");
	}
	
	@Test
	public void testCaso12() {
		Pedregal pedregal = new Pedregal("LoteDePrueba/12_CasoFatigaTerrenoConUnaDimensi�nM�xima/entrada/pedregal.in");
		pedregal.resolucion("LoteDePrueba/12_CasoFatigaTerrenoConUnaDimensi�nM�xima/salida producida/pedregal.out");
	}
	
}

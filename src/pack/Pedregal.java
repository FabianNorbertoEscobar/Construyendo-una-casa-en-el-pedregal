package pack;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Pedregal {

	private int anchoTerreno;
	private int altoTerreno;

	private int anchoCasa;
	private int altoCasa;

	private boolean terreno[][];

	public int getAnchoTerreno() {
		return anchoTerreno;
	}

	public void setAnchoTerreno(int anchoTerreno) {
		this.anchoTerreno = anchoTerreno;
	}

	public int getAltoTerreno() {
		return altoTerreno;
	}

	public void setAltoTerreno(int altoTerreno) {
		this.altoTerreno = altoTerreno;
	}

	public int getAnchoCasa() {
		return anchoCasa;
	}

	public void setAnchoCasa(int anchoCasa) {
		this.anchoCasa = anchoCasa;
	}

	public int getAltoCasa() {
		return altoCasa;
	}

	public void setAltoCasa(int altoCasa) {
		this.altoCasa = altoCasa;
	}

	public boolean getCasilla(int x, int y) {
		return terreno[x][y];
	}

	public void setCasilla(int x, int y, boolean valor) {
		terreno[x][y] = valor;
	}

	public boolean isPeñasco(int x, int y) {
		return this.getCasilla(x, y) == true;
	}

	public void setPeñasco(int x, int y) {
		this.setCasilla(x, y, true);
	}

	public Pedregal(String path) {
		try {
			FileReader file = new FileReader(path);
			Scanner scan = new Scanner(file);

			this.setAnchoTerreno(scan.nextInt());
			this.setAltoTerreno(scan.nextInt());

			terreno = new boolean[this.getAnchoTerreno()][this.getAltoTerreno()];

			this.setAnchoCasa(scan.nextInt());
			this.setAltoCasa(scan.nextInt());

			int peñascos = scan.nextInt();
			for (int i = 0; i < peñascos; i++) {
				int xPeñasco = scan.nextInt();
				int yPeñasco = scan.nextInt();

				this.setPeñasco(xPeñasco - 1, yPeñasco - 1);
			}

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo levantar el archivo de entrada del pedregal");
		}
	}

	public void resolucion(String path) {
		try {
			FileWriter file = new FileWriter(path);
			BufferedWriter buffer = new BufferedWriter(file);

			for (int i = 0; i < this.getAnchoTerreno(); i++) {
				for (int j = 0; j < this.getAltoTerreno(); j++) {
					
					if (this.casaCabeDesdeCasilla(i, j)) {
						if (this.ubicarCasa(i, j) == true) {
							buffer.write("SI");
							buffer.newLine();
							buffer.write((i + 1) + " " + (j + 1));
							buffer.newLine();
							buffer.write(this.orientacionCasa());
							buffer.close();
							return;
						}
					}
				}
			}

			buffer.write("NO");
			buffer.close();
		} catch (IOException e) {
			System.out.println("No se pudo generar el archivo de salida del pedregal");
		}
	}
	
	private boolean casaCabeDesdeCasilla(int i, int j) {
		return (this.getAnchoTerreno() - i >= this.getAnchoCasa()) && (this.getAltoTerreno() - j >= this.getAltoCasa());
	}

	private boolean ubicarCasa(int i, int j) {
		for (int x = i; x < this.getAnchoCasa(); x++) {
			for (int y = j; y < this.getAltoCasa(); y++) {
				if (this.isPeñasco(x, y)) {
					return false;
				}
			}
		}
		return true;
	}

	private char orientacionCasa() {
		Random rand = new Random();
		if (this.getAnchoCasa() > this.getAltoCasa()) {
			if (rand.nextInt() % 2 == 0) {
				return 'N';
			} else {
				return 'S';
			}
		} else {
			if (rand.nextInt() % 2 == 0) {
				return 'E';
			} else {
				return 'O';
			}
		}
	}
	
	public void mostrarTerreno() {
		for (int i = 0; i < this.getAnchoTerreno(); i++) {
			for (int j = 0; j < this.getAltoTerreno(); j++) {
				if (this.isPeñasco(i, j)) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

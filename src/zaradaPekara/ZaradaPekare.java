package zaradaPekara;



public class ZaradaPekare {
	/*enum Sedmica {
		ponedeljak, utorak, sreda, cetvrtak, petak, subota, nedelja
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int brojPekara = 10, brojDana = 7, i, j, minZaradaDana = 0;
		double minZarada;
		String noviUnos = "ne";
		double[][] ZaradaPekare = new double[][] { { 100, 350, 420, 543, 605, 528, 65 },
				{ 200, 350, 420, 458, 543, 605, 528 }, { 300, 432, 350, 420, 543, 605, 528 },
				{ 400, 257, 350, 420, 543, 605, 528 }, { 500, 350, 420, 543, 435, 605, 528 },
				{ 600, 350, 541, 420, 543, 605, 528 }, { 700, 756, 350, 420, 543, 605, 528 },
				{ 800, 350, 420, 543, 543, 605, 528 }, { 900, 543, 350, 420, 543, 605, 528 },
				{ 1000, 231, 350, 420, 543, 605, 528 } };
		double[] ukupnaZaradaPekare = new double[brojPekara];
		double[] zaradaPoDanima = new double[brojDana];
		//Sedmica Dani;
		System.out.println("Da li zelite da unesete nove vrednosti ?");
		noviUnos = TextIO.getlnString();
		if (noviUnos.equalsIgnoreCase("da")) {
			for (i = 0; i < brojPekara; i++) {
				for (j = 0; j < brojDana; j++) {
					System.out.println("Unesite zaradu " + (i + 1) + ". pekare za " + (j + 1) + "dan");
					ZaradaPekare[i][j] = TextIO.getlnDouble();
				}
			}
		}

		for (i = 0; i < brojPekara; i++) {
			for (j = 0; j < brojDana; j++) {
				System.out.print(ZaradaPekare[i][j] + "  ");
			}
			System.out.println();
		}

		for (j = 0; j < brojDana; j++) {
			zaradaPoDanima[j] = 0;
		}
		
		for (i = 0; i < brojPekara; i++) {
			ukupnaZaradaPekare[i] = 0;
			}

		for (i = 0; i < brojPekara; i++) {
			for (j = 0; j < brojDana; j++) {
				ukupnaZaradaPekare[i] += ZaradaPekare[i][j];
				zaradaPoDanima[j] += ZaradaPekare[i][j];
			}
		}
	
		for (i = 0; i < brojPekara; i++) {
			System.out.println("Ukupna zarada " + (i + 1) + ". pekare je " + ukupnaZaradaPekare[i]);
		
		}
		
		System.out.println();
		minZarada = zaradaPoDanima[0];
		for (j = 0; j < brojDana; j++) {
			System.out.println("Ukupna zarada svih pekara " + (j + 1) + ". dana je " + zaradaPoDanima[j]);
			if (minZarada > zaradaPoDanima[j]) {
				minZarada = zaradaPoDanima[j];
				minZaradaDana = j;

			}
		}
		System.out.println();
		System.out.println("Najmanje je zaradjeno " + (minZaradaDana + 1) + ". dana i to: " + minZarada);

	}
}

package osiguranje;

public class Osiguranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int brojkateg = 5;
		final int brojdana = 30;
		double[][] osiguranje = new double[brojkateg][brojdana];
		double[] osiguranjePoKategoriji = new double[brojkateg];
		//double[] osiguranjePoDanu = new double[brojdana];
		double[] prosMesPrihod = new double[brojdana];
		int i = 0, j = 0;
		String noviUnos = "ne";
		
		for (i = 1; i < brojkateg; i++) {
			for (j = 0; j < brojdana; j++) {
				System.out.print("Unesite iznos za " + (i + 1) + ". kategoriju, za " + (j + 1) + " dan:");
				osiguranje[i][j] = TextIO.getlnDouble();
			}
		}
		for (i = 1; i < brojkateg; i++) {
			for (j = 0; j < brojdana; j++) {
				System.out.print(osiguranje[i][j] + " ");
			}
		}
		
		System.out.print("Da li zelite da unesete nove vrednosti?");
		noviUnos = TextIO.getlnString();
		if (noviUnos != "ne") {
			for (i = 1; i < brojkateg; i++) {
				for (j = 0; j < brojdana; j++) {
					System.out.print("Unesite iznos za " + (i + 1) + ". kategoriju, za " + (j + 1) + " dan:");
					osiguranje[i][j] = TextIO.getlnDouble();
				}
			}
		}
		
		double minPrihod = osiguranje [0][0];
		int minKateg = i;
		int minDan = j;
		for (i = 0; i < brojkateg; i++) {
			for (j = 0; j < brojdana; j++) {
				if (minPrihod > osiguranje[i][j]) {
					minPrihod = osiguranje[i][j];
					minKateg++;
					minDan++;
				}
			}
		}
		System.out.print("Najmanji prihod je " + minPrihod + " i ostvaren je u " + (minKateg + 1) + ". kategoriji, " + (minDan + 1) + ". dana." );
		System.out.println();
		
		osiguranjePoKategoriji[i] = 0;
		for (i = 0; i < brojkateg; i++) {
			for (j = 0; j < brojdana; j++) {
				osiguranjePoKategoriji[i] += osiguranje[i][j];
			}
		}
		for (i = 0; i < brojkateg; i++) {
			System.out.print("Ukupni mesecni prihod za kategoriju " + (i + 1) + ". je " + osiguranjePoKategoriji + ".");
		}
		for (i = 0; i < brojkateg; i++) {
		prosMesPrihod[i] = osiguranjePoKategoriji[i] / brojdana;
		System.out.print("Prosecni mesecni prihod za kategoriju " + (i + 1) + ". je " + prosMesPrihod + ".");
		}
	}

}

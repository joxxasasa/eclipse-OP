package osiguranjeCas;

public class Osiguranje {
	
	static final int KATEGORIJE = 5;
	static final int DANI = 30;

	public static void main(String[] args) {
		
		double[][] evidencijaOsiguranja = new double[DANI][KATEGORIJE];
		double[] kategorijeOsiguranja = new double[KATEGORIJE];
		double[] danOsiguranja = new double[DANI];
		int izbor, i = 0, j = 0;
		double min, ukPrihod, prihKat, prosPrihod;
		
		do {
			prikaziMeni();
			
			izbor = napraviIzbor("", 0, 7);
			
			switch(izbor) {
				case 1: unesiPrihod(evidencijaOsiguranja); 
						break;
				case 2: izmeniPrihod(evidencijaOsiguranja);
						break;
				case 3: sortKategorije(evidencijaOsiguranja);
						break;
				case 4: sortDani(evidencijaOsiguranja);
						break;
				case 5: minPrihod(min);
						break;
				case 6: ukPrihod(ukPrihod);
						break;
				case 7: ukPrihodKat(prihKat);
						break;
				case 8: prosPrihod();
						break;
			
			}
			
		} while (izbor != 0);

	}
	
	static void prikaziMeni() {
		System.out.println("M E N I");
		System.out.println("1--Unesi prihod.");
		System.out.println("2--Izmeni prihod.");
		System.out.println("3--Sortiranje po kategoriji.");
		System.out.println("4--Sortiranje po danu.");
		System.out.println("5--Minimalni prihod.");
		System.out.println("6--Ukupan Prihod.");
		System.out.println("7--Prosecan prihod.");
		
	}
	
	static int napraviIzbor(String poruka, int dole, int gore) {
		int vrati;
		
		System.out.print(poruka);
		
		do { 
			vrati = TextIO.getlnInt();
			if ((vrati < 0) || (vrati > 0)) {
				System.out.println("Morate uneti vrednost u intervalu od " + dole + " do " + gore);
				
			} 
		} while ((vrati < 0) || (vrati > 0));
			
		return vrati;
		
	}
		
	
	
	static void unesiPrihod(double[][] evidencijaOsiguranja) {
		
	}
	
	static void izmeniPrihod(double[][] evidencijaOsiguranja) {
		
	}
	
	static double sortKategorije(double[][] evidencijaOsiguranja) {
		
	}
	
	static double sortDani(double[][] evidencijaOsiguranja) {
		
	}
	static double minPrihod(double min) {
		double minPrihod = evidencijaOsiguranja[0][0];
		int minKateg = i;
		int minDan = j;
		for (i = 0; i < KATEGORIJE; i++) {
			for (j = 0; j < DANI; j++) {
				if (minPrihod > evidencijaOsiguranja[i][j]) {
					minPrihod = evidencijaOsiguranja[i][j];
					minKateg++;
					minDan++;
				}
			}
		}
		System.out.print("Najmanji prihod je " + minPrihod + " i ostvaren je u " + (minKateg + 1) + ". kategoriji, " + (minDan + 1) + ". dana." );
		System.out.println();
		
	}
	static double ukPrihod(double ukPrihod) {
		osiguranjePoKategoriji[i] = 0;
		for (i = 0; i < brojkateg; i++) {
			for (j = 0; j < brojdana; j++) {
				osiguranjePoKategoriji[i] += osiguranje[i][j];
	}
}

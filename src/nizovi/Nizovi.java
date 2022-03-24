package nizovi;



public class Nizovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//public class nizovi {
	/*enum Dan { PONEDELJAK, UTORAK, SREDA, CETVRTAK, PETAK, SUBOTA, NEDELJA}
	enum Mesec { JANUAR, FEBRUAR, MART, APRIL, MAJ, JUN, JUL, AUGUST, SEPTEMBAR, OKTOBAR,
	NOVEMBAR, DECEMBAR }*/
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1 = "Program";
		String s2 = "iranje";
		String s3 = " i programski jezici";
		System.out.println("String s1: " + s1);
		s1 = s1 + s2;
		System.out.println("String s1 nakon prve konkatacije: " + s1);
		s1 = s1 + s3;
		System.out.println("String s1 nakon prve konkatacije: " + s1);
		System.out.println("String s1 konvertovan u mala slova: " + s1.toLowerCase());
		System.out.println("String s1 konvertovan u velika slova: " + s1.toUpperCase());
		System.out.println("Karakter na 3.oj poziciji u stringu s1: " + s1.charAt(2));
		System.out.println("Rezultat poredjenja stringova s1 i s3: " + s1.compareTo(s3));
		System.out.println("Rezultat poredjenja da li su stringovi s2 i s3 jednaki: " +
		s2.equals(s3));
		System.out.println("Podstring stringa s1 izmedju 4 i 10 karaktare je: " +
		s1.substring(3, 9));
		
		s1.length();
		System.out.println("Broj karaktare je: " + s1.length());
		
		String s4 = "Trenutno ne mogu ";
		String s5 = "da se javim, ";
		String s6 = "na predavanju sam.";
		
		s4 = s4 + s5;
		s4 = s4 + s6;
		System.out.println("String s4: " + s4);
		System.out.println("String s4 konvertovan u mala slova: " + s4.toLowerCase());
		System.out.println("String s4 konvertovan u velika slova: " + s4.toUpperCase());
		
		
		/*Dan danRodjenja; // promenljiva tipa Dan.
		Mesec mesecRodjenja; // promenljiva tipa Mesec.
		danRodjenja = Dan.SUBOTA; // dodela vrednosti promenljivoj tipa Dan.
		mesecRodjenja = Mesec.FEBRUAR; // dodela vrednosti promenljivoj tipa Mesec.
		System.out.println("Moj znak je vodolija, jer sam ja rodjen u " + mesecRodjenja + "u.");
		System.out.println("To je "+ (mesecRodjenja.ordinal() + 1) + ". mesec godine."); // zasto +1
		System.out.println("Dan kada sam se rodio je " + danRodjenja + ".");
		System.out.println( danRodjenja + " je " + danRodjenja.ordinal() + ". dan nedelje.");*/
		
		/*int a = -3;
		a = Math.abs(a);
		System.out.println ("Apsolutna vrednost od a je " + a);*/
		
		/*double a = 1.9564;
		a = Math.round(a);
		System.out.println("Zaokruzena vrednost od a je " + a);
		
		String s1 = "ja se zovem sasa";
		System.out.print(s1.toUpperCase());*/
		
		/*int [] nizInt = new int[10];
		System.out.println("Unesite ");
		for (int i = 0; i < nizInt.length; i++)
			nizInt[ i ] = TextIO.getlnInt();*/
		
		/*final int MAXELNIZA = 50; // final sluzi da oznaci vrednost koja se vise ne moze menjati
		int N = 1, i, suma = 0;
		int NizPrirordnihBrojeva[] = new int[MAXELNIZA];
		System.out.println("Program za racunanje sume elemenata niza N prirodnih brojeva.");
		System.out.print("Unesite N:\t"); // prihvati broi elemenata niza
		N = TextIO.getlnInt();
		for (i = 0; i < N; i++){ // prihvati elemente niza od korisnika
		System.out.println("Unesite " + (i+1) + ". element niza:\t");
		NizPrirordnihBrojeva[ i ] = TextIO.getlnInt();
		}
		/*for (i = 0; i < N; i++) // izracunaj sumu elemenata niza
		suma += NizPrirordnihBrojeva[ i ];
		System.out.println("Suma elemenata niza iznosi " + suma + ".");*/
		
		/*int maxBroj = NizPrirordnihBrojeva[ 0 ];
		int pozicija = 0;
		for (i = 0; i < N; i++) {
			if (maxBroj > NizPrirordnihBrojeva[ 0 ])
				maxBroj = NizPrirordnihBrojeva[ 0 ];
				pozicija = i;
		}
		System.out.println("Max broj je  " + maxBroj + "na poziciji " + pozicija);*/
		
		/*Dat je niz X od maksimalno 12 celobrojnih elemenata. Uèitati n
		elemenata u niz X i formirati nizove A i B, pri èemu su elementi niza A
		parni elementi niza X, a elementi niza B su neparni elementi niza X*/
		
		int MAXELNIZA = 12;
		int n, i, j, z;
		int [] prviNiz = new int [MAXELNIZA];
		int [] parniNiz = new int [MAXELNIZA];
		int [] neparniNiz = new int [MAXELNIZA];
		System.out.println("Unesite broj clanova niza:");
		n = TextIO.getlnInt();
		for (i = 0; i < n; i++) {
		System.out.println("Unesite " + (i+1) + ".clan niza:");
		prviNiz[i] = TextIO.getlnInt();
		}
		
		for (i = 0; i < MAXELNIZA; i++) {
			j = 0;
			if (prviNiz[i] % 2 == 0) {
				parniNiz[j] = prviNiz[i];
				j++;
		}
			else {
				z = 0;
				neparniNiz[z]= prviNiz[i];
				z++;
	}
		System.out.println(parniNiz);
		System.out.println(neparniNiz);
	
		}
	}
	}



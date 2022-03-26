package kvadratBrojeva;

public class KvadratBrojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*int broj; // Broj koji treba da unese korisnik. 
		 int kvadrat; // Uneti broj pomnozen samim sobom - kvadrat broja.
		 System.out.print("Unesite neki ceo broj: "); 
		 broj = TextIO.getlnInt();
		 kvadrat = broj * broj; 
		 System.out.println();
		 System.out.println("Broj koji ste uneli je " + broj);
		 System.out.println("Kvadrat unetog broja je " + kvadrat);
		 System.out.println();*/
		 

		
		 /*double investicija; // Vrednost investicije. 
		 double stopa; // Kamatana stopa.
		 double zarada; // Ukupna kamata po godini.
		 System.out.print("Unesite vrednost investicije: "); 
		 investicija = TextIO.getlnDouble(); 
		 System.out.print("Unesite vrednost kamatne stope: ");
		 stopa = TextIO.getlnDouble(); 
		 zarada = investicija * stopa; 
		 investicija = investicija + zarada; // Izracunavanje zarade.
		 System.out.println("Za godinu dana zaradjeno je: " + zarada + " dinara.");
		 System.out.println("Ukupna vrednost investije je sada: " + investicija + " dinara.");*/
		 

		/* Definicija promenljive */
		//int ocena;
		/* Unos podatka 
		
		 System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		 System.out.print("Unesite ocenu: "); 
		 ocena = TextIO.getlnInt(); 
		 
		
		 if (ocena == 1) //Odredjivanje uspeha i ispis
		 {
		 System.out.println("Nedovoljan!");
		 } 
		 else if (ocena == 2)
		 {
		 System.out.println("Dovoljan!");
		 } 
		 else if (ocena == 3)
		 {
		 System.out.println("Dobar!");
		 } 
		 else if (ocena == 4)
		 {
		 System.out.println("Vrlo dobar!");
		 } 
		 else if (ocena == 5)
		 {
		 System.out.println("Odlican!");
		 } 
		 else
		 {
		 System.out.println("Ocena nije validna!");
		 }*/
		 
		 //Definicija promenljive 
		// int ocena;
		 /* Unos podatka */
	
		 /*System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		 System.out.print("Unesite ocenu: "); 
		 ocena = TextIO.getlnInt();
		 
		 //Odredjivanje uspeha i ispis 
		
		 switch (ocena) {
		 case 1: System.out.println("Nedovoljan!"); 
		 break; 
		 case 2: System.out.println("Dovoljan!"); 
		 break; 
		 case 3: System.out.println("Dobar!");
		 break; 
		 case 4: System.out.println("Vrlo dobar!"); 
		 break; 
		 case 5:
		 System.out.println("Odlican!"); 
		 break; 
		 default: System.out.println("Ocena mora biti izmedju 1 i 5.");}*/
	

		
		 /*int opcija; 
		 System.out.println("Izaberite jednu od ponudjenih opcija?");
		 System.out.println(); 
		 System.out.println(" 1. Unos studenta");
		 System.out.println(" 2. Izmena studenta");
		 System.out.println(" 3. Brisanje studenta");
		 System.out.println(" 4. Prikaz studenta"); 
		 System.out.println();
		 System.out.println("Vas izbor je: "); 
		 opcija = TextIO.getlnInt(); 
		 switch (opcija ) { 
		 case 1: System.out.println("Izabrali ste prvu opciju."); 
		 break;
		 
		 case 2: System.out.println("Izabrali ste drugu opciju."); 
		 break; 
		 case 3: System.out.println("Izabrali ste trecu opciju."); 
		 break; 
		 case 4: System.out.println("Izabrali ste cetvrtu opciju."); 
		 break; 
		 default: System.out.println("Niste odabrali ni jednu od ponudjenih opcija");
		 System.exit(1);
		 }*/

		
		 /*int ocena;
		 System.out.println("Program za ispis uspeha na osnovu unete ocene!"); 
		 //do-while petlja se koristi da se proveri ulazna vrednost /*
		 do{
		 System.out.print("Unesite ocenu: "); 
		 ocena = TextIO.getlnInt(); 
		 if ((ocena < 1)||(ocena > 5)) 
			 System.out.println("Ocena mora biti izmedju 1 i 5."); }
		 while ((ocena < 1)||(ocena > 5));
		 	switch (ocena){ 
				 case 1: System.out.println("Nedovoljan!"); 
				 break; 
				 case 2: System.out.println("Dovoljan!"); 
				 break; 
				 case 3: System.out.println("Dobar!");
				 break; 
				 case 4: System.out.println("Vrlo dobar!"); 
				 break; 
				 case 5: System.out.println("Odlican!");
		 }*/

		/*int broj = 1, i = 1, fakt = 1;
		System.out.println("Program za racunanje faktorijala unetog broja.");
		System.out.println("Unesite broj: ");
		do {
			broj = TextIO.getlnInt();
			if (broj < 0)
				System.out.println("Broj mora biti veci ili jednak 0. Unesite ponovo broj: ");
		} while (broj < 0);
		while (i <= broj) {
			fakt *= i;
			i++; // uzrokuje da (i <= broj) konvergira nuli
		}
		System.out.println("Faktorijal broja " + broj + " je: " + fakt + ".");*/
		
		/*int N = 1;
		int i, suma = 0;
		System.out.println("Program za racunanje sume prvih N prirodnih brojeva.");
		System.out.println("Unesite N: ");
		do {
		N = TextIO.getlnInt();
		if (N < 1)
		System.out.println("N mora biti veci od 0. Unesite ponovo N: ");
		} while (N < 1);
		i = 1; // inicijalizacija brojaca
		while (i <= N) { // uslov
		suma += i; // telo
		i++; // azuriranje brojaca
		}
		System.out.println("Suma prvih " + N + " prirodnih brojeva je: " + suma + ".");*/
		
		/*String str; // linija teksta koju unosi korisnik.
		int ukSlova; // ukupan broj razlicitih slova u str tekstu.
		char slovo; // Slovo iz alfabeta.
		int i; // indeks slova u nizu karaktera string str.
		System.out.println("Unesite jedan red teskta:");
		str = TextIO.getln();
		str = str.toUpperCase();
		ukSlova = 0;
		System.out.println("Vas red teksta sadrzi sledeca slova:");
		System.out.println();
		System.out.print(" ");
		for ( slovo = 'A'; slovo <= 'Z'; slovo++ ) {
			for ( i = 0; i < str.length(); i++ ) {
			if ( slovo == str.charAt(i) ) {
			System.out.print(slovo);
			System.out.print(' ');
			ukSlova++;
			break;
			}
			}
			}
			System.out.println();
			System.out.println();
			System.out.println("Otkriveno je " + ukSlova + " razlicitih slova.");*/
			
			
		/*double x;
		int z;
		System.out.print("Unesite broj ");
		x = TextIO.getlnDouble();
		if (x <= 0)
			z = 0;
		else 
			z = 1;
		System.out.print("Vrednost z pri unosu x=" + x + " je " + z);*/
		
		/*double x;
		double y;
		
		System.out.println("Unestite prvi broj x");
		x = TextIO.getlnDouble();
		System.out.println("Unestite drugi broj y");
		y = TextIO.getlnDouble();
		
		if (x == y)
			System.out.println("Brojevi su jednaki.");
		else {
			if (x > y)
				System.out.println("Prvi broj x je veci od drugog broja y");
			else
				System.out.println("Prvi broj x je manji od drugog broja y");
		}*/
		
			/*Napisati program koji odredjuje koji je broj najmanji u sekvenci
			od N brojeva. Korisnik unosi N, a zatim brojeve (-10..100).*/
			
		/*int N = 2;
		int broj;
		
		System.out.println("Unesite koliko ukupno brojeva ima:");
		N = TextIO.getInt();
		if (N > 111)
			System.out.println("Unos vise od 111 brojeva nije moguc!");
		else
			System.out.println("Unesite brojeve koji se uporedjuju:");*/
			
		 /*int i=1;
	        int min=1000;
	         
	        while (i<=111){
	            System.out.print("br"+i+"=");
	            int n=TextIO.getiInt();
	            min ;
	            i++;
	        }
	        System.out.print("Suma ucitanih brojeva je: " +s);*/
		
	}

}

package operatori;

public class logickiOperatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 3;
		int b = 4;
		System.out.print(a == b);*/
		
		/*boolean a = true;
		boolean b = false;
		boolean c = false;
		
		System.out.print(a == b == c);*/
		
		/* Deklaracija promenljivih. */
		/*boolean a = true, b = false;
		/* Negacija. */
		/*System.out.print("Negacija od true je: "); System.out.println(!a);
		System.out.print("Negacija od false je: "); System.out.println(!b);
		/* I operacija. */
		/*System.out.print("true I false je: "); System.out.println(a && b);
		System.out.print("true I true je: "); System.out.println(a && a);
		System.out.print("false I false je: "); System.out.println(b && b);
		/* ILI operacija. */
		/*System.out.print("true ILI false je: "); System.out.println(a || b);
		System.out.print("true ILI true je: "); System.out.println(a || a);
		System.out.print("false ILI false je: "); System.out.println(b || b);
		/* Eksluzivno ILI operacija. */
		/*System.out.print("true EXILI false je: "); System.out.println(a ^ b);
		System.out.print("true EXILI true je: "); System.out.println(a ^ a);
		System.out.print("false EXILI false je: "); System.out.println(b ^ b);*/
		
		/*int x = 5;
		int y = 7;
		int suma = 2;
		
		suma *= x + y;
		System.out.print(suma);*/
		
		long vremePocetka; // Vreme pocetka rada programa u milisekundama.
		long vremeKraja; // Vreme kraja rada programa u milisekundama.
		double vreme; // Ukupno vreme trajanja programa.
		double sirina = 42.0, visina = 17.0, hipotenuza; // strane trougla
		vremePocetka = System.currentTimeMillis();
		hipotenuza = Math.sqrt( sirina*sirina + visina*visina );
		System.out.print("Pravougli trougao cije su stranice 42 i 17 ima hipotenuzu: ");
		System.out.println(hipotenuza);
		System.out.print("sin(1)*sin(1) + cos(1)*cos(1) - 1 je ");
		System.out.println( Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) - 1 );
		System.out.print("Slucajno generisana vrednost: ");
		System.out.println( Math.random() );
		System.out.print("Broj PI ima vrednost: ");
		System.out.println( Math.PI );
		vremeKraja = System.currentTimeMillis();
		vreme = (vremeKraja - vremePocetka) / 1000.0;
		System.out.print("Ukupno trajanje programa u sekundama je: ");
		System.out.println(vreme);
	}

}

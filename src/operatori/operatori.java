package operatori;

public class operatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 5; 
		int b = 3;
		int z = a + b;
		int r = a - b;
		int p = a * b;
		int d = a / b;
		int m = a % b;
		System.out.print("Za zadate vrednosti a=" + a);
		System.out.print(" i b=" + b);
		System.out.print(" dobijamo sledece rezultate:\n");
		System.out.println("z=" + z);
		System.out.println("r=" + r);
		System.out.println("p=" + p);
		System.out.println("d=" + d);
		System.out.println("m=" + m);*/
		
		/* Deklaracija promenljivih. 
		boolean a = true, b = false;
		/* Negacija. 
		System.out.print("Negacija od true je: "); System.out.println(!a);
		System.out.print("Negacija od false je: "); System.out.println(!b);
		 I operacija. 
		System.out.print("true I false je: "); System.out.println(a && b);
		System.out.print("true I true je: "); System.out.println(a && a);
		System.out.print("false I false je: "); System.out.println(b && b);
		 ILI operacija. 
		System.out.print("true ILI false je: "); System.out.println(a || b);
		System.out.print("true ILI true je: "); System.out.println(a || a);
		System.out.print("false ILI false je: "); System.out.println(b || b);
		Eksluzivno ILI operacija. 
		System.out.print("true EXILI false je: "); System.out.println(a ^ b);
		System.out.print("true EXILI true je: "); System.out.println(a ^ a);
		System.out.print("false EXILI false je: "); System.out.println(b ^ b);*/
		
		/* Deklaracija promenljivih. */
		/*double gravitacija = -9.81;
		double inicijalnoUbrzanje = 0.0;
		double vremePadanja = 10.0;
		double inicijalnaPozicija = 0.0;
		double finalnaPozicija = .5 * gravitacija * vremePadanja *vremePadanja;
		 //Izracunavanje. 
		finalnaPozicija += inicijalnoUbrzanje * vremePadanja;
		//finalnaPozicija = finalnaPozicija + inicijalnoUbrzanje * vremePadanja;
		finalnaPozicija += inicijalnaPozicija;
		//finalnaPozicija = finalnaPozicija + inicijalnaPozicija;
		/* Ispisivanje rezultata. 
		System.out.print("Pozicija objekta nakon ");
		System.out.print(vremePadanja);
		System.out.print(" sekundi je ");
		System.out.print(finalnaPozicija);
		System.out.print("m.");*/
		
		/*double r = 3;//(V=1/3*r*r*H*PI) FLOAT TIP PROMENLJIVIH
		double H = 5;
		double pi = 3.14;
		double V;
		V = 0.33 * r * r * H * pi; // Math.PI
		System.out.print("Ako je poluprecnik r=" + r);
		System.out.print(" i visina H=" + H);
		System.out.print(" zapremina kupe je V=" + V);*/
		
		/*double d = 3;//R=RCu*4*l/(d*d*3.14)
		double l = 5;
		//double pi = 3.14;
		double RCu = 1.588*10-8;
		double R = RCu * 4 * l / ( d * d * 3.14);
		System.out.print("Ako je poluprecnik d=" + d);
		System.out.print(" i duzina l=" + l);
		System.out.print(" otpornost bakarnog provodnika je RCu=" + RCu);*/
		
		//p=n*R*T/V, gde je R 8.314472
		double n = 1;
		double T = 5;
		double V = 89;
		double R = 8.314472;
		double p = n * R * T / V;
		System.out.print("Pritisak jednog mola idealnog gasa je p=" + p);
		
		//A=2*r*(r+H)*PI
		/*double r = 6;
		double H = 5;
		double pi = 3.14;
		double A;
		A = 2 * r * (r + H) * pi;
		System.out.print("Ako je poluprecnik r=" + r);
		System.out.print(" i visina H=" + H);
		System.out.print(" povrsina valjka je A=" + A);*/
		
		
	}

}

package kvadratnaJednacina;

public class kvadratnaJednacina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, D; 
		double x, x1, x2, x3;
		char i = 1;
		
		
		System.out.print("Unesite koeficijent a=");
		a = TextIO.getlnInt();
			if (a == 0) {
				System.out.println("Prilikom unosenja 0 za koeficijent a dobijamo linearnu jednacinu.");}
			else
		System.out.print("Unesite koeficijent b=");
		b = TextIO.getlnInt();
		System.out.print("Unesite koeficijent c=");
		c = TextIO.getlnInt();
		x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		D = b * b - 4 * a * c;
		x3 = -b / 2 * a;
		
			if (b == 0 || c == 0) {
				x = 0;
				System.out.print(x);
				}
			else if (b != 0/* || c == 0*/) {
				x = -b / a;	
				System.out.print(x);
			}
			else if (b == 0/* || c != 0*/) {
				x = Math.sqrt(c / a) * i;
				System.out.print(x + "i");
			}
			else 
				
			
				switch (D) {
				case 1: 
					if (D > 0) {
						System.out.println("Vrednost prvog resenja je x1=" + x1);
						System.out.println("Vrednost prvog resenja je x2=" + x2);
					}
				break;
				
				case 2: 
					if (D == 0 ) {
						System.out.println("Vrednost jedinstvenog zajednickog realnog resenja je x=" + x3);
					}
				break;
		
		}
		//*/
		//System.out.print(x);
		
		
			
		
		
		
		}

}

package potprogrami;

public class Potprogrami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double operand1 = 0, operand2 = 0;
		double zbir = 0, razlika = 0, proizvod = 0, kolicnik = 0;
		System.out.println("--Program za simuliranje kalkulatora--");
		operand1 = unosOperanda("Unesite prvi operand:");
		operand2 = unosOperanda("Unesite drugi operand:");
		System.out.println("--------------------------------------");
		zbir = sabiranje(operand1, operand2);
		razlika = oduzimanje(operand1, operand2);
		proizvod = mnozenje(operand1,operand2);
		kolicnik = deljenje(operand1, operand2);
		prikaziRezultate(operand1, operand2, zbir, razlika, proizvod, kolicnik);
		}
		static int meni(int izbor0, int izbor1, int izbor2, int izbor3, int izbor4) {
		switch	
		case izbor1: zbir = sabiranje(operand1, operand2);
			break;
			case izbor2: razlika = oduzimanje(operand1, operand2);
			break;
			case izbor3: proizvod = mnozenje(operand1,operand2);
			break;
			case izbor4: mnozenje(operand1,operand2);
			break;
			case izbor0: deljenje(operand1, operand2);
			break;
		}
		static double unosOperanda(String poruka){
		double operand = 0.0;
		System.out.println(poruka);
		operand = TextIO.getlnDouble();
		return operand;
		}
		static double sabiranje(double op1, double op2){
			return op1 + op2;
			}
			static double oduzimanje(double op1, double op2){
			return op1 - op2;
			}
			static double mnozenje(double op1, double op2){
			return op1 * op2;
			}
			static double deljenje(double op1, double op2){
			return op1 / op2;
			}
			static void prikaziRezultate(double op1, double op2, double zb, double rz, double pr,
			double kl){
			System.out.println("\n---Rezultati osnovnih operacija su:---");
			System.out.printf("\n%8.2f + %8.2f = %8.2f\n", op1, op2, zb);
			System.out.printf("\n%8.2f - %8.2f = %8.2f\n", op1, op2, rz);
			System.out.printf("\n%8.2f * %8.2f = %8.2f\n", op1, op2, pr);
			System.out.printf("\n%8.2f / %8.2f = %8.2f\n\n", op1, op2, kl);
			System.out.println("--------------------------------------");
			*/
		/*
			int broj = 5;
			povecajBroj(broj);
			System.out.println("Vrednost broja nakon povratka u main: " + broj);
			}
			static void povecajBroj(int brojZaUvecavanje){
			System.out.println("Vrednost broja koji stize u potprogram: " + brojZaUvecavanje);
			brojZaUvecavanje++;
			System.out.println("Vrednost broja nakon uvecanja u potprogramu: " + brojZaUvecavanje);
			*/
		
			int[] intNiz = {1, 2, 3};
			promeniNiz(intNiz);
			System.out.println("Vrednost niza nakon povratka u main: ");
			System.out.print(" [" + intNiz[0] + "," + intNiz[1] + "," + intNiz[2] + "]");
			System.out.println();
			}
			static void promeniNiz(int[] intNizPar){
			int i = 0;
			System.out.println("Vrednost niza koji stize u potprogram: ");
			System.out.print(" [" + intNizPar[0] + "," + intNizPar[1] + "," + intNizPar[2] + "]");
			System.out.println();
			for (i = 0; i < 3; i++)
			intNizPar[i]++;
			System.out.println("Vrednost niza nakon uvecanja u potprogram: ");
			System.out.print(" [" + intNizPar[0] + "," + intNizPar[1] + "," + intNizPar[2] + "]");
			System.out.println();

	}

}

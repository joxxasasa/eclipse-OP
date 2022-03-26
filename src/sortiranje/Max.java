package sortiranje;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.print("n(kvadratna matrica)  ");
        
        int n = TextIO.getlnInt();
        int niz[][] = new int[n][n];
 
        System.out.print("unesi clanove ");
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                System.out.print("X[" +i+ "," +j +"]"+ "-->");
                niz[i][j] = TextIO.getlnInt();
            }
        }
        for (int i = 0; i < niz.length; i++) {
            System.out.println();
            for (int j = 0; j < niz[i].length; j++) {
                System.out.print(niz[i][j] + " ");
            }
        }
        System.out.println();
        int max = niz[0][0];
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz[i].length; j++) {
                if (max < niz[i][j])
                    max = niz[i][j];
            }
        }
        System.out.print("Najveci clan matrice: " + max);
	}

}

public class Main {
    public static void main(String[] args) {
        int[][] mioArray2 = {{120, 125, 180, 140},
                {178, 180, 141, 135},
                {149, 178, 134, 130}};
        int sommaCol[] = new int[mioArray2[0].length];

        System.out.println("Righe della matrice: " + mioArray2.length);
        System.out.println("Colonne della matrice: " + mioArray2[0].length);
        System.out.println("\nMATRICE E SOMMATORIA DELLE COLONNE: ");
        System.out.println("FOR annidato:");

        for (int r = 0; r < mioArray2.length; r++) {
            for (int c = 0; c < mioArray2[r].length; c++) {
                System.out.print(mioArray2[r][c] + "\t");
                sommaCol[c] = sommaCol[c] + mioArray2[r][c];
            }
            System.out.println();
        }
        System.out.println("---------------");
        for (int i = 0; i < sommaCol.length; i++) {
            System.out.print(sommaCol[i] + "\t");
        }
        int[] sommaCol2={0,0,0,0};
        System.out.println();
        System.out.println("\nFOREACH annidato:");
        for (int r[] : mioArray2) {
            System.out.println();
            for (int c : r) {
                System.out.print(c + "\t");
            }
        }
    }
}
package com.campusdual.classroom;

public class Exercise19 {

    private static String getTridimensionalString(int[][][] intArrayTri, int[][] flatMatrix) {

        int rows = intArrayTri[0].length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(stringFlatMatrixRow(flatMatrix, i));
            sb.append("   →   ");
            sb.append(stringTriMatrixRow(intArrayTri, i));
            sb.append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();

    }

    private static String stringTriMatrixRow(int[][][] intArrayTri, int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArrayTri.length-1; i++){
            sb.append(getUnidimensionalString(intArrayTri[i][row]));
            sb.append("   ");
        }
        sb.append(getUnidimensionalString(intArrayTri[intArrayTri.length-1][row]));

        return sb.toString();
    }

    private static String stringFlatMatrixRow(int[][] flatMatrix, int row) {
        return getUnidimensionalString(flatMatrix[row]);
    }

    public static String getTridimensionalString(int[][][] intArrayTri) {
        int[][] flatMatrix = flatTridimensionalArray(intArrayTri);
        return getTridimensionalString(intArrayTri, flatMatrix);
    }

    //TODO
    public static int[][] flatTridimensionalArray(int[][][] intArrayTri) {
                int[][] bidi = new int[3][3];
                int longi = intArrayTri.length;
                int j = 0;
                int k = 0;
        for (int i = 0; i < longi; i++) {
            while (k<longi){
                while (j<longi){
                    int valor = intArrayTri[j][i][k];
                    bidi[i][k] += valor;
                    j++;
                }
                j=0;
                k++;
            }
            k=0;
        }

        return bidi;
    }


    // TODO
    public static String getBidimensionalString(int[][] intArrayBi) {
            int rows = intArrayBi[0].length;
            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(stringFlatMatrixRow(intArrayBi,i));
            sb.append("");
            sb.append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        return sb.toString();
    }

    // TODO
    public static String getUnidimensionalString(int[] uniArray) {
        StringBuilder sb = new StringBuilder(uniArray.length);
        for (int i = 0; i < uniArray.length; i++) {
            int val = uniArray[i];
            sb.append(val);
            sb.append(" ");
        }
        sb.delete(sb.length()-1, sb.length());
        String resultado = sb.toString();
        return resultado;

    }

    // TODO
    public static int[] createAndPopulateUnidimensionalArray(int columns) {
        int[] arrayuni = new int[columns];
        for (int i = 0; i < arrayuni.length; i++) {
            arrayuni[i] = i+1;
        }
        return arrayuni;

    }

    // TODO
    public static int[][] createAndPopulateBidimensionalArray(int rows, int columns) {
        int[][] arraybi = new int[3][3];
       int a = 1;
        for (int i = 0; i < arraybi.length; i++) {
            for (int j = 0; j < arraybi[i].length; j++) {
                arraybi[i][j] = a;
                a++;
            }
        }
        return arraybi;
    }

    // TODO
    public static int[][][] createAndPopulateTridimensionalArray(int depth, int rows, int columns) {
        int[][][] arraytri = new int[depth][rows][columns];
        int a = 0;
        for (int i = 0; i < arraytri.length; i++) {
            for (int j = 0; j < arraytri[i].length; j++) {
                for (int k = 0; k < arraytri[i][j].length; k++) {
                    arraytri[i][j][k] = a + 1;
                    a++;
                }
            }
        }
        return arraytri;
    }

    public static void main(String[] args) {
        int[] uniArray = createAndPopulateUnidimensionalArray(5);
        System.out.println(getUnidimensionalString(uniArray));
        System.out.println("===================");
        int[][] intArrayBi = createAndPopulateBidimensionalArray(5, 5);
        System.out.println(getBidimensionalString(intArrayBi));
        System.out.println("===================");
        int[][][] intArrayTri = createAndPopulateTridimensionalArray(3, 3, 3);
        System.out.println(getTridimensionalString(intArrayTri));
    }
}

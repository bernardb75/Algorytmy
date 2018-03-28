public class Zad6 {
    public static void main(String[] args) {
        int[][] tab = new int[][] { {1,2,3,4}, {5,6,7,8}, {9, 10, 11, 12}, {13,14,15,16}};
        int[][] result = subTab(tab, 1, 1, 2, 2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] subTab(int tab[][], int x, int y, int sizeX, int sizeY){
        int[][] result = new int[sizeX][sizeY];
        int counterX = 0;
        int counterY = 0;
        for (int i = x; i < x + sizeX; i++){
            for (int j = y; j < y + sizeY; j++) {
                result[counterX][counterY] = tab[i][j];
                counterX++;
            }
            counterY++;
            counterX = 0;
        }

        return result;
    }
}

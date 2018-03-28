public class Zad5 {
    public static int[][] horizontal;
    public static int[][] vertical;

    public static void main(String[] args) {
        int[][] tab = new int[][] { {1,2,3,4}, {5,6,7,8}, {9, 10, 11, 12}};

        mirror(tab);
    }

    public static void mirror(int tab[][]){
        //horizontal
        horizontal = new int[tab.length][tab[0].length];


        for (int i = 0; i < horizontal.length; i++) {
            for (int j = 0; j < horizontal[0].length; j++) {
                horizontal[horizontal.length-1-i][j] = tab[i][j];
            }
        }

        for (int i = 0; i < horizontal.length; i++) {
            for (int j = 0; j < horizontal[0].length; j++) {
                System.out.print(horizontal[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------");

        //vertical
        vertical = new int[tab.length][tab[0].length];


        for (int i = 0; i < vertical.length; i++) {
            for (int j = 0; j < vertical[0].length; j++) {
                vertical[i][vertical[0].length-1-j] = tab[i][j];
            }
        }

        for (int i = 0; i < vertical.length; i++) {
            for (int j = 0; j < vertical[0].length; j++) {
                System.out.print(vertical[i][j] + " ");
            }
            System.out.println();
        }
    }
}

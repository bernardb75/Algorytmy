package Zajecia2801.Sortowania.ZbiorZadan;

import java.util.Scanner;

public class NWW {
    public static void main(String[] args) {
        int x,y;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        y=scanner.nextInt();

        System.out.printf("NWW [%s,%s]",x,y+" :wynosi: "+((x*y)/NWD(x,y)));
    }
    public static int NWD(int x,int y){
        while (x!=y){
            if (x>y)
                x-=y;
            else
                y-=x;
        }return x;
    }

}

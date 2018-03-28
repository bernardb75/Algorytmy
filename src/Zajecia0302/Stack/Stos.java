package Zajecia0302.Stack;
//Stos – zadania praktyczne – przeliczanie systemów liczbowych
import java.util.Stack;

public class Stos {
    public static void main(String[] args) {
        int L=10;
        int p=2;
        Stack<Integer> s = new Stack<>();
        do {
            s.push(L%p );
            L=Math.floorDiv(L,p);
        }
        while(L>0);

        while (!s.empty()){
            System.out.println(s.pop());
        }




    }
}

package Zajecia2801.Sortowania.ZbiorZadan;

import java.util.HashMap;
import java.util.Scanner;

public class ZapisDatyKabala {
    public static void main(String[] args) {
        HashMap<Character,Integer> kabala=new HashMap<>();
        kabala.put('A',1);
        kabala.put('B',2);
        kabala.put('C',3);
        kabala.put('D',4);
        kabala.put('E',5);
        kabala.put('F',6);
        kabala.put('G',7);
        kabala.put('H',8);
        kabala.put('I',9);
        kabala.put('K',10);
        kabala.put('L',20);
        kabala.put('M',30);
        kabala.put('N',40);
        kabala.put('O',50);
        kabala.put('P',60);
        kabala.put('Q',70);
        kabala.put('R',80);
        kabala.put('S',90);
        kabala.put('T',100);
        kabala.put('V',200);
        kabala.put('X',300);
        kabala.put('Y',400);
        kabala.put('Z',500);

        Scanner sc=new Scanner(System.in);
        char[] word=sc.nextLine().trim().toUpperCase().toCharArray();
        int sum=0;

        for (int i = 0; i <word.length ; i++) {
            sum+=kabala.get(word[i]);//dla String [get(word.substring(i,i+1))]
        }
        System.out.print(sum);






    }
}

package Zajecia2801.Sortowania;

import java.util.Scanner;

public class Sortowanie {

        public static void main(String[] args) {

            //cz1. generowanie wartosci i kluczy
            char[] arr = {'A', 'B', 'C'};
            String[] keys = new String[27];
            int counter = 0;


            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < arr.length; k++) {

                        sb.append(arr[i]).append(arr[j]).append(arr[k]);
                        keys[counter] = sb.toString();
                        sb.setLength(0);
                        counter++;
                    }
                }
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Ilosc ciagow");
            int n = Integer.parseInt(sc.nextLine());

            //sc.nextLine();

            String[] inputUser = new String[n];
            for (int i = 0; i < n; i++) {
                inputUser[i] = sc.nextLine().toUpperCase();
            }
            int[] counterArray = new int[27];
            for (int i = 0; i < inputUser.length; i++) {
                for (int j = 0; j < keys.length; j++) {
                    if (keys[j].equals(inputUser[i])) {
                        counterArray[j]++;
                        break;
                    }
                }
            }
            for (int i = 0; i < counterArray.length; i++) {
                while (counterArray[i] > 0) {
                    System.out.println(keys[i] + " ");
                    counterArray[i]--;
                }
            }

        }
    }



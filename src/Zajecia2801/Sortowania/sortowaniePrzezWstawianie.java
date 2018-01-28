package Zajecia2801.Sortowania;

public class sortowaniePrzezWstawianie {
    public static void main(String[] args) {
        int[] arr = {6, 8, 7, 2, 1};

        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            int j = i + 1;
            while ((j < arr.length) && (temp > arr[j])) {
                arr[j - 1] = arr[j];
                j++;
            }
            arr[j - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

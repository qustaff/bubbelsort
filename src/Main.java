import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static final int SIZE = 20;
    public static void main(String[] args) {

        System.out.println("bubble sort");
        Scanner scanner = new Scanner(System.in);

        System.out.println("ile liczb posortowac");
        int sizeArray = scanner.nextInt();
        int[] numberArray = new int[sizeArray];
        scanner.nextLine();
        System.out.println("wygenerowana czy z palca?");
        System.out.println("1 - z palca, lub cokolwiek");
        String choice = scanner.nextLine();

        if(!choice.equals("1")){
            System.out.println(" podaj dolny zakres losowania");
            int lower = scanner.nextInt();
            System.out.println(" podaj gorny zakres losowania");
            int upper = scanner.nextInt();
            for(int i = 0; i < sizeArray; i++ ){
                numberArray[i] = (int) (random() * (lower - upper))+lower;
            }
        }else{
            System.out.println("podaj kolejno " + sizeArray +" liczb");

            for(int i = 0; i < sizeArray; i++){
                numberArray[i] = scanner.nextInt();
            }

            System.out.println("NIEPOSORTOWANA");
            for(int i = 0; i < sizeArray; i++){
                System.out.println(numberArray[i] + ", ");
            }
        }

        System.out.println("NIEPOSORTOWANA");
        for(int i = 0; i < sizeArray; i++ ){
            numberArray[i] = (int) (random() * 100);
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println();
        System.out.println("POSORTOWANA");
        int[] sortedArray = new int[SIZE];
        sortedArray = bubbleSort(numberArray);

        for(int i = 0; i < sizeArray; i++ ){
            System.out.print(sortedArray[i] + ", ");
        }
    }

    public static int[] bubbleSort (int[] numberArray){
        int sizeArray = numberArray.length;
        int temp;
        for (int i = sizeArray - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if (numberArray[j] > numberArray[j+1]){
                    temp = numberArray[j];
                    numberArray[j] = numberArray[j+1];
                    numberArray[j+1] = temp;
                }
            }
        }
        return numberArray;
    }
}
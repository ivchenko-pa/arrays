import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static void main() {

        // Level 1.1
        System.out.println("-- Level 1.1 - Print a simple sequence of numbers");
        int[] numbers = {1,2,3,4,5};
        for (int i =0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // Level 1.2
        System.out.println("-- Level 1.2 - Display all elements of an array");
        String[] names = {"Bob", "Ben", "Rem", "Mem" };
        for (String name: names){
            System.out.println(name);
        }

        //Level 1.3
        System.out.println("-- Level 1.3 - Calculate squares of numbers");
        int[] numberToQuadrate = {2,4,6,8};
        for (int i =0; i < numberToQuadrate.length; i++){
            //System.out.println(numberToQuadrate[i] * numberToQuadrate[i]);
            System.out.println((long)Math.pow(numberToQuadrate[i], 2));
        }

        // Level 2.1
        System.out.println("-- Level 2.1 - Print only even numbers");
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++){
            numbers2[i] = i+1;
        }

        for (int i = 1; i < numbers2.length; i = i + 2){
            System.out.println(numbers2[i]);
        }

        for (int i : numbers2){
            if (i % 2 == 0) System.out.println(i);
        }
        // Level 2.2
        System.out.println("-- Level 2.2 - Calculate the sum");

        int[] randomNums = {123, 533, 6454, 45, 3, 76};
        long sum = 0;
        for (int num : randomNums){
            sum += num;
        }
        System.out.println("The sum of all numbers from the array is :" + sum);

        // Level 2.3
        System.out.println("-- Level 2.3 - Print index and value");
        String[] cities = {"Berlin", "Stuttgart", "Dortmund"};

        for(int i =0; i<cities.length; i++){
            System.out.println(cities[i] + " city has index " + i);
        }

        // Level 2.4
        System.out.println("-- Level 2.4 - Find minimum and maximum");
        int[] randomNums2 = {123, 533, 6454, 45, 3, 76};

        int smallest = randomNums2[0];
        int largest = randomNums2[0];
        for (int num : randomNums2){
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("Smallest number is " + smallest + "\nLargest number is " + largest);

        // Level 3.1
        System.out.println("-- Level 3.1: Double array values");

        int[] randomNums3 = {123, 533, 6454, 45, 3, 76};

        for (int i = 0; i<randomNums3.length; i++){
            randomNums3[i] *= 2;
        }
        System.out.println(Arrays.toString(randomNums3));


        // Level 3.2
        System.out.println("-- Level 3.2: Combine two arrays");

        String[] firstNames = {"Bob", "Ben", "Rem"};
        String[] lastNames = {"Smith", "Holms", "Willis" };

        for (int i =0; i < firstNames.length; i++){
            System.out.println(firstNames[i] + " " + lastNames[i]);
        }

        // Level 3.3
        System.out.println("-- Level 3.3: Process user input");
        int numbersAmount = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide " + numbersAmount + " integers delimited by ' ': ");

        int [] array = new int[numbersAmount];

        for (int i = 0; i < numbersAmount; i++){
            array[i] = scanner.nextInt();
        }

        for (int num : array) System.out.println(num);

        // Level 3.4
        System.out.println("-- Level 3.4: Simple grade calculator");

        int [] examScores = {85, 70, 95, 60};
        int sumScores = 0;
        for (int score : examScores) sumScores += score;
        double avg = 1.0 * sumScores / examScores.length;
        if (avg >= 70) {
            System.out.printf("Exam passed! The average score is: %.2f", avg );
        } else {
            System.out.printf("Exam failed! The average score is: %.2f", avg );
        }


        // Level 3.5
        System.out.println("-- Level 3.5: Sort random numbers");

        int[] arrayToBeSorted = {32, 46, 33, 7, 678, 345, 12, 87, 45, 5};
        System.out.println("Initial array: " + Arrays.toString(arrayToBeSorted));
        Arrays.sort(arrayToBeSorted);
        System.out.println("Sorted array: " + Arrays.toString(arrayToBeSorted));
        System.out.println("Max is: " + arrayToBeSorted[arrayToBeSorted.length-1]);
        System.out.println("Min is: " + arrayToBeSorted[0]);
        int sum1 = 0;
        for(int num : arrayToBeSorted){
            sum1 += num;
        }
        System.out.println("Average is: " + 1.0* sum1 / arrayToBeSorted.length);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int[] list = {56,34,1,8,101,-2,-33};

        System.out.println();
        System.out.println("Unsorted List : " + Arrays.toString(list));

        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length-1];

        System.out.println("Sorted List   : " + Arrays.toString(list));
        System.out.println("Minimum Value : " + min);
        System.out.println("Maximum Value : " + max);

        System.out.println("\n***********************************************************************\n");

        int[] list2 = {15,12,788,1,-1,-778,2,0};

        Scanner keyboard = new Scanner(System.in);

        int input;
        ArrayList<Integer> smallerThanInput = new ArrayList<>();
        ArrayList<Integer> biggerThanInput = new ArrayList<>();

        System.out.print("Enter a number : ");
        input = keyboard.nextInt();

        Arrays.sort(list2);

        for (int j : list2) {

            if (input < j) {

                biggerThanInput.add(j);

            }

            if (input > j) {

                smallerThanInput.add(j);

            }

        }

        System.out.println("List                          : " + Arrays.toString(list2));
        System.out.println("Smaller Numbers Than Input    : " + Arrays.toString(smallerThanInput.toArray()));
        System.out.println("Bigger Numbers Than Input     : " + Arrays.toString(biggerThanInput.toArray()));

        if (smallerThanInput.size() == 0){

            System.out.println("There is not a smaller number in this array than input!");

        }else{

            System.out.println("Closest Smaller Number        : " + smallerThanInput.get(smallerThanInput.size()-1));

        }

        if (biggerThanInput.size() == 0){

            System.out.println("There is not a bigger number in this array than input!");

        }else{

            System.out.println("Closest Bigger Number         : " + biggerThanInput.get(0));

        }






    }
}

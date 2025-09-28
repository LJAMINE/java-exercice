package exe;

import java.util.Arrays;
import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {

//tri


        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element of array");
        int n = sc.nextInt();

        int[] notes = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter element ");
            notes[i] = sc.nextInt();
        }
        for (int i = 0; i < notes.length - 1; i++) {
            for (int j = 0; j < notes.length - i - 1; j++) {
                if (notes[j] > notes[j + 1]) {
                    int swap = notes[j + 1];
                    notes[j + 1] = notes[j];
                    notes[j] = swap;
                }
            }
        }

        System.out.println(Arrays.toString(notes));

//notes moyenne

        double somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }
        double moy = somme/notes.length;
        System.out.println("moyenne est "+moy);


//        max et min

        System.out.println("min est" + notes[0]);
        System.out.println("max est" + notes[n-1]);


//  array sort

        Arrays.sort(notes);
        System.out.println(Arrays.toString(notes));

    }

    }




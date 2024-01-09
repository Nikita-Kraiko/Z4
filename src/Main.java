//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i<num;i++){
            a[i] = scanner.nextInt();
        }
        int result = 0;
        for(int i: a){
            result = 10*result+i;
        }
        result++;
        String numString = Integer.toString(result);
        char[] charMass = numString.toCharArray();

        int[] intMass = new int[charMass.length];
        for (int i = 0; i < charMass.length; i++) {
            intMass[i] = Character.getNumericValue(charMass[i]);
        }
        System.out.println(Arrays.toString(intMass));
        


    }
}

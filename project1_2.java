import java.util.Scanner;

public class project1_2 {
    public static void main(String[] args) {
        //print();
       // System.out.println(combinedStr("mohammed", "Ibrhim"));

        //int[] a = {1, 1, 1, 2, 2, 3, 4, 4, 5, 4, 4};

//        System.out.println(compra(3,2,4));
//        sumAndAvrg(2,2,2);
//        System.out.println(opration());
       // System.out.println(Arrays.toString(unique(a)));
        //countVowels("aeiou");

        //splitText("mohammed ibrhimalabd");


    }

    public static void print() {
        System.out.println("hello World");
    }

    public static String combinedStr(String first, String second) {

        return first + second;
    }

    public static int compra(int number1, int number2, int number3) {
        int largeNumber = 0;
        if (number1 > number2 && number1 > number3) {
            largeNumber = number1;
        } else if (number2 > number1 && number2 > number3) {
            largeNumber = number2;
        } else if (number3 > number2 && number3 > number1) {
            largeNumber = number3;
        }
        return largeNumber;
    }

    public static void sumAndAvrg(int number1, int number2, int number3) {

        int sum = number1 + number2 + number3;
        int average = sum / 3;

        System.out.println("the sum " + sum + " the average " + average);
    }

    public static double opration() {
        System.out.println("Enter opeation 1- sum 2 - Multip  3- div  4 - Minus ");
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        double result = 0;
        if (op == 1) {
            result = num + num2;
        } else if (op == 2) {
            result = num * num2;
        } else if (op == 3) {
            result = (double) num / num2;
        } else if (op == 4) {
            result = num - num2;
        }
        return result;
    }

    public static int[] unique(int[] a) {

        int endArray = a.length;

        for (int i = 0; i < endArray; i++) {
            for (int j = i + 1; j < endArray; j++) {
                if (a[i] == a[j]) {
                    int shift = j;
                    for (int k = j + 1; k < endArray; k++) {
                        a[shift] = a[k];
                    }
                    endArray--;
                    j--;
                }


            }

        }
        int[] newArrNoDuli = new int[endArray];
        for (int i = 0; i < endArray; i++) {
            newArrNoDuli[i] = a[i];
        }
        return newArrNoDuli;

    }

    public static void countVowels(String text){//a-e-i-o-u
        text.toLowerCase();
        int counterA = 0 ;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;
        for (int i = 0;i<text.length();i++){
            if (text.charAt(i)=='a'){
                counterA++;
            } else if (text.charAt(i)=='e') {
                counterE++;
            } else if (text.charAt(i)=='i') {
                counterI++;
            } else if (text.charAt(i)=='o') {
                counterO++;
            } else if (text.charAt(i)=='u') {
                counterU++;
            }
        }
        System.out.println("a times "+counterA);
        System.out.println("e times "+counterE);
        System.out.println("i times "+counterI);
        System.out.println("o times "+counterO);
        System.out.println("u times "+counterU);
    }

    public static void splitText(String text){

        String texts[] = text.split(" ");

        for(String word : texts){
            System.out.println(word);
        }


    }


}
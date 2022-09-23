package fcim.javabasic;

public class Basic {static void methodCond(int a, int b) {
    String result = (a < b) ? "a is smaller than b" : (a > b) ? "a is greater than b" : "a and b are equal";
    System.out.println(result);
}

    static void loopFor() {
        int arr[] = {10, 20, 46, 27, 96, 113};
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static boolean boolVar(float x, float y) {
        boolean res1 = true;
        boolean res2 = false;
        boolean result = (x > y) ? res1 : res2;
        return result;
    }

    static void stringArrImpl() {
        String[] animals = {"zebra", "giraffe", "hippopotamus", "lion"};
        System.out.println(animals[3]);
        System.out.println("The changed array:");
        animals[3] = "lemur";
        for (String i : animals) {
            System.out.println(i);
        }
        System.out.println("The length of the string is " + animals.length);
    }

    static void swImp(char c) {
        switch (c) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            case 'A':
                System.out.println("vowel");
                break;
            case 'E':
                System.out.println("vowel");
                break;
            case 'I':
                System.out.println("vowel");
                break;
            case 'O':
                System.out.println("vowel");
                break;
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }

    public static void main(String[] args) {
        System.out.println("\n1.Implementation of the conditional statements:");
        methodCond(20, 13);
        System.out.println("\n2.Implementation of the For loop:");
        loopFor();
        System.out.println("\n3.Implementation of boolean variables: \n x is greater than y: " + boolVar(4, 15));
        System.out.println("\n4.Implementation of arrays and strings:");
        stringArrImpl();
        System.out.println("\n5.Implementation of Switch Statement:");
        System.out.print("The letter is a ");
        swImp('U');


    }
}

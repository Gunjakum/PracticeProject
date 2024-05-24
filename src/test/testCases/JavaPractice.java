package testCases;


public class JavaPractice {

    //Reverse a String "GUNJAN"
//    public static void main(String[] args) {
//        String s = "GUNJANA";
//        String revS = "";
//        char[] chars = s.toCharArray();
//        for (int i = chars.length-1; i >= 0; i--) {
//            revS = revS + chars[i];
//
//        }
//        System.out.println(revS);
//    }
    // Swap two numbers without using third number
//    public static void main(String[] args) {
//        int a= 6;
//        int b= 9;
//        b= a+b;
//        a = b-a;
//        b= b-a;
//        System.out.println(a);
//        System.out.println(b);
//    }
    // Write a Java program to check if a vowel is present in a string.
//    public static void main(String[] args) {
//        String str = "GUNJAN KUMAR";
//        char[] chars = str.toCharArray();
//        String vowelsStr = "aeiouAEIOU";
//        char[] vowels = vowelsStr.toCharArray();
//        String strVowels= "";
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (chars[i] == vowels[j]) {
//                    strVowels = strVowels + vowels[j];
//                }
//            }
//        }
//        System.out.print("Vowels present in the string are " +strVowels);
//
//    }
    //Write a Java program to check if the given number is a prime number.
//    public static void main(String[] args) {
//        System.out.println("19 is a Prime number: "+isPrime(19));
//        System.out.println("49 is a Prime number: "+isPrime(49));
//    }
//    public static Boolean  isPrime(int n)
//    {
//        for (int i = 2; i <= n/2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    //Write a Java program to print first 20 Fibonacci series.
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.print("First 20 Fibonacci series: ");
        for (int i = 1; i <= 20; i++){
            System.out.print(a+ " ");
            a = b;
            b = c;
            c = a + b;
        }

    }
}

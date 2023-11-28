public class Main {
    public static void main(String[] args) {
        //mathOps(8, 2);
        // oddNums();
        //biggestNum(20, 30, 40);
        //swapOfAs("macaroni");
        //int[] arr = {1, 2, 2, 4, 6, 3, 5, 3, 5, 7};
        //sumOfArray(arr);
        //secondBiggest(arr);
//        String s = "codeleet";
//        int[] indices = {4,5,6,7,0,2,1,3};
//        System.out.println(restoreString(s, indices));
        //System.out.println(isPalindrome(10));
        //System.out.println(numberOfSteps(14));
        //System.out.println(sumOddLengthSubarrays(new int[]{1, 2, 3}));
    }

    // 1) Вывод суммы, умножения, вычитания, деления и остатка двух чисел
    public static void mathOps(double a, double b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    // 2) Вывод нечетных чисел от 1 до 20
    public static void oddNums() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // 3) Замена местами двух переменных
    public static void changePlace(int a, int b) {
        int tmp = 0;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + " b= " + b);
    }

    // 4) Принимает от пользователя три числа и выводит наибольшее из них
    public static void biggestNum(double a, double b, double c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    // 5) Проверка того, является ли число положительным или отрицательным
    public static void positiveNegative(double a) {
        if (a > 0) {
            System.out.println("Число положительное");
        } else if (a < 0) {
            System.out.println("Число отрицательное");
        }
    }

    // 6) Замена всех символов 'a' на символы 'b'
    public static void swapOfAs(String word) {
        char[] arr = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (arr[i] == 'a') {
                arr[i] = 'b';
            }
        }
        System.out.println(arr);
    }

    // 7) Суммирование значений массива
    public static void sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    // 8) Нахождение второго по величине числа из массива
    public static void secondBiggest(int[] array) {
        int tmp = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(array[array.length - 2]);
    }

    // Shuffle string
    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for (int i = 0; i < s.length(); i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }

    // Palindrome number
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long rev = 0;
        long tmp = x;

        while (tmp != 0) {
            int digit = (int) (tmp % 10);
            rev = rev * 10 + digit;
            tmp /= 10;
        }

        return (rev == x);
    }

    // Number of Steps to Reduce a Number to Zero
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }

    // Check If Two String Arrays are Equivalent
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";
        for (String value : word1) {
            w1 += value;
        }
        for (String s : word2) {
            w2 += s;
        }
        if (w1.equals(w2)) {
            return true;
        }
        return false;
    }

    // Sum of All Odd Length Subarrays
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int count = 0;
        int len = arr.length;
        while (len != 0) {
            if (len % 2 != 0) {
                count++;
                len = len - 1;
            } else {
                len = len - 1;
            }
        }
        if (arr.length % 2 != 0) {
            for (int i = 0; i < 2; i++) {
                for (int k : arr) {
                    sum += k;
                }
            }
        }
        return sum;
    }

}
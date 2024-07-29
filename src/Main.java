import java.util.Arrays;

public class Main {
    public static void printTreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 4;
        int b = 5;
        if(a + b >= 0)System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
    public static void printColor(){
        int value = 12;
        if(value <= 0)System.out.println("Красный");
        else if(value > 0 && value <= 100) System.out.println("Жёлтый");
        else System.out.println("Зелёный");
    }
    public static void compareNumbers(){
        int a = 0;
        int b = 2;
        if(a >= b) System.out.println("a >= b");
        else System.out.println("a < b");

    }
    public static boolean isNumBetweenTenAndTwenty(int a, int b){
        if(a + b >= 10 && a + b <= 20)return true;
        return false;
    }
    public static void printPositiveOrNegative(int num){
        if(num >= 0)System.out.println(num + " - положительное");
        else System.out.println(num + " - отрицательное");
    }
    public static boolean getIsPositiveOrNegative(int num){
        if(num >= 0) return false;
        return true;
    }
    public static void printSrting(String str, int num){
        if(num >= 0){
            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        }
    }
    public static boolean isAgeLeap(int age){
        if(age % 400 == 0) return true;
        else if(age % 4 == 0 && age % 100 != 0) return true;
        return false;
    }
    public static int[] getArray(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        //1
        printTreeWords();
        System.out.println();
        //2
        checkSumSign();
        System.out.println();
        //3
        printColor();
        System.out.println();
        //4
        compareNumbers();
        System.out.println();
        //5
        System.out.println(isNumBetweenTenAndTwenty(1, 7));
        System.out.println();
        //6
        printPositiveOrNegative(-2);
        System.out.println();
        //7
        System.out.println(getIsPositiveOrNegative(1));
        System.out.println();
        //8
        printSrting("Тестовая строка", 4);
        System.out.println();
        //9
        System.out.println(isAgeLeap(2024));
        System.out.println();
        //10
        int[] array10 =  { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i = 0; i < array10.length; i++){
            if(array10[i] == 0) array10[i] = 1;
            else array10[i] = 0;
        }
        System.out.println(Arrays.toString(array10));
        System.out.println();
        //11
        int[] array11 = new int[100];
        for(int i = 0; i < array11.length; i++) {
            array11[i] = i+1;
        }
        System.out.println(Arrays.toString(array11));
        System.out.println();
        //12
        int[] array12 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < array12.length; i++){
            if(array12[i] < 6) array12[i] *= 2;
        }
        System.out.println(Arrays.toString(array12));
        System.out.println();
        //13
        int[][] array13 = new int[9][9];
        for(int i = 0; i < array13.length; i++){
            for (int j = 0; j < array13[0].length; j++){
                if(i == j)array13[i][j] = 1;
                else if(j == array13.length - i - 1) array13[i][j] = 1;
                else array13[i][j] = 0;
                System.out.print(array13[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //14
        System.out.println(Arrays.toString(getArray(5, 9)));
    }
}
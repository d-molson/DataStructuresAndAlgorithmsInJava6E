package Chapter5Recursion.Recursion;

/**
 * Created by dolson on 7/11/2017.
 */
public class Recursion {

    public static void drawRuler(int nInches, int majorLength){
        drawLine(majorLength, 0);
        for(int j=1; j < nInches; j++){
            drawInterval(majorLength-1);
            drawLine(majorLength, j);
        }
    }

    private static void drawInterval(int centralLength){
        if(centralLength >= 1){
            drawInterval(centralLength-1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }

    private static void drawLine(int tickLength, int tickLabel){
        for(int j = 0; j < tickLength; j++){
            System.out.print("-");
        }
        if(tickLabel >= 0){
            System.out.print(" " + tickLabel);
        }
        System.out.print("\n");
    }

    private static void drawLine(int tickLength){
        drawLine(tickLength, -1);
    }

    /* Examples of linear recursion:
     * linear recursion: where a method is defined so that it makes at most one recursive call each time it is invoked */
    public static int sumArray(int[] integerArray, int integerArraySize){

        if(integerArraySize == 1){
            return integerArray[0];
        }
        else{
            return sumArray(integerArray, integerArraySize - 1) + integerArray[integerArraySize-1];
        }
    }

    public static void reverseArray(String[] stringArray, int startIndex, int endIndex){

        if(startIndex < endIndex){
            String startItem = stringArray[startIndex];
            String endItem = stringArray[endIndex];
            stringArray[startIndex] = endItem;
            stringArray[endIndex] = startItem;
            reverseArray(stringArray, startIndex+1, endIndex -1);
        }
        else{
            return;
        }
    }

    public static int power(int number, int degree){
        if(degree == 0){
            return 1;
        }
        if(degree % 2 != 0 ){
            int y = power(number, (degree-1)/2);
            return number*y*y;
        }
        else{
            int y = power(number, degree/2);
            return y*y;
        }
    }

    /* Example of tail recursion:
     * tail recursion: an algorithm uses tail recursion if it uses linear recursion and the algorithm makes
      * a recursive call as its very last operation*/
    public static void iterativeReverseArray(String[] stringArray, int startIndex, int endIndex){

        while(startIndex < endIndex){
            String startItem = stringArray[startIndex];
            String endItem = stringArray[endIndex];
            stringArray[startIndex] = endItem;
            stringArray[endIndex] = startItem;
            startIndex += 1;
            endIndex -= 1;
        }
        return;
    }

    /* Example of binary recursion:
     * binary recursion: when an algorithm makes two recursive calls*/
    public static int binarySum(int[] intArray, int startIndex, int endIndex){
        /* Only works with array with length of power of 2*/
        if(endIndex == 1){
            return intArray[startIndex];
        }
        else{
            return binarySum(intArray, startIndex, endIndex/2) +
                    binarySum(intArray, startIndex + (endIndex/2), endIndex/2);
        }
    }

    /* Example of binary recursion: */
    public static int binaryFibonacci(int k){
        /* Returns the kth Fibonacci number (starting at 0) */
        /* This example is very inefficient */
        if(k <= 1){
            return k;
        }
        else{
            return binaryFibonacci(k-1) + binaryFibonacci(k-2);
        }
    }

    /* Example of linear recursion: */
    public static int[] linearFibonacci(int k){
        if(k<=1){
            return new int[] {k, 0};
        }
        else{
            int[] fibonacciNumbers = linearFibonacci(k-1);
            int i = fibonacciNumbers[0];
            int j = fibonacciNumbers[1];
            return  new int[]{i+j,i};
        }
    }

    /* Example of multiple recursion:
    * multiple recursion: used when a method may make multiple recursive calls, with
    * that number potentially being more than two*/

}

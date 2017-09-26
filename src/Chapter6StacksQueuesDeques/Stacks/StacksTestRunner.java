package Chapter4RecursionStacksQueues.Stacks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by dolson on 8/7/2017.
 */
public class StacksTestRunner {

    public static void main(String args[]){

        /* Test Stack reverse: */
//        Integer [] intArray = new Integer[5];
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 3;
//        intArray[3] = 4;
//        intArray[4] = 5;
//        System.out.println("Before reverse:");
//        for(Integer i: intArray){
//            System.out.println(i);
//        }
//        Integer [] reversedArray = StackMethods.reverse(intArray);
//        System.out.println("After reverse:");
//        for(Integer i: reversedArray){
//            System.out.println(i);
//        }

        /* Test parenthesesMatchArray: */
//        String[] tokens = {"[", "(", "{", "1", "}", "(", "2", ")", ")", "]"};
//        boolean matches = StackMethods.parenthesesMatchArray(tokens, tokens.length);
//        System.out.println(matches);

        /* Test parenthesesMatchString: */
//        boolean matches = StackMethods.parenthesesMatchString("{{[test]{}}}]");
//        System.out.println(matches);

        /* Test HTML Parser: */
        try {
            BufferedReader bufferedReader;
            File file = new File("input.html");
            bufferedReader = new BufferedReader(new FileReader(file));
            HTML tagChecker = new HTML();
            if (tagChecker.isHtmlMatched(tagChecker.parseHtml(bufferedReader))) {
                System.out.println("The input file is a matched HTML document.");
            } else {
                System.out.println("The input file is not a matched HTML document");
            }
        }
        catch (Exception e){
            System.out.println("I/O error");
            e.printStackTrace();
        }

    }
}

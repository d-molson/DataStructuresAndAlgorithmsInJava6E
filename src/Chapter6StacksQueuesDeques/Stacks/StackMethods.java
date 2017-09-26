package Chapter4RecursionStacksQueues.Stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dolson on 8/7/2017.
 */
public class StackMethods {

    public static Integer[] reverse(Integer[] a){
        ArrayStack S = new ArrayStack(a.length);
        Integer[] b = new Integer[a.length];
        for(int i = 0; i < a.length; i++){
            S.push(a[i]);
        }
        for(int i = 0; i < a.length; i++){
            b[i] = (Integer)(S.pop());
        }
        return b;
    }

    public static boolean parenthesesMatchArray(String[] tokenArray, int tokenArraySize){
        ArrayStack S = new ArrayStack(tokenArraySize);
        String[] openingSymbols = {"(", "[", "{"};
        String[] closingSymbols = {")", "]", "}"};
        for(int i = 0; i < tokenArraySize; i++){
            if(Arrays.asList(openingSymbols).contains(tokenArray[i])){
                S.push(tokenArray[i]);
            }
            else if(Arrays.asList(closingSymbols).contains(tokenArray[i])){
                if(S.isEmpty()){
                    return false;
                }
                String openingSymbol = (String)S.pop();
                if(openingSymbol.equals("(") && !tokenArray[i].equals(")")){
                    return false;
                }
                if(openingSymbol.equals("[") && !tokenArray[i].equals("]")){
                    return false;
                }
                if(openingSymbol.equals("{") && !tokenArray[i].equals("}")){
                    return false;
                }
            }
        }
        return(S.isEmpty());
    }

    public static boolean parenthesesMatchString(String expression){
        ArrayStack S = new ArrayStack();
        String[] openingSymbols = {"(", "[", "{"};
        String[] closingSymbols = {")", "]", "}"};
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(Arrays.asList(openingSymbols).contains(new Character(c).toString())){
                S.push(c);
            }
            else if(Arrays.asList(closingSymbols).contains(new Character(c).toString())){
                if(S.isEmpty()){
                    return false;
                }
                Character openingSymbol = (Character)S.pop();
                if(openingSymbol.equals("(") && !new Character(c).equals(")")){
                    return false;
                }
                if(openingSymbol.equals("[") && !new Character(c).equals("]")){
                    return false;
                }
                if(openingSymbol.equals("{") && !new Character(c).equals("}")){
                    return false;
                }
            }
        }
        return(S.isEmpty());
    }



}

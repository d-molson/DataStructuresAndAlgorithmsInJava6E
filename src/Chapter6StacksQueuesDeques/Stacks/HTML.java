package Chapter4RecursionStacksQueues.Stacks;

/**
 * Created by derekolson on 8/8/17.
 */

import java.util.StringTokenizer;
import Chapter4RecursionStacksQueues.LinkedLists.NodeStack;
import java.io.*;

public class HTML {

    public static class Tag {

        String name;
        boolean isOpening;

        public Tag() {
            name = "";
            isOpening = false;
        }

        public Tag(String name, boolean isOpening) {
            this.name = name;
            this.isOpening = isOpening;
        }

        public boolean isOpening() {
            return isOpening;
        }

        public String getName() {
            return name;
        }
    }

    public boolean isHtmlMatched(Tag[] tags){
        NodeStack stack = new NodeStack();
        for(int i = 0; (i < tags.length) && (tags[i] != null); i++){
            if(tags[i].isOpening()){
                stack.push(tags[i].getName());
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if(!((String)stack.pop()).equals(tags[i].getName())){
                    return false;
                }
            }
        }
        //returns true if everything was matched
        //returns false if there tags left that were never matched
        return(stack.isEmpty());
    }

    public final static int CAPACITY = 1000;

    public Tag[] parseHtml(BufferedReader r) throws IOException{
        String line;
        boolean inTag = false;
        Tag[] tags = new Tag[CAPACITY];
        int count = 0;

        while((line = r.readLine()) != null){
            StringTokenizer stringTokenizer = new StringTokenizer(line,"<> \t", true);
            while(stringTokenizer.hasMoreTokens()){
                String token = (String)stringTokenizer.nextToken();
                if(token.equals("<")){
                    inTag = true;
                }
                else if(token.equals(">")){
                    inTag = false;
                }
                else if(inTag){
                    if((token.length() == 0) || (token.charAt(0) != '/')){
                        tags[count++] = new Tag(token, true);
                    }
                    else{
                        tags[count++] = new Tag(token.substring(1), false);
                    }
                }
            }
        }
        return tags;
    }

}



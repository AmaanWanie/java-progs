package tokenizer;

import java.util.StringTokenizer;

public class token {
    public static void main(String[] args) {
        String name="hi im amaan";
        StringTokenizer ST= new StringTokenizer(name);
        while(ST.hasMoreTokens()){
            System.out.println(ST.countTokens());
            System.out.println(ST.nextToken());
            System.out.println(ST.hasMoreElements());

        }
    }
}

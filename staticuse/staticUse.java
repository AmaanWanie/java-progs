package staticuse;
import java.util.ArrayList;

public class staticUse {
    static int counter=0;
    public static void increment(){

        counter+=1;
        System.out.println(counter);
    }
    public static void main(String[] args) {
        staticUse count = new staticUse();
      //  count.increment();
        //count.increment();
        //count.increment();
//arraylist
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        ar.add(3);
        System.out.println(ar);


    }//arralylist

}

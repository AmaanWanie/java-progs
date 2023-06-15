package Lists;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(21);
        System.out.println(arr);
        for(Object arra:arr ){
            System.out.println(arra);
        }
        LinkedList link = new LinkedList();
        link.add(1);
        link.add(2);
        link.add(2);
        link.add(1);
        System.out.println(link);
        for (Object ar:link
             ) {
            System.out.println(ar);
        }
        Hashtable hash = new Hashtable();
        hash.put(1,"amaan");
        hash.put(2,"wanie");
        hash.put(3,"random");
      //  System.out.println(hash);
        String name = (String) hash.get(1);
        String name1 = (String) hash.get(2);
        String name2 = (String) hash.get(3);
        System.out.println(name+name1+name2);
    }

}

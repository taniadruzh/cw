package les16;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by java on 23.03.2018.
 */
public class Runner {
    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("C","c");
//        map.computeIfAbsent("B", K -> K + ", " + "amazing value");
////        map.computeIfPresent("C", (key, value) -> key + ", " + value);
//        System.out.println(map.getOrDefault("D","net takogo, ramotaem plotno c Idea"));
//        System.out.println(map.getOrDefault("B","net takogo, ramotaem plotno c Idea"));

        String str = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
        String[] numbs = str.split(",");
        Map<String,String> integerSet = new HashMap();
        Map<String,String> integerSet1 = new HashMap();
        int n = 0;
        for (String s : numbs) {

            if (n%2 != 0) integerSet1.put(s,s+n); else integerSet.put(s,s+n);
            n++;
        }
        ;
        for(Map.Entry<String, String> pair : integerSet.entrySet())
        {
            String value = pair.getValue();
            System.out.println(pair.getKey() + " " + value);
        }
        System.out.println("------------------");

        for(Map.Entry<String, String> pair : integerSet1.entrySet())
        {
            String value = pair.getValue();
            System.out.println(pair.getKey() + " " + value);
        }


    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 
class TestClass2 {

public static Map<Integer,Integer>list = new HashMap<Integer,Integer>();
public static ArrayList<Integer>count=new ArrayList<Integer>();

static int max=0;
static int min=0;



    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(tk.nextToken());
            if (type == 1) {
                int val = Integer.parseInt(tk.nextToken());
                add_to_list(val);
            }
            else if (type == 2) {
                int val = Integer.parseInt(tk.nextToken());
                remove_from_list(val);
            }
            else if (type == 3) {
                int ans = find_least_frequency();
                System.out.println(ans);
            }
            else if (type == 4){
                int ans = find_highest_frequency();
                System.out.println(ans);
            }
        }
    }
    public static void add_to_list(int val){
        if(list.get(val)==null){
            list.put(val,1);
            min=val;
        }else{
            int c=list.get(val);
            list.put(val,c+1);
        }

    }

    public static void remove_from_list(int val){
        //Process queries of type 2 here
        
        if(list.get(val)!=null){
           // System.out.println(list);
           if(list.get(val)>1){
               int c=list.get(val);
               list.put(val,c-1);
           }else{
              list.remove(val); 
           }
        
        }
        
        
    }

    public static int find_least_frequency(){
        //Process queries of type 3 here
    	 sortByValue(list);
         int min_count = Integer.MAX_VALUE, res = -1;
        /*for(Entry<Integer,Integer> val : list.entrySet())
        {
            if (min_count >val.getValue()||(min_count ==val.getValue()&&res<val.getKey()))
            {
                res = val.getKey();
                min_count = val.getValue();
            }
        }*/
         if(list.size()==0)
        	 return -1;
         
         List<Integer> keys = new ArrayList<Integer>(sortByValue(list).keySet());
         int maximumPossibleFrequency = list.get(keys.get(0));
       //  System.out.println(list+" "+maximumPossibleFrequency);
         for (int i =1; i < keys.size(); i++) {
        	
             if (list.get(keys.get(i)) >= maximumPossibleFrequency&&res>keys.get(i)) {
            	// System.out.println(res+"  " +keys.get(i));
                 break;
             } else {
             	res= keys.get(i);
                // System.out.println(keys.get(i) + " => " + list.get(keys.get(i)));
             }
         }
         return res;
        
    }

    public static int find_highest_frequency(){
        //Process queries of type 4 here
        int min_count = Integer.MIN_VALUE, res = -1;
        
        if(list.size()==0)
       	 return -1;
        
        sortByValue(list);
       /* for(Entry<Integer,Integer> val : list.entrySet())
        {
            if (min_count <val.getValue()||(min_count ==val.getValue()&&res>val.getKey()))
            {
                res = val.getKey();
                min_count = val.getValue();
            }
        }*/
        List<Integer> keys = new ArrayList<Integer>(sortByValue(list).keySet());
        int maximumPossibleFrequency = list.get(keys.get(keys.size() - 1));
        for (int i = keys.size() - 1; i >= 0; i--) {
            if (list.get(keys.get(i)) < maximumPossibleFrequency) {
                break;
            } else {
            	res= keys.get(i);
               // System.out.println(keys.get(i) + " => " + list.get(keys.get(i)));
            }
        }
         return res;
    }
    
    
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> unsortMap) {

        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;

    }
    
}
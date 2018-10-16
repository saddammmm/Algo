import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;
import java.lang.Integer;

class TestClass1 {

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int L[] = new int[N];
        int R[] = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            L[i] = Integer.parseInt(tk.nextToken());
            R[i] = Integer.parseInt(tk.nextToken());
        }
        align_rectangles(N , L , R);
        for(int i = 0; i < N; i++) {
            System.out.println(L[i] + " " + R[i]);
        }
    }
    public static void align_rectangles(int N,int L[],int R[]){
    	
    
    	HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
    	
    	for (int i = 0; i < L.length; i++) {
			map.put(i, L[i]);
		}
    	
    	map=sortHashMapByValues(map);
    	
    	int i=0;
    	int[]res=new int[R.length];
    	
    	for (Entry<Integer, Integer> entry : map.entrySet()) {
    		if(i!=0&&entry.getValue()==L[i-1]){
    			int l1=L[i-1];
    			int l2=entry.getValue();
    			int w1=res[i-1];
    			int w2=R[entry.getKey()];
    			if(l1*w1<l2*w2){
    				L[i-1]=l2;
    				res[i-1]=w2;
    				L[i]=l1;
    				res[i]=w1;
    			}else{
    				L[i]=l2;
    				res[i]=w2;
    			}

    		}else{
    			L[i]=entry.getValue();
    			
    			res[i]=R[entry.getKey()];
    		}

    		i++;
    	}
    	for (int j = 0; j < res.length; j++) {
			R[j]=res[j];
		}     
    }
    
    public static  LinkedHashMap<Integer, Integer> sortHashMapByValues(
    		HashMap<Integer, Integer> passedMap) {
    	List<Integer> mapKeys = new ArrayList<>(passedMap.keySet());
    	List<Integer> mapValues = new ArrayList<>(passedMap.values());
    	Collections.sort(mapValues);
    	Collections.sort(mapKeys);

    	LinkedHashMap<Integer, Integer> sortedMap =
    			new LinkedHashMap<>();

    	Iterator<Integer> valueIt = mapValues.iterator();
    	while (valueIt.hasNext()) {
    		Integer val = valueIt.next();
    		Iterator<Integer> keyIt = mapKeys.iterator();

    		while (keyIt.hasNext()) {
    			Integer key = keyIt.next();
    			Integer comp1 = passedMap.get(key);
    			Integer comp2 = val;

    			if (comp1.equals(comp2)) {
    				keyIt.remove();
    				sortedMap.put(key, val);
    				break;
    			}
    		}
    	}
    	return sortedMap;
    }
}
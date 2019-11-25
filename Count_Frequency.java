
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Count_Frequency {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(2);
		al.add(6);
		al.add(5);
		al.add(2);
		al.add(6);
		al.add(5);
		al.add(5);
		al.add(2);
		countFreqency(al);
		
	}

	public static void countFreqency(ArrayList<Integer> list) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(Integer i : list){
			Integer j = mp.get(i);
			mp.put(i, (j==null)?1:j+1);
		}
		Set<Entry<Integer, Integer>> set = mp.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			Integer l = entry.getKey();
			Integer v = entry.getValue();
			
			System.out.println(l + "occurence " + v + "times" );
		}
	}
}

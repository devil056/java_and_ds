import java.util.*;

class HashMap1{
	public static void main(String args[]){
		Map map=new HashMap();
		map.put(1,"Murari");
		map.put(5,"Neha");
		map.put(10,"Sukumar");
		Set set=map.entrySet();
		Iterator itr=set.iterator();

		while(itr.hasNext()){
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}

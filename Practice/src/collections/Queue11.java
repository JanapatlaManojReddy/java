package collections;
import java.util.*;

public class Queue11 {

	public static void main(String[] args) {
		int[] arr = new int[] {5,8,24,2,11,32,27,21,53};
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int x=0;x<arr.length;x++)
		{
			q.add(arr[x]);
		}
	
	
	Object[]b = q.toArray();
	for(Object t:b)
	System.out.println(t);
	System.out.println("deque interface starting");
	Deque<Object> d = new ArrayDeque<>();
	d.add(22);
	d.add(33);
	d.add(222);
	
	Iterator itt = d.iterator();
	while(itt.hasNext()) {
		System.out.println(itt.next());
	}
	}

}

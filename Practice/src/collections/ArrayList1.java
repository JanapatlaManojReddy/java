package collections;
import java.util.*;

public class ArrayList1  {

	public static void main(String[] args) {
		String str[]=new String[] {"hi","all","good","morning"};
	ArrayList<String> al = new ArrayList<>(Arrays.asList(str));
		//al.addFirst("starting");
		//al.sort(Comparator.naturalOrder());
		Collections.sort(al);
		System.out.println(al);
		//al.sort(Comparator.reverseOrder());
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		al.add("ending");
		al.clone();
		al.contains("hi");
		al.get(0);
	LinkedList<String> ll = new LinkedList<>();
		ll.addFirst("starting");
		ll.sort(Comparator.naturalOrder());
		System.out.println(ll);
		/*ll.addLast("ending");
		ll.offer("ending");
		ll.offerLast("ending");
		
		ll.contains("hi");
		Iterator it = ll.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println( ll.element());
		ll.getFirst();
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		System.out.println(ll.remove());
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.reverse(ll);
        System.out.println(ll);	
        String []s = ll.toArray(new String[ll.size()]);
        Object []o = ll.toArray();
    Vector<String>v = new Vector<>(ll);
        System.out.println(v.capacity());
        System.out.println(v.size());
       
        String []vs=v.toArray(new String[v.size()]);
        for( String tempp:vs)
        	System.out.println(tempp);
        String []vs1=new String[v.size()];
        v.copyInto(vs1);
        for( Object tem:vs1)
        	System.out.println(tem);
        System.out.println(v.isEmpty());
        //System.out.println(v.empty());
     Stack<String> st= new Stack<>();
     	//st.push(null);
     	//st.push("hoi");
     	//st.push("hello");
     	 //System.out.println(st.pop());
     	//System.out.println(st.peek());
     	System.out.println(st.search(null));
     	
     	System.out.println(st.empty());
     	System.out.println(st.isEmpty());*/
     	
     	
     	
     	
     
        
        
       
        
       
        
	}
}

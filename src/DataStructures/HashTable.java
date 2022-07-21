package DataStructures;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("754.856.869-88","Valdinei Santos");
	    Cliente c2 = new Cliente("828.929.222.12","Claire Moura");
	    Cliente c3 = new Cliente("156.565.556-88","Vagner Seller");
	    
	    Hashtable<Integer, Cliente> hash = new Hashtable<Integer, Cliente>();
	    hash.put(1, c1);
	    hash.put(2, c2);
	    hash.put(3, c3);
	    
	    for(int i = 1; i <= hash.size(); i++) {
	    	System.out.println(hash.get(i));
	    }
	    
	}
}

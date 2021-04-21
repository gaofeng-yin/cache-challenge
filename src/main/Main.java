package main;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		Cache cache = new Cache(3);

		cache.add(1);
		cache.print();
		
		cache.add(2);
		cache.print();
		
		
		cache.add(3);
		cache.print();
		
		cache.add(4);
		cache.print();
		
		cache.add(5);
		cache.print();
	}

}

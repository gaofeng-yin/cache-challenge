package main;

import java.util.Iterator;
import java.util.TreeMap;

public class Cache {

	private long timestamp;
	private TreeMap<Long,CacheData> caches;
	private int size;
	
	public Cache(int size) {
		this.size = size;
		this.caches = new TreeMap<>();
	}
	
	public <D>void add(D data) throws InterruptedException{
		if(caches.size() == size) {
			removeOldest();
		}
		timestamp = System.currentTimeMillis();
		caches.put(timestamp, new CacheData(data));
		System.out.println("ok");
		//wait 50 millisecond before other method is executed.
		Thread.sleep(50);
	}
	
	public void removeOldest() {
		long oldest = System.currentTimeMillis();
		for(long time : caches.keySet()) {
			if(oldest > time) {
				oldest = time;
			}
		}
		caches.remove(oldest);
	}
	
	public void print() {
		Iterator<CacheData> iterator = caches.values().stream().iterator();
		StringBuilder str = new StringBuilder();
		while(iterator.hasNext()) {
            str.append(iterator.next().getData());
            str.append(" , ");
		}
		str.deleteCharAt(str.length() - 2);
		System.out.println(str.toString());
	}
}

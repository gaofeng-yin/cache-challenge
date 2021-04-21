package main;

public class CacheData<D> {
	private D data;
	
	public CacheData(D data) {
		this.data = data;
	}

	public D getData() {
		return data;
	}

	public void setData(D data) {
		this.data = data;
	}
	
}

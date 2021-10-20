package ru.spbstu.pp.lecture5;

public class PojoObject implements Comparable<PojoObject>{
	
	private int id;

	public PojoObject(int id) {
		super();
		this.id = id;
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return super.toString() + " id=" + id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PojoObject) {
			return this.id == ((PojoObject) obj).id;
		}
		return false;
	}
	
	/*
	 * if (a == b)
	 * 	=> h(a) = h(b)
	 */
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public int compareTo(PojoObject o) {
		Integer i1 = id;
		Integer i2 = o.id;
		return i2.compareTo(i1);
	}
}

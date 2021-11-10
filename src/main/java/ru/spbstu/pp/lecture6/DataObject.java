package ru.spbstu.pp.lecture6;

import java.io.Serializable;

public class DataObject implements Serializable {

	private int id;
	private String name;
	private long number;
	
	private DataObject parent;
	
	private transient int sessionId;
	
	
	public DataObject() {
		super();
	}

	
	public DataObject(int id, String name, long number, DataObject parent) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.parent = parent;
	}


	public DataObject(int id, String name, long number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized long getNumber() {
		return number;
	}

	public synchronized void setNumber(long number) {
		this.number = number;
	}
	
	
	
	public synchronized DataObject getParent() {
		return parent;
	}


	public synchronized void setParent(DataObject parent) {
		this.parent = parent;
	}


	@Override
	public String toString() {
		return "[" + super.toString() + ": id=" + id + ", name=" + name + ", num = " + number + ", parent=" + parent + "]";
	}

}

package ru.spbstu.pp.lecture4;

public class ApplicationException extends Exception {

	public ApplicationException(AppRuntimeException e) {
		super(e);
	}

	public ApplicationException() {
		super();
	}

}

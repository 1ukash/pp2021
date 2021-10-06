package ru.spbstu.pp.lecture4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {
	
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream(new File("/tmp/file"));
			f.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			handleCloseStream(f);
		}
		
	}

	private static void handleCloseStream(FileInputStream f) {
		if (f != null)
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("I am done!");
			}
	}

}

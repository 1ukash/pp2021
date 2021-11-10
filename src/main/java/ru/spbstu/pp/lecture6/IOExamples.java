package ru.spbstu.pp.lecture6;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class IOExamples {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("/tmp/file");
		
		//dataRWOps(f);
		objectRWOps(f);
		
	}

	
	private static void objectRWOps(File f) throws IOException, ClassNotFoundException {
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f));
			
			DataObject parent = new DataObject(1, "Tester", 1000L);
			DataObject o1 = new DataObject(2, "o1", 1000L, parent);
			DataObject o2 = new DataObject(3, "o2", 1000L, parent);
			oos.writeObject(o1);
			oos.writeObject(o2);
			//oos.writeObject(parent);
			System.out.println("write");
			System.out.println(o1);
			System.out.println(o2);
		} finally {
			if (oos != null)
				oos.close();
		}
		
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(f));
			DataObject o1 = (DataObject) ois.readObject();
			DataObject o2 = (DataObject) ois.readObject();
			System.out.println("Read");
			System.out.println(o1);
			System.out.println(o2);
			
		} finally {
			if (ois != null) {
				ois.close();
			}
		}
	}


	private static void simpleRWOps(File f) throws FileNotFoundException, IOException {
		OutputStream os = null;
		try {
			os = new FileOutputStream(f);
			os.write("a string".getBytes());
		} finally {
			if (os != null) {
				os.close();
			}
		}

		
		InputStream is = null;
		try {
			is = new FileInputStream(f);
			int available = is.available();
			byte[] buf = new byte[available];
			is.read(buf);
			System.out.println(new String(buf));
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}
	private static void dataRWOps(File f) throws FileNotFoundException, IOException {
		DataOutputStream dos = null;
		try {
			OutputStream os = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			GZIPOutputStream gz = new GZIPOutputStream(bos);
			dos = new DataOutputStream(gz);
			dos.writeUTF("a string !");
			dos.writeDouble(.02);
			int num = 1000;
			dos.writeInt(num);
			
			for (int i = 0; i < num; i++) {
				dos.writeInt(i*i);
			}
			
			dos.flush();
			
		} finally {
			if (dos != null) {
				dos.close();
			}
		}

		
		DataInputStream dis = null;
		try {
			InputStream is = new FileInputStream(f);
			GZIPInputStream gzis = new GZIPInputStream(is);
			dis = new DataInputStream(gzis);
			String str = dis.readUTF();
			double val = dis.readDouble();
			int num = dis.readInt();
			List<Integer> l = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				l.add(dis.readInt());
			}
			System.out.println(str + "\n" + val + "\n" + l);
		} finally {
			if (dis != null) {
				dis.close();
			}
		}
	}

}

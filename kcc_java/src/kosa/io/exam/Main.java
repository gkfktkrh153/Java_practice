package kosa.io.exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	Member m;

	// 직렬화
	public void insert() {
		Member member = new Member("홍길동", 20, new Video(1L, "비디오", "배우"));
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(member);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally {
			try {
				oos.close();
			}catch (Exception e) {}
		}
	}

	// 역직렬화
	public void show() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member) ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch(Exception e2){}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.insert();
		main.m = null;
		main.show();
		
		System.out.println(main.m);
	}

}

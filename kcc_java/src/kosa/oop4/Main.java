package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		Object objs[] = {new Reader("둘리"), new Work("길동"), new Student("마이클")};
		for(Object obj : objs) {
			if(obj instanceof Speakable)
				System.out.println(((Speakable) obj).speak());
		}
	}

}

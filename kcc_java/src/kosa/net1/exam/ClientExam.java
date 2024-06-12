package kosa.net1.exam;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("112.221.184.60", 9000);
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			String message = "HI Server";
			out.write(message.getBytes());
			
			byte arr[] = new byte[100];
			in.read(arr);
			
			System.out.println(new String(arr));
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				socket.close();
			}catch (Exception e) {
			}
		}

	}

}

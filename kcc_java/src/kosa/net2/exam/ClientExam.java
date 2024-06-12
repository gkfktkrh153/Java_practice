package kosa.net2.exam;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;
		System.out.println("실행");
		try {
			socket = new Socket("192.168.0.249", 9000);
			
			Thread receive = new ClientReceive(socket);
			Thread sender = new ClientSender(socket);

			receive.start();
			sender.start();
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}

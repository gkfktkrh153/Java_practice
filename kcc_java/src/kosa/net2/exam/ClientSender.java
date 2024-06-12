package kosa.net2.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLDecoder;

public class ClientSender extends Thread {

	private Socket socket;

	public ClientSender() {

	}

	public ClientSender(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			
			while(true) {
				System.out.print("입력 > ");
				String str = br.readLine();
				String str2 = URLDecoder.decode(str, "utf-8");
				if(str2.equals("bye")) 
					break;
				writer.println(str2);
				writer.flush();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

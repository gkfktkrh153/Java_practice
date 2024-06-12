package kosa.net1.exam;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("서버 실행중................");
			clientSocket = serverSocket.accept();

			InputStream in = clientSocket.getInputStream();
			OutputStream out = clientSocket.getOutputStream();


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				clientSocket.close();
				serverSocket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

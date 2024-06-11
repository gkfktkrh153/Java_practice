package kosa.io.exam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class CopyExam {

	public static void main(String[] args) throws IOException {
		FileReader reader = null;
		Writer writer = new FileWriter("poem3.txt");
		try {
			reader = new FileReader("poem2.txt");
			char arr[] = new char[100];

			while (true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				System.out.println(data);
				if (data == -1)
					break;
				
				System.out.println(arr);
			}
			writer.write(String.valueOf(arr));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (Exception e2) {
			}
		}
	}

}

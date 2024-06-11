package kosa.io.exam;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class KosaWriter {
   
   public static void main(String[] args) throws IOException {
      //파일(poem.txt)에 있는 문자열 데이터를 읽어오기
	  Writer writer = new FileWriter("poem2.txt");
	  Scanner sc = new Scanner(System.in);
      
      try {
    	 System.out.print("입력 : ");
    	 String input = sc.nextLine();
         while(!input.equals("q")) {
        	 writer.append(input);
        	 System.out.print("입력 : ");
        	 input = sc.nextLine();
         }
         
         
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            writer.close();
         } catch (Exception e2) {}
      }
      
      
   }

}

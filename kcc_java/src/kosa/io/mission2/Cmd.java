package kosa.io.mission2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cmd extends Thread{

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String current = "C:\\Users\\KOSA\\Desktop\\KCC";
		File file = new File(current);
		
		while(true) {
			System.out.print(file.getPath() + " > ");
			String command = sc.nextLine();
			
			if(command.equals("ls")) {
				for(File f : file.listFiles()) {
					if(f.isDirectory())
						System.out.println(f.getName() + "(Folder)");
					else{
						System.out.println(f.getName());
					}
				}
			}else if(command.matches("cd\\s.*[가-힣\\dA-Za-z].*$")) {
				if(file.isDirectory())
				{
					file = new File(file.getPath() + "\\" + command.split(" ")[1]);
				}
				else {
					System.out.println("폴더가 아닙니다.");
				}

			}
			else if (command.split(" ")[0].equals("vi")) {
	            FileWriter fw = new FileWriter(file.getPath() + "\\" + command.split(" ")[0]);
	            
	            try {
	               String input = sc.nextLine();
	               while(!input.equals("q")) {
	                  fw.write(input);
	                  input = sc.nextLine();
	               }
	            } catch (Exception e) {
	               System.out.println(e.getMessage());
	            } finally {
	               try {
	                  System.out.println("종료합니다.");
	                  fw.close();
	               } catch (Exception e2) {
	                  System.out.println(e2.getMessage());            
	               }
	            }
	         }
			else if(command.equals("cd ..")) {
				String path = file.getPath().replace("\\" + file.getName(), "");
				file = new File(path);
			}
			else if(command.matches("mkdir\\s.*[가-힣\\dA-Za-z].*$")) {
				
				File f = new File(file.getPath() + "\\" + command.split(" ")[1]);
				
				f.mkdirs();
				System.out.println("폴더 생성 완료");
				
			}
		}
		
	}

}

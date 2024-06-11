package kosa.io.mission;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyUtil {

	// 디렉토리 복사(해당 폴더 복사해서 새로운 디렉토리를 생성 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) throws FileNotFoundException, IOException {
		
		if(source.isDirectory()) {
			dest.mkdirs();
			
			File[] fileList = source.listFiles();
			for(File file : fileList) {
				if(file.isDirectory()) {
					File newFolder = new File(source.getPath() + "\\" + file.getName());

					System.out.println();
					File destFolder = new File(dest.getPath() + "\\" + file.getName());
					copyDirectory(newFolder, destFolder);
					 //new File(디렉토리 경로, 파일이름);
				}
				else {
					System.out.println(dest + "\\" + file.getName());
					File newFile = new File(dest, file.getName());
					copyFile(file, newFile);
				}
			}
		}
	}
	
	// 바이트 값을 가진 파일 1개를 복사하는 메서드
	// source(원본), dest(복사본) 둘 다 파일 객체
	public static void copyFile(File source, File dest) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(source);

		FileOutputStream fos = new FileOutputStream(dest);

		byte[] buf = new byte[1024];
		
		int readData;
		while ((readData = fis.read(buf)) > 0) {
			fos.write(buf, 0, readData);
			System.out.println(buf);
		}
		fis.close();
		fos.close();

	}
}

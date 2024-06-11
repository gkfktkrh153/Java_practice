package kosa.io.mission;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMission {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		/*
		 * // 1. 바이트스트림을 이용하여 이미지 파일을 복사해보자. String source =
		 * "C:\\Users\\KOSA\\Desktop\\KCC\\work\\java_work\\kcc_java\\download.jpg";
		 * String dest = "C:\\Users\\KOSA\\Desktop\\upload\\download.jpg";
		 * 
		 * CopyUtil.copyFile(new File(source), new File(dest));
		 */
		
		// 2. 디렉토리 복사를 구현하자
		String source = "C:\\Users\\KOSA\\Desktop\\KCC\\task";
		String dest = "C:\\Users\\KOSA\\Desktop\\upload\\directory";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));
	}

}

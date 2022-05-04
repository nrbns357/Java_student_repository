package kr.hs.dgsw.java.dept1.d0504;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReadStudy {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\hello.txt");
			InputStream is = new FileInputStream(file);
			
			byte[] buffer = new byte[1024];
			
			int index = 0;
			while (is.available() > 0) {
				buffer[index++] = (byte)is.read();
			}
			
			String str = new String(buffer, 0, index, "UTF-8");
			System.out.println(str);
			
			is.close();

			
			File file2 = new File("C:\\thanks.txt");
			String value = "대구소프트웨어마이스터고등학교";
			byte[] bytes2 = value.getBytes("UTF-8");
			
			OutputStream os = new FileOutputStream(file2);
			
			for (int i = 0 ; i < bytes2.length ; i++) {
				os.write(bytes2[i]);
			}
			
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
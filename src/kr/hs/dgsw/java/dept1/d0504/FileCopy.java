package kr.hs.dgsw.java.dept1.d0504;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public void copy(String src, String target) {
		try {
			File srcFile = new File(src);
			File targetFile = new File(target);
			
			InputStream is = new FileInputStream(srcFile);
			OutputStream os = new FileOutputStream(targetFile);
			
			byte[] buffer = new byte[1024];
			int length;
			
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			
			is.close();
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileCopy fileCopy = new FileCopy();
		fileCopy.copy("C:\\90_ETC\\SampleFiles\\pororo1.jpg", "C:\\abc.jpg");
		
		
	}
}
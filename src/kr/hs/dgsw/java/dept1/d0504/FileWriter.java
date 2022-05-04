package kr.hs.dgsw.java.dept1.d0504;

	import java.io.File;
	import java.io.FileOutputStream;

public class FileWriter implements Writer {

		protected final String path;

		public FileWriter(String path) {
			this.path = path;
		}

		@Override
		public void write(String value) {
			try {
				File file = new File(this.path);
				FileOutputStream fileOutputStream = new FileOutputStream(file);

				fileOutputStream.write(value.getBytes("UTF-8"));

				fileOutputStream.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}

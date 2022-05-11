package kr.hs.dgsw.java.dept1.d0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

	private void studyFileData() throws Exception {
		
		File file = new File("C:\\Users\\DGSW\\OneDrive\\문서");
		File file2 = new File("C:\\Users\\DGSW\\OneDrive\\문서");
		File file3 = new File("C:\\Users\\DGSW\\OneDrive\\문서");
		
		/* 파일의 존재 여부 */
		boolean exist = false;
		exist = file.exists();
		System.out.println("파일의 존재 여부 확인");
		System.out.println(file.getName() + " " + exist);
		System.out.println(file2.getName() + " " + file2.exists());
		System.out.println(file3.getName() + " " + file3.exists());
		
		/* 파일의 경로 */
		String path = file.getPath();
		String absolutePath = file.getAbsolutePath(); // 정대적인 경로 대부분 이걸 쓴다.
		String canonicalPath = file.getCanonicalPath();
		
		
		System.out.println("파일의 경로");
		System.out.println(file.getName());
		System.out.println("  path : " + path);
		System.out.println("  absolutePath : " + absolutePath);
		System.out.println("  canonicalPath : " + canonicalPath);
		System.out.println();
		
		/* 파일의 크기 */
		long size = file.length();
		System.out.println("파일의 크기");
		System.out.println(file.getName() + "  " + size);
		System.out.println(file2.getName() + "  " + file2.length());
		System.out.println(file3.getName() + "  " + file3.length());
		
		/* 수정된 시각 */
		
		long modifiedTime = file.lastModified();
		System.out.println("파일의 수정 시각");
		
		Date date = makeDate(modifiedTime);
		String time = formatDate(date);
		
		System.out.println(file.getName() + "  " + modifiedTime);
		System.out.println(file2.getName() + "  " + file2.lastModified());
		System.out.println(file3.getName() + "  " + file3.lastModified());
		System.out.println();
		
		
		/* 파일과 디렉터리 구분 */
		boolean bFile = file.isFile();
		boolean bDir = file.isDirectory();
		System.out.println(file.getName() + "  " + bFile + " " + bDir);
		System.out.println(file2.getName() + "  " + file2.isFile() + " " + file2.isDirectory());
		System.out.println(file3.getName() + "  " + file3.isFile() + " " + file3.isDirectory());
		System.out.println();
		
	}
	
	public void studyManage() throws Exception {
		File file = new File("aa");
		
		/* 파일 만들기 */
		boolean created = file.createNewFile();
		System.out.println("파일 만들기");
		System.out.println(file.getName() + " " + created);
		System.out.println();
		
		/* 파일 삭제하기 */
		boolean deleted = file.delete();
		System.out.println("파일 삭제하기");
		System.out.println(file.getName() + " " + deleted);
		System.out.println();
		
		/* 파일 이름 바꾸기 */
		File file1 = new File("a");
		File newFile = new File("a");
		boolean renamed = file1.renameTo(newFile);
		System.out.println("파일 이름 바꾸기");
		System.out.println(file1.getName() + " " + renamed);
		System.out.println();
	
	}
	
	private void studyDirectory() {
		
		
		
		File dir = new File("C:\\Users\\DGSW\\OneDrive\\문서");
		/* 디렉토리 만들기 */
		boolean created = dir.mkdir();
		System.out.println("디렉토리 만들기");
		System.out.println(dir.getName() + "  " + created);
		System.out.println();
		
		/* 디렉토리 삭제하기 */
		boolean deleted = dir.delete();
		System.out.println("디렉토리 삭제하기");
		System.out.println(dir.getName() + "  " + deleted);
		System.out.println();
		
		/* 디렉토리 만들기 2 */
		File dir2 = new File("C:\\Users\\DGSW\\OneDrive\\문서");
		dir2.mkdirs();
		System.out.println("디렉토리 만들기");
		System.out.println(dir2.getName() + "  " + created);
		System.out.println();
		
	}
	
	
	public void studyList() {
        File dir = new File("/Users/whitebear/Documents");

        String[] list = dir.list(); // 파일들의 목록을 파일이름 문자열로 리턴
        File[] listFiles = dir.listFiles(); // 파일들의 목록을 File 객체로 리턴

//        for (String item : list) {
//            System.out.println(item);
//        }

        for (File file : listFiles) {
            System.out.println(file.getName());
        }
    }
	

	
	public Date makeDate(long unixTime) {
		return new Date(unixTime);
	}
	
	private String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	
	
	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		fileStudy.studyFileData();
		
	}
	
	
}

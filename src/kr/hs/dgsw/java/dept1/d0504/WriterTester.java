package kr.hs.dgsw.java.dept1.d0504;

public class WriterTester {
	
	protected final Writer writer;

	public WriterTester() {
		this.writer = new FileWriter("C:\\add.txt");
	}

	public void add(int value1, int value2) {
		int result = value1 + value2;
		String output = String.format("%d + %d = %d", value1, value2, result);

		writer.write(output);
	}


	public static void main(String[] args) {
		WriterTester tester = new WriterTester();
		tester.add(5, 6);

	}
}

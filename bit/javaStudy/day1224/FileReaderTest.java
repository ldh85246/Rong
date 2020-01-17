import java.io.FileReader;
import java.io.IOException;

class FileReaderTest {
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("c:/javaStudy/day1224/hello.txt");
		int mc;
		while ((mc = fr.read()) != -1) { // 파일의 끝이 아닐때까지 파일로부터 한글자씩 읽어들인 것을 mc에 담는다.
			System.out.print((char)mc);
		}
		fr.close();
		} catch(IOException e) {
			System.out.println("파일을 불러오지 못했습니다.");
		}
	}
}

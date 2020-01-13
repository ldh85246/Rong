import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest02 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("c:/javaStudy/day1224/hello.txt");
			fw.write("Merry Christmas♥");
			fw.close();
			System.out.println("파일을 생성하였습니다.");
		} catch(IOException e) {
			System.out.println("파일 처리 중에 문제가 발생하였습니다.");
		}
	}
}

package inputstream_outputstream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main_bw {
	public static void main(String[] args) {
		
		String fileName = "C:\\Workspace\\Exercise\\Test\\ioTest\\helloWriter.txt";
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			String str = "Hello\n";
			str += "Hello Java\n";
			str += "Hello Java World!!\n";
			
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

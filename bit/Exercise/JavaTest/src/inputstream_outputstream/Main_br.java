package inputstream_outputstream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main_br {
	public static void main(String[] args) {
		String fileName = "C:\\Workspace\\Exercise\\Test\\ioTest\\helloReader.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String strLine;
			
			while((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

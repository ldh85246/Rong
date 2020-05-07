package inputstream_outputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main_Data_io {
	public static void main(String[] args) {
		String str = "Hello Java World!!";
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			os = new FileOutputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\helloWorld.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if(os != null) os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

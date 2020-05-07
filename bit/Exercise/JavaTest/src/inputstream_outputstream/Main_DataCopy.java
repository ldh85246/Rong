package inputstream_outputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main_DataCopy {
	public static void main(String[] args) {
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\helloWorld.txt");
			dis = new DataInputStream(is);	// byte단위로 다루기가 불편할 수 있으니 문자열로 다루기 위해서
			
			String str = dis.readUTF();
			
			os = new FileOutputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\helloWorldCopy.txt");
			dos = new DataOutputStream(os);
			
			dos.writeUTF(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
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

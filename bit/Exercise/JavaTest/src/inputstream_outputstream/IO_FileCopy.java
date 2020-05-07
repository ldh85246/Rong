package inputstream_outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IO_FileCopy {
	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\hello.txt");
			os = new FileOutputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\helloCopy.txt");
			
			byte[] arr = new byte[3];
			
			while(true) {
				int len = is.read(arr);
				if(len == -1) break;
				os.write(arr, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(is != null) {
				try {
					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (os != null) {
				try {
					os.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

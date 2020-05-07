package inputstream_outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main_File_io {
	public static void main(String[] args) {
		
//		// read()
//		InputStream is = null;
//		try {
//			// FileInputStream()으로 읽어올 파일의 경로를 지정
//			is = new FileInputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\hello.txt");
//			int data = 0;
//			
//			while (true) {				// 계속 읽으라고 true
//				try {
//					data = is.read();	// FileInputStream()로 지정한 경로의 파일을 read()라는 메소드로 1바이트씩 계속 읽어온다.
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				if(data == -1) break;	// 더 이상 읽을 것이 없을 때는 데이터에 -1이 담긴다. 그때 break로 빠져나온다.
//				System.out.println("data : " + data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(is != null) is.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
//		// read(byte[])
//		InputStream is = null;
//		try {
//			is = new FileInputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\hello.txt");
//			int data = 0;
//			byte[] arr = new byte[3];
//			
//			while(true) {
//				try {
//					data = is.read(arr);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				if(data == -1) break;
//				System.out.println("data : " + data);
//				for (int i = 0; i < arr.length; i++) {
//					System.out.println("arr[" + i + "]" + arr[i]);
//				}
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// write()
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\Workspace\\Exercise\\Test\\ioTest\\hello1.txt");
			String data = "Hello Java World!!";
			byte[] arr = data.getBytes();

			try {
				os.write(arr, 0, 5);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(os != null) os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

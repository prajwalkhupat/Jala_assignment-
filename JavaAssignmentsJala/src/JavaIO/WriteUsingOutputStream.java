package JavaIO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteUsingOutputStream {

	public static void main(String[] args) {
		// 2.Write a program to write text to .txt file using OutputStream

		 String data = "This text is written using OutputStream.";

	        try {
	            // FileOutputStream is a subclass of OutputStream
	            //file path passed as parameter to the FileOutputStream constructor.
	            OutputStream fos = new FileOutputStream("os.txt");

	            // Converts the string into bytes
	            byte[] db = data.getBytes();

	            // Writes data to the output stream
	            fos.write(db);
	            System.out.println("Data is written to the file.");

	            // Closes the output stream
	            fos.close();
	        } catch (Exception e) {
	            /* printStackTrace() prints the throwable Exception object as well as with other Information
	            like the line number where Exception occurs and class name where the exception occurred.*/
	            e.getStackTrace();
	        }
	}

}

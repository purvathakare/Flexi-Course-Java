import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamToByteArray {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.print("Enter the file name: ");
			String fileName = scanner.nextLine();

			FileInputStream inputStream = new FileInputStream(fileName);

			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			byte[] data = new byte[1024];
			int bytesRead;
			while((bytesRead = inputStream.read(data)) != -1){
				buffer.write(data, 0, bytesRead);
			}
			byte[] byteArray = buffer.toByteArray();
			System.out.println("Byte array length: "+byteArray.length);

			inputStream.close();
			buffer.close();
		} catch(IOException e){
			System.out.println("An error occurred: "+e.getMessage());
		} finally{
			scanner.close();
		}
	}
}

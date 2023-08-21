package filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\IOstreams\\resume.txt");
		//boolean b=f.createNewFile();
		//System.out.println(b);
		System.out.println(f.exists());
		System.out.println(f.isHidden());
		System.out.println(f.canWrite());
		f.setWritable(true);
		

	}

}

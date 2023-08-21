package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		File f = new File("./text.txt");
		System.out.println(f.exists());
		if(!f.exists()) {
			System.out.println(f.createNewFile());
			
		}
		
		/*
		 * FileInputStream fis = new FileInputStream(f);
		 * //System.out.println((char)fis.read()); int x; int count=0;
		 * while((x=fis.read())!=-1) { System.out.print((char)x); } fis.close();
		 */
		
		
		/*
		 * Scanner sc = new Scanner(f); int count =0; while(sc.hasNextLine() ) {
		 * count++; System.out.println( sc.nextLine());
		 * 
		 * } System.out.println(count); sc.close();
		 */
		
		FileReader fr = new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
	//System.out.println(	br.readLine());
	int count=0;
	String s=new String();
	while((s=br.readLine())!=null) {
		count++;
		System.out.println(s);
		
		
	}
	System.out.println(count);
	fr.close();
	br.close();
		}
	

	}


package strings;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class txt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String inp = sc.nextLine();
		FileOutputStream fo = new FileOutputStream("C:/Users/Ravi Chandra/Documents/new.txt");
		//BufferedOutputStream bo = new BufferedOutputStream(fo);
		fo.write(inp.getBytes());
		fo.close();
	}

}




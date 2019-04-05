package dictionary;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class DataExternal {

	public static void main(String[] args) throws IOException {
		String path = "C:\\abc\\J\\dictionary.txt";
		File f = new File (path);
		
			FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while ((line=br.readLine())!=null ) {
			System.out.println(line);
		}

	}

}

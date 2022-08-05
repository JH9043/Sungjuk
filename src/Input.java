import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Input {
	private Student array[];
	private Scanner sc;
	private File file;
	private BufferedReader br;

	public Input(Student[] array) {
		this.array = array;

		this.file = new File("C:/Temp/sungjuk_utf8.dat");

		try {
//			this.br = new BufferedReader(new FileReader(this.file));
			this.sc = new Scanner(file, "utf-8");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

//	public int fileinput() {
//		int count = 0;
//		while(this.sc.hasNextLine()){
//			String str = sc.nextLine(); //다음 라인 넘어가는거
//			count++;
//		}
//		return count;
//	}
	public int fileinput() {
		int count = 0;
		String line = null;
		while(true) {
			count++;
			try {
				line = this.br.readLine();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			if(line == null) break;{
				String lines [] = line.split("\\s+");
				System.out.println(lines[0]);
				
			}
			
			
		}
		
	}
	
	
//	public int fileinput() {
//		int count = 0;
//		String line = null;
//		while(true) {
//			count++;
//		try {
//			line =this.br.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(line ==null) break;
//		}
//		return count-1;
//	}
	

	
	public int input() {
		return 0;

	}
}

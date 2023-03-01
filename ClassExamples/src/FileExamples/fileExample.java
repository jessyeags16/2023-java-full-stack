package FileExamples;
//2/17/23

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileExample {

	public static void main(String[] args) throws IOException {
		// using a single . means the current directory
		// using a double .. means the parent directory

		// relative path is based on where you currently are in the folder structure
		// absolute path is from the root of the folder structure

		// this is using an absolute path to get the starting directory of this eclipse
		// project
		File file = new File("./src/FileExamples"); // this ./ will return the current

		// Printing the absolute path would get us the full path
		System.out.println(file.getAbsolutePath());

		if (file.isDirectory()) {
			System.out.println(file.getName() + " is a directory");
			// System.out.println(file.getParentFile()+ " is the parent directory");

			for (File f : file.listFiles()) {
				System.out.println(f.getName());
			}
		}

		File code = new File("./src/FileExamples/fileExample.java");
		System.out.println("The file exists: " + code.exists());

		try {
			BufferedReader br = new BufferedReader(new FileReader(code));

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package examples;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo1 {

	public static void main(String[] args) {

		Path testFilePath = Paths.get("D:\\test\\testfile.txt");

		// retrieve basic information about path
		System.out.println("Printing file information: ");
		System.out.println("\t file name: " + testFilePath.getFileName());
		System.out.println("\t root of the path: " + testFilePath.getRoot());
		System.out.println("\t parent of the target: " + testFilePath.getParent());

		// print path elements
		System.out.println("Printing elements of the path: ");
		for (Path element : testFilePath) {
			System.out.println("\t path element: " + element);
		}
	}

}

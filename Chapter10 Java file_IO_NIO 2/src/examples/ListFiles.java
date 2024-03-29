package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFiles {

	public static void main(String[] args) throws IOException {

		try (Stream<Path> entries = Files.walk(Paths.get("."))) {
			
			entries.forEach(System.out::println);
		}
	}

}

package day20.Exam02;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExam {

	public static void main(String[] args) throws URISyntaxException, IOException {
		//date.txt의 절대(저장)경로가 나온다. 
//		String str = FileStreamExam.class.getResource("data.txt").getPath();
//		System.out.println(str);
		Path path =Paths.get( FileStreamExam.class.getResource("data.txt").toURI());
		System.out.println(path);
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line-> System.out.println(line));
		stream.close();

	}

}

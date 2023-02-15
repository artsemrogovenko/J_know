import java.io.File;
import java.lang.String;

/** Напишите метод, который определит тип (расширение) файлов из текущей папки
и выведет в консоль результат вида
			1 Расширение файла: txt
			2 Расширение файла: pdf
			3 Расширение файла: 
			4 Расширение файла: jpg */

public class Extfile {
public static void main(String[] args) {
	File dir = new File(".");
	extension(dir.list());
}
	private static void extension(String[] filenames) {
		for (int index = 0; index < filenames.length; index++) {
			int pos = filenames[index].lastIndexOf('.');
			if (pos == -1) {
				continue;
			}
			System.out.println(filenames[index].substring(pos + 1));
		}
	}
}

package makereport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Library that allows to generate reports through files in any format using the
 * Method {@code makeReport}
 * 
 * @author silex189
 * @since 2018
 * @version 1.2
 */

public class Report {

	private String nameFile;
	private String title;
	private String content;
	private String extension;

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void makeReport() {
		if ((getNameFile() != null) && (getTitle() != null) && (getContent() != null)) {
			// Creating file
			try {

				File file = new File(getNameFile() + "." + getExtension());
				FileOutputStream fos = new FileOutputStream(file);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();

			} catch (IOException excpetion) {
				excpetion.printStackTrace();
			}

		} else {
			System.out.println("Enter the file data");
		}
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}

package prefinal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditorModal {

	private File currentSelectFile;
	
	public String openFile(File file) {
		this.currentSelectFile = file;
		String text = "";
        try (FileReader fileReader = new FileReader(currentSelectFile)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                text += (char) ch;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return text;
	}
	
	public void saveFile(String content) {
		try (FileWriter fw = new FileWriter(currentSelectFile)) {
			for (int i = 0; i < content.length(); i++) {
				fw.write(content.charAt(i));
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public File getCurrentSelectFile() {
		return currentSelectFile;
	}
	
	public void setCurrentSelectFile(File currentSelectFile) {
		this.currentSelectFile = currentSelectFile;
	}
	
}

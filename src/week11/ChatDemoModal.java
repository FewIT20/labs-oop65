/**
 * You can follow me on instagram!
 * https://www.instagram.com/few.pz/
 */
package week11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author "FewPz (IG: few.pz")
 */
public class ChatDemoModal {

    private File logs;
    
    public ChatDemoModal() {
        logs = new File("ChatDemo.dat");
        try {
            logs.createNewFile();
        } catch (IOException ex) {
            ex.printStackTrace();;
        }
    }
    
    public String loadText() {
        String text = "";
        try (FileReader fileReader = new FileReader(logs)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                text += (char) ch;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return text;
    }
    
    public void saveText(String text) {
        try (FileWriter fw = new FileWriter(logs)) {
            for (int i = 0; i < text.length(); i++) {
                fw.write(text.charAt(i));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}

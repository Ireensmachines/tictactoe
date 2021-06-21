package novi.basics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void main(String[] args) throws IOException {

        // stap 1 content bepalen
        String scores = "player Erik: 3, Player Arno: 9 ";

        // stap 2 bestand aanmaken
        File scoresFiles = new File("scores.txt");
        FileWriter fileWriter = new FileWriter(scoresFiles);

        // stap 3 content naar bestand schrijven
        fileWriter.write(scores);

        fileWriter.close();
    }
}


package classes.filehandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TxtFileMaker {
        private static final String FOLDER_PATH = "C:\\myprojects\\generated-files\\txt\\";
        private static final String FILE_NAME_PREFIX = "MARC-LOG-";
        private static final String FILE_EXTENSION = ".txt";

        public void createTextFile() {
            // path
            String fullPath = generateFileName();

            try (FileWriter writer = new FileWriter(fullPath)) {
                writer.write(generateContent());
                System.out.println("Text file created successfully at: " + fullPath);
            } catch (IOException e) {
                System.out.println("Text file not created");
                e.printStackTrace();
            }
        }

        public String generateFileName() {
            int counter = 1;
            String fileName = FOLDER_PATH + FILE_NAME_PREFIX + LocalDate.now().toString() + FILE_EXTENSION;

            if (defaultFileExists()) {
                while (numberedFileExists(fileName, counter)) {
                    counter++;
                    fileName = FOLDER_PATH + FILE_NAME_PREFIX + LocalDate.now().toString() + "_" + counter + FILE_EXTENSION;
                }
            }
            return fileName;
        }

        private boolean defaultFileExists() {
            String filePath = FOLDER_PATH + FILE_NAME_PREFIX + LocalDate.now().toString() + FILE_EXTENSION;
            File file = new File(filePath);
            return file.exists();
        }

        private boolean numberedFileExists(String fileName, int counter) {
            String filePath = fileName.replace(FILE_EXTENSION, "_" + counter + FILE_EXTENSION);
            File file = new File(filePath);
            return file.exists();
        }


        public String generateContent() {
            // Replace this with your logic to generate content
            return "Generated content for the text file.";
        }

}


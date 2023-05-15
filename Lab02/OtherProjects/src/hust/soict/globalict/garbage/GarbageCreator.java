package hust.soict.globalict.garbage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "D:\\github\\TrinhGiangNam_20215229\\Lab02\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\test.txt";
        //Path pathToFile = Paths.get(filename);
        //System.out.println(pathToFile.toAbsolutePath());

        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outputString = "";
        //StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputString += (char) b;
            //outputStringBuilder.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

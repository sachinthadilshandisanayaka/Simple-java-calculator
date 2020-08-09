package com.company;
import java.io.*;


public class File_Read {
    public double[] getNumber = new double[10];

    public String file_read() throws IOException {

        int i = 0;
        File file = new File("C:\\Users\\sachi dissanayake\\IdeaProjects\\File_Read_Test\\src\\com\\company\\test.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        if ( file.canRead() ) {
            while (( line = br.readLine() ) != null) {
                try {
                    getNumber[i] = Double.parseDouble( line );
                    i++;
                } catch ( NumberFormatException e ) {
                    System.out.println("Text document has not valid numbers!");
                    return null;
                }
            }
                if ( i == 2 ) {

                    return String.format(getNumber[0] + ","+ getNumber[1]);
                } else {
                    System.out.println("Text document has not two values!");
                    return null;
                }
        } else {
            System.out.println("File can not read !");
            return null;
        }
    }
}

package com.company;
import java.io.IOException;

public class Get_value {
    private double[] valuesArray = new double[2];

    public double getValues(int p) {
        return valuesArray[p];
    }
    public void setValues() throws IOException {

        File_Read ob = new File_Read();

        if ( ob.file_read() != null ) {

            String[] arr = ob.file_read().split(",");
            if ( arr != null ) {
                int i = 0;
                for ( String a: arr ) {
                    valuesArray[i] = Float.parseFloat(a);
                    i++;
                }
            }
        }
    }
}

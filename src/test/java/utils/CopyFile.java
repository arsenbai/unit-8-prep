package utils;

import java.io.*;

public class CopyFile {
    public static void copyViaByteStream() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/test/resources/input.txt");
            out = new FileOutputStream("src/test/resources/output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

    public static void copyViaCharacterStream() throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("src/test/resources/input2.txt");
            out = new FileWriter("src/test/resources/output2.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

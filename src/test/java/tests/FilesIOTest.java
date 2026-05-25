package tests;

import org.testng.annotations.Test;
import utils.CopyFile;

import java.io.IOException;

public class FilesIOTest {
    @Test
    public void copyFileViaByteStreamTest() throws IOException {
        CopyFile.copyViaByteStream();
    }

    @Test
    public void copyFileViaCharacterStreamTest() throws IOException {
        CopyFile.copyViaCharacterStream();
    }
}

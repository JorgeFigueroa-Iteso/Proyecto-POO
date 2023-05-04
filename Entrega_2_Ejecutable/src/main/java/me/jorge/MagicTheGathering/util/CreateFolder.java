package me.jorge.MagicTheGathering.util;

import java.io.File;

public class CreateFolder {
    public static void createFolder(String folderName) {
        File folder = new File(folderName);
        if (!folder.exists()) {
            folder.mkdir();
        }
    }
}

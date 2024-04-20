package ru.frolov;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] territoriesInfo = {"Территория-1", "Территория-2", "Территория-3"};
        String[] resourcesInfo = {"Ресурс-1", "Ресурс-2", "Ресурс-3"};
        String[] diplomacyInfo = {"Дипломатия-1", "Дипломатия-2", "Дипломатия-3"};
        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User-PC\\aTest\\fileForSerializable.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(savedGame);

    }
}
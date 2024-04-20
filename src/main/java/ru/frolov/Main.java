package ru.frolov;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] territoriesInfo = {"Территория-1", "Территория-2", "Территория-3"};
        String[] resourcesInfo = {"Ресурс-1", "Ресурс-2", "Ресурс-3"};
        String[] diplomacyInfo = {"Дипломатия-1", "Дипломатия-2", "Дипломатия-3"};
        SavedGame savedGame = new SavedGame(territoriesInfo, resourcesInfo, diplomacyInfo);
        System.out.println(savedGame);

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\User-PC\\aTest\\fileForSerializable.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(savedGame);
        objectOutputStream.close();

        System.out.println();
        System.out.println();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User-PC\\aTest\\fileForSerializable.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object resultObject = objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(resultObject);

        System.out.println("=================================================================");
        System.out.println();
        //Man---------------------------------
        Man man = new Man("Vasia", 44);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\User-PC\\aTest\\forMan.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        System.out.println(man);

        oos.writeObject(man);
        oos.close();

        FileInputStream fis = new FileInputStream("C:\\Users\\User-PC\\aTest\\forMan.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Man deserMan = (Man) ois.readObject();
        ois.close();

        System.out.println();
        System.out.println(man);


    }
}
package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        File dir = new File("D://Games");
        builder.append("Initial catalog Games");
        File dir1 = new File("D://Games//src");
        dir1.mkdir();
        builder.append("Make src on Games");
        File dir2 = new File("D://Games//res");
        dir2.mkdir();
        builder.append("Make res on Games");
        File dir3 = new File("D://Games//savegames");
        dir3.mkdir();
        builder.append("Make savegames on Games");
        File dir4 = new File("D://Games//temp");
        dir4.mkdir();
        builder.append("Make temp on Games");
        File dir5 = new File("D://Games//src//main");
        dir5.mkdir();
        builder.append("Make src on Games//main");
        File dir6 = new File("D://Games//src//test");
        dir6.mkdir();
        builder.append("Make test on src//test");
        File newFile = new File("D://Games//src//main//Main.java");
        try
        {
            newFile.createNewFile();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        builder.append("Create main.java on main");
        File newFile2 = new File("D://Games//src//main//utils.java");
        try
        {
            newFile2.createNewFile();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        builder.append("Create utils.java on main");
        File dir7 = new File("D://Games//res//drawables");
        dir7.mkdir();
        builder.append("Create drawables on res");
        File dir8 = new File("D://Games//res//vectors");
        dir8.mkdir();
        builder.append("Create verctors on res");
        File dir9 = new File("D://Games//res//icons");
        dir9.mkdir();
        builder.append("Create icons on res");
        File newFile3 = new File("D://Games//temp//temp.txt");
        try
        {
            newFile3.createNewFile();
            builder.append("Create temp.txt on temp\n");
            String completedString = builder.toString();
            FileWriter nFile = new FileWriter(newFile3);
            nFile.write(completedString + "\n");
            nFile.close();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

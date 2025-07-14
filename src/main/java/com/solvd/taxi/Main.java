package com.solvd.taxi;

import com.solvd.taxi.model.Env;
import com.solvd.taxi.model.User;

import java.io.File;
import java.io.InputStream;
import java.io.Writer;

public class Main {

    private final static double PI = 3.1415;

    public static void main(String[] args) {
        User user = new User();
        user.setName("A");
        User user1 = new User();
        user1.setName("B");
        System.out.println(user.getName());
        System.out.println(user1.getName());

        //Count amount of special words inside the file.
        // as the result provide new file with information implement using StringUtils and FileUtils
    }

    public void countWord(String word, String filePath) {
       // read file, and count
        File file = new File("");

    }
}

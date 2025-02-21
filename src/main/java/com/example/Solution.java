package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    ArrayList<Helyek> helyekList = new ArrayList<>();   

    public ArrayList<Helyek> fileToList() {
        try {
            tryFileToList();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            
        }
                return helyekList;
    }
    public ArrayList<Helyek> tryFileToList() throws FileNotFoundException {   
        
        File file = new File("helyek.txt");
        Scanner sc = new Scanner(file, "utf8");
        sc.nextLine();
        while(sc.hasNext()) {
            String line = sc.nextLine();

            String[] lineArray = line.split(":");
            Helyek helyek = new Helyek();           
            helyek.setPlace(lineArray[0]);
            helyek.setFinish(lineArray[1]);
            helyekList.add(helyek);
            helyekList.add(helyek);         
            
        }
        sc.close();
        return helyekList;
        
    }
   
}

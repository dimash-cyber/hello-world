# hello-world

package com.cleaning;
import java.util.Scanner;
import java.lang.String;

// CONVERTING A WHOLE TEXT TO THE UPPERCASE LETTERS

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file1 = new File("C:\\fileexception\\harry.txt");
        File file2 = new File("C:\\fileexception\\final.txt");


        char CharCounter = 0;

        FileInputStream fileStream = new FileInputStream(file1);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader in = (new BufferedReader(input));
        PrintWriter out = (new PrintWriter(new FileWriter(file2)));

        int ch;
        while ((ch = in.read()) != -1)
        {
            if (Character.isLowerCase(ch))
            {
                ch = Character.toUpperCase(ch);
            }
            out.write(ch);
        }
        in.close();
        out.close();


        // ANALYSING METHODS FIVE FUCKING METHODS


        File file = new File("C:\\fileexception\\harry.txt");
        FileInputStream fileStr = new FileInputStream(file);
        InputStreamReader inp = new InputStreamReader(fileStr);
        BufferedReader reader = new BufferedReader(inp);

        String line;

        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int cnt = 0;
        int wordFrequency = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the suff, we count words that ends with this suff ");
        String suff = sc.nextLine();
        System.out.println(("Enter the word, we return the frequency of this word "));
        String word = sc.nextLine();

        while((line = reader.readLine()) != null)
        {
            characterCount += line.length();

            String[] wordList = line.split("\\s+");

            countWord += wordList.length;

    
            String[] sentenceList = line.split("[!?.:]+");

            sentenceCount += sentenceList.length;

            

            for (int j = 0; j < wordList.length; j++) {
                if(wordList[j].equals(word))
                    wordFrequency += 1;
            }

            for (int i = 0; i < wordList.length; i++) {


                if (wordList[i].endsWith(suff))
                    cnt += 1;
            }



        }

        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Total number of words with ending '" + suff + "' : " + cnt);
        System.out.println("Frequency of the word '" + word + "' : " + wordFrequency);





    }
}

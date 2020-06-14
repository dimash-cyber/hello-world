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
// HERE IS MY REPORT


//Abduali Dinmukhambet      180103261                  REPORT
/*
First of all, I wrote a program that converts whole text in the file to Upper Case. In the start of our code we have to prepare our program to read the bytes from the file. 
File file = new File("C:\\fileexception\\harry.txt");
 FileInputStream fileStream = new FileInputStream(file);
 InputStreamReader input = new InputStreamReader(fileStream);
BufferedReader reader = new BufferedReader(input);
This is how looks like our code in the beginning. Here FileInputStream receives from us some inputs via keyboard or via file . However human can not translate this inputs to computer’s language. And here InpuputStreamReader will help us. InputSreamReader reads bytes from inputs. And finally here Why we use BufferReader? BufferReader is very useful when it comes to productivity and comfort . It has a special field “buffer” where he contains symbols that he has read. And when he need this symbols he takes it from his buffer, not from the input stream. And it saves a lot of recourse for us. 
By the way, don’t forget to add “throw java.io.IOException” .All the methods in the binary I/O classes are declared to throw java.io.IOException. 
Now our program can read the input file. We can make it able to write something in to the file via using ‘printwriter’ class. The idea is that to create the second file where we store the uppercased  text of the previous file.
Here we are going to use the ‘while ’ loop which  works until the whole text will be read. We have to every character in the input  file if it is lowercased or not.  All lowercased characters we convert using toUppercase() method. Than all converted characters we write in to the second file.
That is it how we converted a whole text to the UpperCase letters.

Analysing methods
In next  coming sections we are going to write some program that provides us statistical data from the given file. First of these five methods is about finding number of words in the text file, the second one is about giving a number of sentences in this text file, the third one is counts us the number of characters. And the next one is receives string to the input and provides the number of words that ends with this string. And the last displays frequency of the word that we inputted. 
In the start we have to prepare program to read the text by using methods InputStreamReader, BufferReader just like I explained before. 
(1) We can define the ‘number of characters’ just giving him the length of the text.
(2) Than we  create  an array which contains sentences that splitted up by the symbols such us “.?! and ect.”. We can give the value of the length of this array to the ‘number of sentences’. 
(3) Now we have to create an array named wordlist which are splitted up by space delimiter. Length of this array gives us the value of the ‘wordCount’. 
(4) In the “for ” loop   we can define the value of ‘wordFrequency’ by using the “equals()” method.
(5) In the second “for ” loop we can define the number of the words that ends with specified string. here we have to check the wordlist by “equals()” method if it matches with this string or not.

/**
 * AUTHOR: Heman Gandhi, Douglas Rudolph
 * PROPOSAL: Data Structures - 112 - Assignment 1
 * DATE: March 24
 * FILE: Driver.java
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.io.File;

public class Driver{


    //Global alphabet char array that can be used for convenience at any point within the project
    public static final char[] ALPHABET = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
										   'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
                                           'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                                           'Y', 'Z', '0', '1', '2', '3', '4', '5',
                                           '6', '7', '8', '9'};


    public static void main(String [] args){
        
        //Create Rotors for the enigma machine  
        Rotor r1 = new Rotor(new char []{'5', '0', '9', 'T', '6', 'H', 'S', '8', '4', 
                                         '1', 'L', 'W', 'C', 'V', 'G', 'Q', 'K', 'I', 
                                         'X', '7', 'J', 'D', 'P', 'B', '2', 'O', '3', 
                                         'E', 'Z', 'M', 'U', 'F', 'N', 'A', 'Y', 'R'});
        
        Rotor r2 = new Rotor(new char []{'K', 'L', 'M', 'I', '1', '7', 'P', 'D', 'E', 
                                         'Z', 'F', 'B', 'A', 'C', '8', 'U', 'S', 'H', 
                                         '0', 'X', '5', '9', 'V', 'G', 'W', 'T', '2', 
                                         'R', '4', 'O', '6', 'N', '3', 'Q', 'Y', 'J'});
        
        Rotor r3 = new Rotor(new char []{'K', 'V', '7', 'D', 'J', '5', '9', 'C', 'A', 
                                         '0', 'B', 'O', '6', 'Q', 'P', '1', 'L', '8', 
                                         'W', '4', 'N', 'Z', 'F', 'E', 'R', 'G', 'I', 
                                         '3', 'T', 'Y', 'M', 'H', 'U', 'X', 'S', '2'});
        

        /*
         * Reflector Mapping: Char1 -> Char2
         *
         * Char1 is given from rotor3 and is mapped to char2 where char2 is the lexicographic 
         * value of the value of char1.
         */
        Rotor reflector = new Rotor(new char []{'9', 'N', 'F', 'K', '6', 'B', 'C', 
                                                'S', 'P', '7', 'J', 'R', '2', '8', 
                                                'X', 'D', 'I', 'E', 'V', '0', '5', 
                                                'M', 'U', '3', 'Q', '1', '4', 'A', 
                                                'O', 'G', 'H', 'L', 'T', 'Z', 'W', 'Y'});

        //Create an instance of the Enigma machine 
        //1. pass in the rotor
        //2. set the starting state of each rotor
        Enigma luftwaffe = new Enigma(reflector, r1, r2, r3, 'C', 'L', 'Z');

        //Read the messsage in from the message file
        File m1 = new File("message1.txt");
        Scanner scan = new Scanner(m1);
        String msg="";
        while(scan.hasNext()){
             msg.append(scan.nextLine());
        }
        
        //Add the msg string to the LinkedList character by character 
        LinkedList<Character> msgList = LinkedList<Character>();
        msgList.addAll(msg.toCharArray());
       
        //Get the encoded linked list and print it out 
        LinkedList<Character> enc = luftwaffe.encode(msgList);
        String encStr = "Encoded: ";
        for(char c: enc) encStr.append(c);
        System.out.println(encStr);
        
        //Get the decoded linked list and print it out 
        LinkedList<Character> dec = luftwaffe.encode(enc);
        String decStr = "Decoded: ";
        for(char c: dec) decStr.append(c);
        System.out.println(decStr);


    }
}

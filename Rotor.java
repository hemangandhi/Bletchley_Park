/**
 * AUTHOR: Heman Gandhi, Douglas Rudolph
 * PROPOSAL: Data Structures - 112 - Assignment 1
 * DATE: March 24
 * FILE: Rotor.java
 */
public class Rotor{

    /**
     * Makes a rotor.
     * @param state: The char [] will be the state so that
     * state[0] will map to 'a' and state[25] to 'z'.
     */
    public Rotor(char [] state){
    }

    /**
     * Get the encoded char for a given char.
     */
    public char encodeOne(char enc){}
    
    /**
     * Get the decoded char for a given char.
     */
    public char decodeOne(char dec){}

    /**
     * Rotates the rotor once.
     * @return: Returns true if and only if the rotor has completed a full
     * circle.
     */
    public boolean rotate(){}

    /**
     * Reset the rotor offset to a particular position.
     * The char provided will be the char that should map to an 'a'.
     * @param v: The character that should correspond to 'a'.
     */
    public void setState(char v){}
    
}

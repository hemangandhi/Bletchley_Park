import java.util.LinkedList;

public class Enigma{

    /**
     * Make an enigma.
     * This will set the rotors to a particular state too. 
     */
    public Enigma(Rotor reflector, Rotor r1, Rotor r2, Rotor r3, char state1, char state2, char state3){}

    /**
     * Encrypt the provided string. The string will be a linked list of characters.
     * @param in: the string to encode as a linked list.
     * @return: the encrypted string as a linked list.
     */
    public LinkedList<Character> encrypt(LinkedList<Character> in){}

    /**
     * Alters the internal state to reset the rotors.
     */
    public void reset(){}
}

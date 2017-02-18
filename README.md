#What?

An idea for an introductory data structures assignment to implement an enigma machine. This will aim to introduce and reinforce concepts of circular linked lists.

#How? What's assigned?

We have a python prototype for testing. We will include some Java implementations of the assignment as well.

We hope to assign the following:
- An encoder to encode "German" messages. Schnell!
  - There will be a "create rotor" to make a rotor.
  - There will be an encode.
  - There will be a decode.

#Why this assignment?

We believe that data structures (among introductory classes), should have projects that help people learn not only the content but some CS geekiness.

#The message choices

We will use weather reports in English for the messages so that the potential words will be fewer.

#The structure (and details)

The following classes will exist:
- A rotor class
  - Create rotor will be here. (Char [] -> Circular linked list)
- An enigma class
  - Rotors would have to move to a start state. (Init with 3 rotors and 3 chars for the starting state.)
  - Encrypt will be here. This would take messages as a linked-list of chars and output an encoded copy.
  - Decode will be here to decode given a state.
  

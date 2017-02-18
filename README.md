#What?

An idea for an introductory data structures assignment to implement an enigma machine. This will aim to introduce and reinforce concepts of circular linked lists.

#How? What's assigned?

We have a python prototype for testing. We will include some Java implementations of the assignment as well.

We hope to assign the following:
- An encoder to encode "German" messages. Schnell!
  - There will be a "create rotor" to make a rotor.
  - There will be an encode.
- Perhaps a checker function. We will have to research the 1940s implementation. We cannot trivially implement the Stecker so that would not exist.
  - We would include a code cracker with a small dictionary.
  - 

#Why this assignment?

We believe that data structures (among introductory classes), should have projects that help people learn not only the content but some CS geekiness.

#The message choices

We will use weather reports in English for the messages so that the potential words will be fewer.

#The structure

The following classes will exist:
- A rotor class
  - Create rotor will be here.
- An enigma class
  - Encrypt will be here.
- A driver with a decrypt.

## Getting Started

Welcome to the LAB01. Here is a guideline to help you get started with Java RMI.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## There will be 4 files in this LAB01:
* Hello.java - *to create remote interface*
* ImpleExample.java - *to implement the remote interface __Hello__*
* HelloClient.java - *the client application for the RMI*
* HelloServer.java - *the server application for the RMI*

## To run this application
1. Compile the files with `javac *.java` command
2. Run `java HelloServer` in first terminal.
3. Run `java HelloServer` in second terminal.

> rmiregistry is not needed to run before this as it is created in the _HelloServer.java_ file.

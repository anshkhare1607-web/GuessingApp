# GuessingApp

A simple console-based number guessing game implemented in Java.

## Description

GuessingApp is a Java application where players attempt to guess a randomly generated number between 1 and 100 within a limited number of attempts. The game provides hints after incorrect guesses and saves game results for future reference.

## Features

- Random number generation between 1 and 100
- Limited attempts (7 maximum)
- Input validation with custom exceptions
- Progressive hints based on attempts
- Game result storage
- Option to restart the game

## Requirements

- Java Development Kit (JDK) 8 or higher
- Command-line interface

## Game Rules

- Guess a number between 1 and 100
- You have 7 attempts to guess correctly
- After each incorrect guess, receive a hint
- Hints include parity (even/odd) and range information
- Game results are saved to game_result.txt

## Project Structure

- `guessingApp.java`: Main application class
- `GameController.java`: Handles game restart logic
- `GameConfig.java`: Game configuration and rules
- `GuessValidator.java`: Validates guesses against target
- `HintGeneration.java`: Generates hints based on attempts
- `InvalidInputException.java`: Custom exception for invalid input
- `StorageService.java`: Saves game results to file
- `ValidationService.java`: Validates user input
- `game_result.txt`: Stores game results
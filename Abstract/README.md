# Class-Vs-Instance

## Hacker Rank 30 Day Code Challenge Day 4

HackerRank is a technology company that provides a platform for competitive programming challenges and technical interviews. 
It was founded in 2009 and is headquartered in Mountain View, California.

### Features

- Code Challenges
- Practice
- Contest 
- Interview Preparation
- Skill Certification
- Hiring

### Problem

Given a Book class and a Solution class, write a MyBook class that does the following:

Inherits from Book
Has a parameterized constructor taking these  parameters:
- string title,
- string author,
- int price

Implements the Book class' abstract display() method so it prints these  3 lines:
Title: , a space, and then the current instance's title.
Author: , a space, and then the current instance's author.
Price: , a space, and then the current instance's price.

### Input format:
You are not responsible for reading any input from stdin. The Solution class creates a Book object and calls the MyBook class constructor (passing it the necessary arguments). It then calls the display method on the Book object.

### Output format
The void display()  method should print and label the respective title, author, and price of the MyBook object's instance (with each value on its own line) like so:

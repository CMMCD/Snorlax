# Snorlax

## Synopsis

Snorlax is a sorting algorithm with extremely high efficiency O(1).
The implementation in this repository is written in Java.

All sorting algorithms have drawbacks, things like difficulty to implement, 
being slow for certain types of data, or having very poor efficiency with a large numbers of inputs.
Snorlax's drawback for its incredible efficiency is that it is not 100% accurate.
This means that in some cases Snorlax can return lists that are not completely sorted. 

## Code Example

```Java
// Creating an example array to be sorted
int[] input = {1,24,1283786,999999999};
    
// Creating a new snorlax named Aslan
snorlax Aslan = new snorlax("Aslan");
    
// Using Aslan to call snorlaxSort on our array
int[] sortedInput = Aslan.sort(input);
```

## Motivation

This project was created as a proof of concept that a more efficent sorting algorithm could be created.
This problem is important for all of Computer Science and in extension, all of humanity as increaced sorting speeds
would allow for faster computation in all areas, lowering the price of computing, computers, etc. 

## Installation

Snorlax is simply a java class that must be downloaded and moved to the directory you want to use it.
Once moved to your project's directory you can create a new snorlax. 
```Java
snorlax Aslan = new snorlax("Aslan");
```

## API Reference

None Currently.

## Contributors

If you wish to expand upon Snorlax Sort, feel free! 

## License

This project is licensed under the terms of the MIT license.
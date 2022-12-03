## Best Team

### GOAL:

To learn and implement design patterns in an application.

Contributions:

* Indranil: Factory pattern for selecting the opponent Pokemon
* Abhishek: Command pattern for selecting the moves, party Pokemon and bag items
* Sushmitha: composite pattern to display the buttons on battle screen
* Sai: Observer Pattern for tracking the Pokemon HP, video


### Link to the game video

### Project Description

We have made a game of Pokemon where the player can move around in the Pokemon world and fight with the wild Pokemon and the trainers with other pokemon.

* We have implemented the game in Greenfoot. User have the option to move around in the bushes and find a Pokemon to fight.
* Defeating the Pokemon adds to the experience of the Pokemon.
* Increase in exp leads to increase in the level and after a certain level the Pokemon evolves into its next stage.
* In the game, the user can battle with 5 trainers spread over the game and fight with them. Beating all 5 wins the game for the user.

### State diagram
<img src="https://github.com/nguyensjsu/fa22-202-best-team/blob/abfaa39c36cd704e8122477bcb0ff1cad4ca4c99/Game%20state%20machine.png" />

### Class diagram

**Factory patterns**:

In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

**Command pattern**:

Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

**Composite pattern**:

Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
We have applied composite pattern to display option buttons on battle screen.
<img src="https://github.com/nguyensjsu/fa22-202-best-team/blob/682e1855919fc2ec238f906493092a1810b6ba19/Composite%20Pattern.png" />

**Observer pattern**:

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.


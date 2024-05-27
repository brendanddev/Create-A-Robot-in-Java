# Java-Assignment-3-Create-A-Player

This assignment mainly focusses on association, but also makes use of constructors and overloading. I have defined multiple classes for objects that can draw themselves on a GraphicsContext. All the objects will be related to one another through the relationship of association. Then I have created a simple
graphical app to display each of the objects/classes.

The main idea/focus of this assignment is creating the 'Robot Olympics'. This will consist of three teams and a referee, these four objects are the model. The view for this assignment is a class created using FXGraphics which creates and draws the model. A team has a name and contains 3 players of the same color, each with a random number integer representing their win percentage (0-99). A player has a head and two wheels. The referee is a single player. The ref is not part of a team, but it was drawn from one of them, selected randomly at run time, and its color and title show that.

The Head class will consist of an oval, rectangle, or other head-like shape with a neck shape attached. The x and y location determine its top left corner and the neck will be drawn relative to that. 

The Wheel class is a rectangle, oval or other wheel-like shape and its x and y location determine its top left corner. 

The Player class is a body shape with its win percentage displayed within it. The Players in each Team have the empty string as a title, but the referee has a non-empty title. A Player’s x and y location are determined by the top left corner of its body shape, and it contains two Wheels and a Head, appropriately sized, somewhere within or around
its body.

The first constructor creates a regular player with an empty title and a random win percentage. The second constructor is used to create the referee with a non-empty title and a win percentage of 100. Player constructors create Head and Wheel objects with placement based on the Player’s own location. The draw method draws the body and title for the Player, then calls the Head and Wheel draw methods.

A Team has three Players of the same color. The Players in a Team are drawn in a straight line from left to right, spaced out nicely. The location of a Team corresponds to the location its first Player. The Team constructor creates the Players. When a Team draws itself, it calls the Player draw methods, then it draws text underneath with the name of the Team and its average win percentage. The ThreeTeams class to serve as the view for the model described above. This class will be based on FXGraphicsTemplate. It should create three Teams and a Referee from one of the teams (selected randomly) and draw them. If done correctly, this should only take a few lines of code (to create and draw each object).

This assingment was made for the Programming In Java course at Mohawk College, I had achieved a grade of 100%.

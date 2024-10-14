# Create a Robot & Robot Olympics Simulation in Java

## About This Project

This project simulates the "Robot Olympics," featuring three teams of players and a referee. Each team consists of three players, all with unique colors and random win percentages, showcasing the principles of object-oriented programming, association, and graphical rendering in Java. The design follows a model-view architecture, where the model contains the objects and their behaviors, while the view handles the graphical representation using the FXGraphicsTemplate.

## Code Structure

The project is organized into several classes that represent different components of the Robot Olympics:

- **Head**: Represents a player's head with a shape and neck, positioned according to the player's location.
- **Wheel**: Represents a wheel with a defined shape, also positioned based on the player.
- **Player**: Represents a player with a body shape, win percentage, and associated head and wheels. Includes constructors for regular players and a referee.
- **Team**: Contains three players of the same color, positioned in a line. It calculates and displays the team's average win percentage.
- **ThreeTeams**: Acts as the view for the model, creating and drawing the teams and the referee.

## Features

- **Dynamic Elements**: Randomly generated win percentages and player attributes to ensure varied gameplay experiences on each run.
- **Graphical Rendering**: Utilizes Java's graphics capabilities to draw players, teams, and the referee on the screen.
- **Object-Oriented Design**: Implements principles of encapsulation, constructors, and overloading, along with associations between classes.

## Getting Started

To run the project, clone the repository and compile the Java files. Use your preferred IDE or the command line to execute the main class, which initializes and displays the Robot Olympics.

## Further Enhancements

Feel free to explore creative extensions to the project, such as:
- Additional player types or structures.
- Animations and sound effects.
- More complex team dynamics or competition formats.

## Documentation

All classes are documented following JavaDoc standards to ensure clarity and maintainability.


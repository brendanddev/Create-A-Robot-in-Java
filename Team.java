package assignmentThree_000879513;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class acts as another of the Model Classes for creating a team of players in the Robot Summer Olympics.
 * This class is for creating the team, which consist of the player objects. The team has four private instance variables
 * as shown on the UML diagram. x, and y as type doubles for the positions of the team on the canvas. Name as type String
 * as the name of the team, and color as type Color as the teams color. The Team constructor is created taking x, y, name,
 * and color as parameters. The class uses a method to calculate the teams average based on each of the three players
 * averages in that team, which are chosen at random, and uses a draw method to draw the team on the canvas,
 * consisting of the three players in the team.
 *
 * @author BRENDAN DILEO, 000879513
 */
public class Team {
    /**
     * Instance variables:
     * x, and y as type double.
     * name as type String.
     * color as type Color.
     */
    private double x;
    private double y;
    private String name;
    private Color color;

    // UML diagram says Team Class only has three instance variables, x, y, and name, but then how is it possible
    // to pass color to the Team constructor without an additional method not listed in the UML. This is the reason
    // I added color as a private instance variable.
    /**
     * Constructor for the team taking four parameters.
     *
     * @param x which is the x coordinate of the teams starting position.
     * @param y which is the y coordinate of the teams starting position.
     * @param name which is the name of the team.
     * @param color which is the color of the team.
     */
    public Team(double x, double y, String name, Color color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
    }

    /**
     * Method to calculate the team win average determined by each player in the teams win average.
     *
     * @param playerOne an instance of the Player class as the first player on the team.
     * @param playerTwo an instance of the Player class as the second player on the team.
     * @param playerThree an instance of the Player class as the third player on the team.
     *
     * @return the teams win average
     */
    private double winAverage(Player playerOne, Player playerTwo, Player playerThree) {
        double teamAverage = playerOne.getAverage() + playerTwo.getAverage() + playerThree.getAverage();
        return Math.round(teamAverage / 3);
    }

    /**
     * Method used to draw the team of players, and the Teams win average on the canvas.
     * Inside the method three instances of the Player class are created, and the draw method from that class is called
     * upon to draw the team of players on the canvas. Additionally, the average is drawn beneath each team by calling
     * upon the winAverage method.
     *
     * @param gc which is the GraphicsContext to draw the Team on.
     * Each team consists of three players.
     */
    public void draw(GraphicsContext gc) {
        Player playerOne = new Player(x, y, color);
        Player playerTwo = new Player(x + 120, y, color);
        Player playerThree = new Player(x + 240, y, color);
        playerOne.draw(gc);
        playerTwo.draw(gc);
        playerThree.draw(gc);

        // Draws the teams win average beneath the team.
        gc.setFill(Color.BLACK);
        gc.fillText(name + " ( Team Average " + winAverage(playerOne, playerTwo, playerThree) + " )", x, y + 90);

    }
}

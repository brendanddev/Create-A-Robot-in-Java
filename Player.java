package assignmentThree_000879513;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.util.Random;

/**
 * This class acts as another one of the Model Classes for creating a player in the Robot Summer Olympics.
 * This class is for actually creating the player, with the help of the head, wheel, shield, and sword classes.
 * The player takes five private instance variables as shown on the UML, x, and y as type double for the positions of the
 * player, determining where the player appears on the canvas. Average as type int for each player's average (win avg).
 * Also color and title, color as type Color, and title as type String. Where color represents the color of the player,
 * and title represents the title of the player. Two constructors are created for the player, the first being for the regular
 * players, and the second being for the referee player. The player constructor takes x, y, and color as parameters.
 * Whereas the referee constructor will take x, y, color, and title as parameters. The regular players average is
 * chosen at random, and the referees average is set to 100 no matter what. The referees color is decided randomly
 * depending on the team colors of the players, and the title is chosen randomly depending on the team names/titles.
 * The class also has a getter method to get the players average, and includes two other methods for choosing a
 * random color for the referee, and random title for the referee from the players colors and titles.
 *
 * @author BRENDAN DILEO 
 */
public class Player {
    /**
     * Instance Variables:
     * x, and y as type double.
     * average as type int.
     * color as type Color.
     * title as type String.
     */
    private double x;
    private double y;
    private int average;
    private Color color;
    private String title;

    /**
     * Constructor for Player object taking three parameters.
     *
     * @param x which is x coordinate for top left corner of the player position.
     * @param y which is the y coordinate for the top left corner of player position.
     * @param color which is the color of the player.
     */
    public Player(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.average = (int) (Math.random() * 100); // Players average is set to a random number between 1-99.
    }

    /**
     * Constructor for the Player/Referee object taking four parameters.
     *
     * @param x which is the x coordinate starting in the top left corner for the referee player.
     * @param y which is the y coordinate starting in the top left corner for the referee player.
     * @param color which is the color of the referee player.
     * @param title which is the title of the referee player.
     */
    public Player(double x, double y, Color color, String title) {
        this.x = x;
        this.y = y;
        this.color = refereeColor(randomNumber); // Uses the refereeColor method.
        this.title = refereeTitle(randomNumber); // Uses the refereeTitle method.
        this.average = 100; // Referee average is set to 100.
    }

    /**
     * Method to actually draw the player objects on the canvas when it is called upon.
     * Inside the method an instance of the Head class is created, two instances of the Wheel class are created, an
     * instance of the Sword class is created, and an instance of the Shield class. The body (also kind of the head) is
     * drawn on the canvas with color being passed as a parameter, with a preset height and width, and parameters of x,
     * and y. The drawHead, drawWheel, drawSword, and drawShield methods are called upon so that this draw method
     * creates the head, wheels, sword, and shield on the canvas too.
     *
     * @param gc which is the Graphics Context to draw the Player on.
     *           Player consists of a head, two wheels, a sword, a shield and text containing of their average beneath
     *           them depending on x and y coords.
     */
    public void draw(GraphicsContext gc) {
        Head head = new Head(x, y);
        Wheel wheelOne = new Wheel(x, y);
        Wheel wheelTwo = new Wheel(x + 65, y);
        Sword sword = new Sword(x + 47, y - 13);
        Shield shield = new Shield(x - 25, y);

        // Draws body which is technically a part of head, but does not yet have predefined color so
        // is passed as parameter.
        gc.setFill(color);
        gc.fillOval(x, y, 70, 70);

        // Calls upon the draw methods from the correct classes.
        head.drawHead(gc);
        wheelOne.drawWheel(gc);
        wheelTwo.drawWheel(gc);

        // Checks the players title, determining if they have a title as the referee player should not
        // have a sword or shield.
        if (title == null) {
            sword.drawSword(gc);
            shield.drawShield(gc);
        }

        // Checks if the players title is not empty/null, so that the title only appears under the referee.
        if (title != null) {
            gc.setFill(Color.BLACK);
            gc.setFont(Font.font("Roboto", 15));
            gc.fillText(title, x - 15, y + 90);
        }

        // Draws the players average on their body, no if statement cause this includes referee.
        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("Roboto", 15));
        gc.fillText(average + " ", x + 25, y + 35);
    }

    /**
     * Method to get the players average.
     *
     * @return average which is the players average.
     */
    public int getAverage() {
        return average;
    }

    // An instance of the Random class is created for the purpose of generating a random number for the referees color
    // and title. It is defined outside the methods as both methods should take the same number for the purpose of
    // correlating the referees color with the correct team name/title.
    Random random = new Random();
    // A variable randomNumber is assigned to random number generated between 0 - 2.
    int randomNumber = random.nextInt(3);

    /**
     * Method to generate a random color for the referee player.
     * Takes the randomNumber value as a parameter to randomly pick the referees color from the team colors.
     * Each option in the if statement is one of the player team colors.
     *
     * @return color which is one of the player team colors chosen at random.
     */
    public static Color refereeColor(int randomNumber) {

        // Local variable color used as return value for random choice.
        Color color;
        if (randomNumber == 0) {
            color = Color.RED;
        } else if (randomNumber == 1) {
            color = Color.CORAL;
        } else if (randomNumber == 2) {
            color = Color.LIGHTBLUE;
        } else {
            color = Color.BURLYWOOD;
        }
        return color;
    }
    /**
     * Method to generate a random title for the referee player.
     * Takes the value of randomNumber as a parameter to randomly pick a title for the referee. Each number represents
     * a players team name and title for the referee.
     * Each option in the if statement is a possible title for the referee, followed by each possible players team name.
     *
     * @return title which is the randomly chosen referee title, and team name following the title.
     */
    public static String refereeTitle(int randomNumber) {

        // Local variable title used as return value for random choice.
        String title;
        if (randomNumber == 0) {
            title = "Linesman Cat";
        } else if (randomNumber == 1) {
            title = "Referee Eagle";
        } else if (randomNumber == 2) {
            title = "Coach Kangaroo";
        } else {
            title = "Judge Eagle";
        }
        return title;
    }
}

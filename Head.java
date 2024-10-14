package assignmentThree_000879513;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class acts as one of the Model Classes for creating a player for the Robot Summer Olympics.
 * It is for the robots head which takes two private instance variables for the x, and y positions of the
 * head determining where it will appear on the canvas. A constructor is created for the head which takes
 * two parameters x, and y. The method used for actually drawing the head uses the Graphics Context as a
 * parameter, and the method is responsible for drawing two rectangles, which will appear as the neck, and
 * head of the robot. In addition to the two rectangles, the method will also draw eyes, and a mouth on the players head.
 *
 * @author BRENDAN DILEO 
 */

public class Head {
    /**
     * Instance Variables:
     * x, and y as type double.
     */
    private double x;
    private double y;

    /**
     * Constructor for the head object taking two coordinates.
     *
     * @param x which is the x coordinate for the head/neck starting at top left corner.
     * @param y which is the y coordinate for the head/neck starting at top left corner.
     */
    public Head(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method to actually draw the head, neck, eyes, and mouth on the canvas when called upon.
     * Where the first rectangle is the head, the second two are for the eyes, the third is for the neck, and the last
     * one is for the mouth. The height and width are predefined, and the placement is determined by the x and y coords.
     * The color is defaulted to green, as the UML does not say the Head Class takes colors as instance variables.
     *
     * @param gc which is the Graphics Context canvas to draw the rectangles on.
     */
    public void drawHead(GraphicsContext gc) {

        // Draws Head
        gc.setFill(Color.GREEN);
        gc.fillRect(x + 16, y - 30, 40, 25);

        // Draws Eyes
        gc.setFill(Color.BLACK);
        gc.fillRect(x + 25, y - 25, 5, 5);
        gc.fillRect(x + 40, y - 25, 5, 5);

        // Draws Neck
        gc.setFill(Color.GREEN);
        gc.fillRect(x + 30, y - 15, 10, 20);

        //Draws Mouth
        gc.setFill(Color.BLACK);
        gc.fillRect(x + 26, y - 16, 20, 2);

    }
}

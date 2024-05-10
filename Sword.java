package assignmentThree_000879513;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class acts as another of the Model Classes for creating a player for the Robot Summer Olympics.
 * This class is for a basic sword that the robot will be holding which will take two private instance variables for
 * the x, and y positions of the sword. This is going to determine where the sword will appear on the canvas.
 * A constructor for the sword is created taking two parameters x, and y as coordinates for the sword. The class
 * has a method responsible for drawing the sword using the Graphics Context gc as a parameter, which will draw
 * a skinny longer rectangle as the swords blade, and a smaller wider rectangle as the swords grip.
 *
 * @author BRENDAN DILEO, 000879513
 */

public class Sword {

    /**
     * Instance variables:
     * x, and y as type double.
     */
    private double x;
    private double y;


    /**
     * Constructor for the sword object taking two coordinates as parameters.
     *
     * @param x which is the x coordinate for the sword starting in the top left corner.
     * @param y which is the y coordinate for the sword starting in the top left corner.
     */
    public Sword(double x, double y) {
            this.x = x;
            this.y = y;
    }

    /**
     * Method responsible for actually drawing the sword on the canvas when called upon.
     * Color for the blade is defaulted to silver, and the color for the grip is defaulted
     * to a shade of the brown color type.
     *
     * @param gc which is the Graphics Context to draw both rectangles(sword) on.
     */
    public void drawSword(GraphicsContext gc) {

        // Draws the blade of the sword as a rectangle.
        gc.setFill(Color.SILVER);
        gc.fillRect(x + 20, y - 5, 10, 35);

        // Draws the grip of the sword as a smaller rectangle.
        gc.setFill(Color.SADDLEBROWN);
        gc.fillRect(x + 22, y + 30, 7, 10);

    }
}


package createARobot;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class acts as another of the Model Classes creating a player for the Robot Summer Olympics.
 * It is for the robots wheels which take two private instance variables for the x, and y positions of the
 * wheel. These values will determine where the wheel will appear on the canvas. A constructor for the wheel is created,
 * which takes two parameters x, and y as the coordinates. The class also has a method responsible for drawing the
 * wheels using the Graphics Context as a parameter, drawing two skinny ovals which resemble the robots wheels.
 *
 * @author BRENDAN DILEO 
 */

public class Wheel {
    /**
     * Instance variables:
     * x, and y as type double.
     */
    private double x;
    private double y;

    /**
     * Constructor for the wheel object taking two coordinates as parameters.
     *
     * @param x which is the x coordinate for the wheel starting in top left corner.
     * @param y which is the y coordinate for the wheel starting in the top left corner.
     */
    public Wheel(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method to actually draw the wheels on the canvas when called upon.
     * The wheels color is defaulted to black, and the oval is the wheel with a set height and width.
     * Defaulted to black as the Wheel class in the UML does not take colors as instance variables.
     *
     * @param gc which is the Graphics Context canvas to draw the oval on.
     */
    public void drawWheel(GraphicsContext gc) {

        // Draws Wheel using a skinny Oval. Default Color is Black.
        gc.setFill(Color.BLACK);
        gc.fillOval(x, y, 7, 70);
    }
}


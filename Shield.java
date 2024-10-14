package createARobot;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

/**
 * This class acts as yet another one of the Model Classes for the Robot Summer Olympics. This class is for a basic
 * shield that the robots/players will be holding. The Shield class has two private instance variables x, and y, which
 * will determine where the shield will appear on the canvas when drawn. A constructor for the Shield is created taking
 * two parameters x, and y, which are coordinates for the Shields placement. The class also includes a method which will
 * be responsible for drawing the Shield using the Graphics Context gc as a parameter for the method. The method when
 * called upon will draw a round arc, which I have tried to resemble a shield.
 *
 * author BRENDAN DILEO 
 */
public class Shield {

    /**
     * Instance variables:
     * x, and y as type double
     */
    private double x;
    private double y;

    /**
     * Constructor for the Shield Object taking two coordinates as the parameters.
     *
     * @param x which is the x coordinate for the shield.
     * @param y which is the y coordinate of the shield.
     */
    public Shield(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This method is responsible for drawing the Shield onto the canvas when it is called upon.
     * The color of each shield a player will be holding is set to Plum as default.
     *
     * @param gc which is the Graphics Context to draw the shield(Arc).
     */
    public void drawShield(GraphicsContext gc) {

        // Draws shield using an Arc.
        gc.setFill(Color.PLUM);
        gc.fillArc(x, y, 40, 40, 120, 300, ArcType.ROUND);
    }
}

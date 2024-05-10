package assignmentThree_000879513;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This class acts as the view model for the Robot Summer Olympics. It contains little to no logic, and creates the
 * canvas and drawings on using JavaFX.
 *
 * @author BRENDAN DILEO, 000879513
 */
public class ThreeTeams extends Application {

    /**
     * Start method, this is used instead of the main method normally used.
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(500, 500); // Canvas size is 500x500
        stage.setTitle("The Robot Summer Olympics"); // Name of application
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Sets the background color to PapayaWhip
        gc.setFill(Color.PAPAYAWHIP);
        gc.fillRect(0, 0, 500, 500);

        // Three instances of the Team Class are created
        Team teamOne = new Team(50, 40, "Canada Cats", Color.RED);
        Team teamTwo = new Team(50, 210, "Egypt Eagles", Color.CORAL);
        Team teamThree = new Team(50, 385, "Kenya Kangaroos", Color.LIGHTBLUE);

        // Creates an instance of the Player Class. This will be the Referee, uses Referee constructor.
        Player referee = new Player(400, 140, Player.refereeColor(3), Player.refereeTitle(3));

        // Calls upon the draw methods to draw the Teams.
        teamOne.draw(gc);
        teamTwo.draw(gc);
        teamThree.draw(gc);

        // Calls upon the method to draw the Player Class. In this case the referee.
        referee.draw(gc);

        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}

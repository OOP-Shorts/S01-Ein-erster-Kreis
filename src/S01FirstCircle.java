import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class S01FirstCircle extends GraphicsApp {

    private Circle circle;

    @Override
    public void initialize() {
        setCanvasSize(500, 500);
        circle = new Circle(getWidth()/2, getHeight()/2, 50, Colors.RED);
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
        circle.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("S01FirstCircle");
    }
}

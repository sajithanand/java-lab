/*1. Program to draw Circle, Rectangle, Line    DATE-04/06/2022 */

import java.awt.event.*;
import java.awt.*;

public class GraphicsDemo extends Frame {

public GraphicsDemo() {
// Anonymous inner class to handle window close events.
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
});
}

public void paint(Graphics g) {

// Draw lines.
g.drawLine(30, 40, 500, 40);


// Draw rectangles.
g.setColor(Color.red);
g.drawRect(30, 100, 90, 50);
g.fillRect(30, 100, 90, 50);

// Draw Elipses and Circles
g.setColor(Color.blue);
g.drawOval(30, 200, 70, 70);
g.fillOval(30, 200, 70, 70);
.

}

public static void main(String[] args) {
GraphicsDemo appwin = new GraphicsDemo();

appwin.setSize(new Dimension(370, 700));
appwin.setTitle("GraphicsDemo");
appwin.setVisible(true);
}
}






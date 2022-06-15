/* Using 2D graphics commands in an Applet, construct a house. On mouse click event, change the color of the door from blue to red.  DATE--04/06/2022 */

import java.awt.event.*;
import java.awt.*;

public class GraphicsHome extends Frame implements MouseListener, MouseMotionListener {

public  GraphicsHome () {
addMouseListener(this);
addMouseMotionListener(this);
addWindowListener(new MyWindowAdapter());
}

public Color wind =Color.blue;

public void mouseClicked(MouseEvent me) {
    if(wind ==Color.blue){

        wind =Color.RED;

    }
    else if(wind ==Color.RED){
        wind =Color.blue;

    }

repaint();
}

public void mouseEntered(MouseEvent me) {
    //wind =Color.green;
    //repaint();
}
public void mouseExited(MouseEvent me) {
    //wind =Color.yellow;
    //repaint();
}
public void mousePressed(MouseEvent me) {

}
public void mouseReleased(MouseEvent me) {
}
public void mouseDragged(MouseEvent me) {
}

public void mouseMoved(MouseEvent me){
}


public void paint(Graphics g) {

// Draw a polygon
g.setColor(Color.yellow);
int xpoints[] = {80, 200,320};
int ypoints[] = {140, 75,140};
int num = 3;

g.fillPolygon(xpoints, ypoints, num);


// Draw rectangles.
g.setColor(Color.green);
g.drawRect(90, 140, 219, 140);
g.fillRect(90, 140, 219, 140);



g.setColor(wind);
g.drawRect(180, 180, 40,100);
g.fillRect(180, 180, 40, 100);




}

public static void main(String[] args) {
GraphicsHome appwin = new GraphicsHome();

appwin.setSize(new Dimension(370, 700));
appwin.setTitle("GraphicsHome");
appwin.setVisible(true);
}
}

class MyWindowAdapter extends WindowAdapter {
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}



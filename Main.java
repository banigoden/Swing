import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        MyAction myAction = new MyAction();
        myAction.Act();
//        JFrame jFrame = getFrame();

//        jFrame.add(new MyComponents());
//        EventHendl eventHandler = new EventHendl();
//        eventHandler.Hundler();

//        Action action = new Action();
//        action.button();

        // how many fonts
       // String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
      //  for(String name : fonts){
        //      System.out.println(name);
      //  }





    }

    static JFrame getFrame(){ // create window

        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 -250,dimension.height/2 - 150, 500,300);//need half from width
        jFrame.setTitle("Hello my Teddy ");
        return jFrame;

//        JFrame jFrame = new JFrame(){};
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        //  jFrame.setSize(500,300);
        //jFrame.setLocation(300,300);

    }
}

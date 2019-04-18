import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;

public class EventHendl {

    public void Hundler(){

        JFrame jFrame = Main.getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("Submit");
        jPanel.add(jButton);
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jFrame.setTitle(((JButton)e.getSource()).getText() );
//            }
//        });

        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "Source.text"));

        JButton jButton1 = new JButton("Nimdus");
        JButton jButton3 = new JButton( new MyAction());
        jPanel.add(jButton1);
        jPanel.add(jButton3);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                int i = 0;
            }
        });


    }
}

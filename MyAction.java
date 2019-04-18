import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyAction  extends AbstractAction {

    static private JPanel jPanel = new JPanel();

    MyAction(){

        //Description

        putValue(AbstractAction.SHORT_DESCRIPTION,"My small action");
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        jPanel.setBackground(Color.BLUE);


    }

    public void Act(){
        JFrame jFrame = Main.getFrame();
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());
        jButton.setText("submit");
        jPanel.add(jButton);

    }
}

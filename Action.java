import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action {

    public void button() {
        JFrame jFrame = Main.getFrame();

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton(" Service");
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener() { // we can't reuse
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });
    }


}

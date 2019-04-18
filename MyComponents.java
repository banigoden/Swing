import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class MyComponents extends JComponent { // create jcomponent
    @Override
    protected void paintComponent(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 20);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(font);
        g2.drawString("Kitty-Kitty", 20, 20);

        // line
        Line2D l2 = new Line2D.Double(70, 70, 190, 190);
        g2.draw(l2);
        // round
        Ellipse2D el = new Ellipse2D.Double(70, 70, 190, 190);
        g2.draw(el);

        g2.setPaint(Color.red);
        g2.fill(el);


        Rectangle2D r2 = new Rectangle2D.Double(70, 70, 190, 190);
        g2.draw(r2);
        try {
            URL url = new URL("https://logos.textgiraffe.com/logos/logo-name/Katya-designstyle-i-love-m.png");
            Image image = new ImageIcon(url).getImage();
            g2.drawImage(image, 270, 15, null);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}

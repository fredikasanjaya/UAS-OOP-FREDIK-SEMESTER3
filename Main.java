import javax.swing.*;
import java.awt.event.*;

public class Main{
  public static void main(String[] args) {
    final Binatang sapi = new
    Sapi("Fluffy");
    final Binatang Ayam = new 
    Ayam("Buddy");

    JFrame frame = new 
    JFrame("Binatang Sounds");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    JButton buttonSapi = new JButton("Sapi");

    buttonSapi.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        sapi.makeSound();

      }
    });
    panel.add(buttonSapi);

    JButton buttonAyam = new JButton("Ayam");

    buttonAyam.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        Ayam.makeSound();

      }
    });
    panel.add(buttonAyam);

    frame.add(panel);

    frame.pack();
    frame.setVisible(true);

  }
}
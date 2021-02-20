import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display_Image {

    public static void DisplayImageA320() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("images/A320CHECKLIST.png"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(900,1500);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void DisplayImageB737() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("images/B737CHECKLIST.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(900,1500);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void DisplayImageA340() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("images/A340Checklist.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(900,1500);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void DisplayImageB747() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("images/747.jpg"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        JFrame ScrollFrame = new JFrame("Scroll Pane Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(200,200);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextArea textArea = new JTextArea(20, 20);  
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
  
        frame.getContentPane().add(scrollableTextArea);  
    }
}

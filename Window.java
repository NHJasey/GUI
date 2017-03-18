import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        

public class Window extends JFrame implements ActionListener, KeyListener, MouseListener, MouseMotionListener {

    
    JPanel win = new JPanel();
    
    JButton btn1 = new JButton("Information");
    JButton btn2 = new JButton("Warning");
    JButton btn3 = new JButton("Error");
    
    JTextField field = new JTextField(38);
    JTextArea txtArea = new JTextArea(8, 38);
    
    int x;
    int y;
    
    //Constructor method
    public Window() {
    
        super("Example Window");
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(win);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        
        win.add(btn1);
        win.add(btn2);
        win.add(btn3);
        win.add(field);
        win.add(txtArea);
    
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        field.addKeyListener(this);
        txtArea.addMouseListener(this);
        txtArea.addMouseMotionListener(this);
        
    }

    public static void main(String[] args) {
        
        Window gui = new Window();
       
    }
    
    public void actionPerformed(ActionEvent event) {
        
        if(event.getSource() == btn1) {
            JOptionPane.showMessageDialog(this, "Information", "Info Request!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        if(event.getSource() == btn2) {
            JOptionPane.showMessageDialog(this, "Warning", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
        
        if(event.getSource() == btn3) {
            JOptionPane.showMessageDialog(this, "Error", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void keyPressed(KeyEvent pressed) {
        
        txtArea.setText("You have pressed a key!");
        
    }
    
    public void keyTyped(KeyEvent typing) {
        
        txtArea.append("\nYou typed the character: " + typing.getKeyChar());
        
    }
    
    public void keyReleased(KeyEvent released) {
        //null
    }
    
    public void mouseMoved(MouseEvent moved) {
        x = moved.getX();
        y = moved.getY();
    }
    
    public void mouseDragged(MouseEvent dragged) {
        //
    }
    
    public void mouseEntered(MouseEvent entered) {
        txtArea.setText("The mouse entered.");
    }
    
    public void mousePressed(MouseEvent pressed) {
        //
    }
    
    public void mouseReleased(MouseEvent released) {
        //
    }
    
    public void mouseClicked(MouseEvent clicked) {
        txtArea.append("\nThe mouse is at " + x + ", " + y);
    }
    
    public void mouseExited(MouseEvent exited) {
        txtArea.setText("The mouse exited.");
    }
}

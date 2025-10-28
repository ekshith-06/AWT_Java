import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener{
    Label l ;
    MyFrame(){
        super("Window Event Demo");
        setLayout(null);
        l=new Label("");
        l.setBounds(30,51,100,40);
        add(l);
        addWindowListener(this);

    }
    public void windowClosed(WindowEvent e){
        l.setText("Window closed");
    }

    public void windowOpened(WindowEvent e){
        l.setText("Window Opened");
    }

    public void windowIconified(WindowEvent e ){
        l.setText("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e){
        l.setText("Window Deiconified");
    }
    public void windowActivated(WindowEvent e){
        l.setText("Window Activated");
    }

    public void windowDeactivated(WindowEvent e){
        l.setText("Window Deactivated");
    }

    public void windowClosing(WindowEvent e){
        l.setText("WindowClosing");
        System.exit(0);
    }
}
public class WindowEventDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}

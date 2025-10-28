import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener,MouseMotionListener {
    Label l1,l2;
    MyFrame(){
        super("MouseEvent Demo");
        setLayout(null);
        l1=new Label("");
        l2=new Label("");
        l1.setBounds(30,50,100,30);
        l2.setBounds(30,80,100,30);
        add(l1);
        add(l2);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    //Abstract Methods from MouseListener
    public void mousePressed(MouseEvent e){
        l1.setText("Mouse Pressed");
    }
    public void mouseEntered(MouseEvent e){
        l1.setText("MouseEntered");
    }
    public void mouseExited(MouseEvent e){
        l1.setText("MouseExitied");
    }
    public void mouseReleased(MouseEvent e){
        l1.setText("MouseReleased");

    }
    public void mouseClicked(MouseEvent e){
        l1.setText("Mouseclicked");
    }



    //Abstract methods from MouseMotionListener interface....

    public void mouseDragged(MouseEvent e){
        l1.setText("MouseDragged");
    }

    public void mouseMoved(MouseEvent e){
        l1.setText("MouseMoved");
        l2.setText("("+e.getX()+","+e.getY()+")");
    }


}
public class MouseEventDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}

import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements AdjustmentListener{ 
    Scrollbar r,b,g;
    TextField tf;
    public MyFrame() {
        super("ScrollBar Demo ");
        r=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        b=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        g=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf=new TextField(20);
        tf.setBounds(50,50,300,50);
        r.setBounds(50,150,300,30);
        b.setBounds(50,200,300,30);
        g.setBounds(50,250,300,30);
        add(tf);
        add(r);
        add(b);
        add(g);
        setLayout(null);
        r.addAdjustmentListener(this);
        b.addAdjustmentListener(this);
        g.addAdjustmentListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent e){
        tf.setBackground(new Color(r.getValue(),b.getValue(),g.getValue()));
    }
}
public class ScrollbarDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,400);
        f.setVisible(true);
    }
}

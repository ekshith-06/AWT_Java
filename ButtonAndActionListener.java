import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Label l;
    Button b;
    int count;
    public MyFrame(){
        super("Button Demo");
        setLayout(new FlowLayout());
        l=new Label("    "+count);
        b=new Button("Click");
        b.addActionListener(this);
        add(l);
        add(b);

    }
    public void actionPerformed(ActionEvent e){
        count++;
        l.setText("    "+count);
    }
}
public class ButtonAndActionListener {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setVisible(true);
        f.setSize(400,200);
    }
}

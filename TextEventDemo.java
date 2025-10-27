import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements TextListener , ActionListener{
    Label l1,l2;
    TextField tf1;
    
    public MyFrame(){
        super("TextField Event Demo");
        setLayout(new FlowLayout());
        l1=new Label("No Text Is Enteres Yet");
        l2=new Label("Enter Key is Not hit yet");
        tf1=new TextField(20);
        //setEchoChar is used to replace each character with some given char 
        tf1.setEchoChar('*');
        
        tf1.addTextListener(this);
        tf1.addActionListener(this);
        add(l1);
        add(tf1);
        add(l2);
    }
    public void textValueChanged(TextEvent te){
        l1.setText(tf1.getText());
    }
    public void actionPerformed(ActionEvent e){
        l2.setText(tf1.getText());
    }
}

public class TextEventDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,400);
        f.setVisible(true);
    }
}

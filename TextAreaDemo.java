import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    Label l;
    TextArea ta;
    TextField tf;
    Button b;

    public MyFrame(){
        l=new Label("No Text Entered ");
        ta=new TextArea(20,30);
        tf=new TextField(20);
        b=new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(ta);
        add(tf);
        add(b);
    }
    public void actionPerformed(ActionEvent e){
        l.setText(ta.getSelectedText());
       // ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}
public class TextAreaDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,300);
        f.setVisible(true);
    }
}

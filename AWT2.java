import java.awt.*;
import java.util.concurrent.Flow;
class MyFrame extends Frame{
    Label l;
    Button b;
    TextField tf;
    public MyFrame(){
        super("My Second App");
        setLayout(new FlowLayout());
        l=new Label("Name ");
        tf=new TextField(30);
        b=new Button("Ok");
        add(l);
        add(tf);
        add(b);
    }
}
public class AWT2 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setVisible(true);
        f.setSize(400,400);
    }
}

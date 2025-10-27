
import java.awt.*;
public class AWT1{
public static void main(String []ar){
Frame f=new Frame("MY First APP");
f.setLayout(new FlowLayout());
Button b=new Button("OK");
Label l=new Label("Name ");
TextField tf=new TextField(42);
f.add(l);
f.add(tf);
f.add(b);
f.setSize(300,300);
f.setVisible(true);

}
}
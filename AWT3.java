import java.awt.*;
public class AWT3 extends Frame{
    Label l;
    Button b;
    TextField tf;
    public AWT3(){
        super("MY APP 3");
        setLayout(new FlowLayout());
        l=new Label("Name ");
        tf=new TextField(20);
        b=new Button("Ok");
        add(l);
        add(tf);
        add(b);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        AWT3 a=new AWT3();
    }
}

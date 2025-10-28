import java.awt.*;

class MyFrame extends Frame{
    MyFrame(){
        super("Painting");

    }
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(50, 100, 50, 50);

        g.setColor(Color.green);
        g.fillRect(50,200,50,50);

        g.setColor(Color.RED);
        g.fillRoundRect(50,300,50,75,50,50);

        g.setColor(Color.orange);
        g.fillArc(50,400,50,50,0,65);



    }
}
public class PaintDemo2 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}

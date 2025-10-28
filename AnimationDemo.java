import java.awt.*;
class MyFrame extends Frame implements Runnable{
    int x,y,tx,ty; // tx,ty are translantions x,y
    
    MyFrame(){
        super("Animation");
        x=100;y=100;
        tx=ty=1;
        Thread t=new Thread(this);
        t.start();
        
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);
    }

    public void run(){
        while(true){
        x+=tx;
        y+=ty;
        if(x<0 ||x>450) tx=tx*-1; // when the boundary exceeds this is the logic so  that the animation continues in the frame...
        if(y<20||y>400)ty*=-1;// when the boundary exceeds this is the logic so  that the animation continues in the frame...
        repaint();
        try{
            Thread.sleep(5);
        }
        catch(Exception e){}
        }

    }
}
public class AnimationDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,450);
        f.setVisible(true);
    }
}

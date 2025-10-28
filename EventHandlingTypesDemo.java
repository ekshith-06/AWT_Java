import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame { 
    TextField tf;
    Button b;
    int ct=0;
    MyFrame(){
        super("Demoo");
        setLayout(new FlowLayout());
        tf=new TextField(20);
        tf.setText(""+ct);
        b=new Button("Click");
        add(tf);
        add(b);
        // Method 4 is using lambaExpression as ActionListener is funtional interface like this
       /*  b.addActionListener((ActionEvent)->{
            ct++;
            tf.setText(""+ct);
        });*/


                // Method 3 is anonymous inner class like this 

/* 
        
         b.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
         ct++;
         tf.setText(""+ct);
         }
         });
        addWindowListener(new A());*/
    }

   
    public class A extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
         // Insted of this we can use the Above Lamba Expression as ActionListener is functional interface
         /*  // Method 1.
         // This is normal way of using listener and the frame class must implemnt actionlistener .
        public void actionPerformed(ActionEvent e){
        ct++;
        tf.setText(""+ct);
        }
        */

        // Method 2 is using inner class implementing action listener
       
        
}

public class EventHandlingTypesDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,300);
        f.setVisible(true);
    }
}

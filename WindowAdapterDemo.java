// Adapters the classes which implement Listener interfaces
// If we use Listener Interfaces the class must define all those methods present in the interface inorder to become concrete 
// But Adapter class implements Listener Interfaces , providing dummy i.e empty body implementaion of those methods
// So now the class extending this Adapter will be concrete and we can provide the defnition for only the methods we want to use ..


import java.awt.*;
import java.awt.event.*;





//Method 1 to use adapter class is by creating an independent class  to extend adapter classlike this..
/* 
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

class MyFrame extends Frame{
        MyFrame(){
        super("AdapterDemo")
            addWindowListener(new MyWindowAdapter());
        }
}
*/



//Method 2 to use adapter  class by creating an inner class to extend adapter class like this...
/* 
class MyFrame extends Frame{
public MyFrame(){
    super("Window Adapter Demo");
    addWindowListener(new MyWindowAdapter());
}
 
class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}

}
*/


// Method 2 using anonymous class for implementing required method in Adapter class ...
class MyFrame extends Frame{
    MyFrame(){
        super("Window Adapter Demo");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}



public class WindowAdapterDemo {
    public static void main(String []ar){
        MyFrame f =new MyFrame();
        f.setSize(400,500);
        f.setVisible(true);
    }
}

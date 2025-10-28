import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    Menu File,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;
    TextField tf;
    MyFrame(){
        super("Menu Demo");
        File=new Menu("File");
        sub=new Menu("Close");
        open =new MenuItem("Open");
        save =new MenuItem("Save");
        close =new MenuItem("Close");
        closeall=new MenuItem("CloseAll");
        auto=new CheckboxMenuItem("AutoSave");


        open.addActionListener((ActionEvent e)->tf.setText("Open"));
        save.addActionListener((ActionEvent e)->tf.setText("Save"));
        close.addActionListener((ActionEvent e)->tf.setText("Close"));
        closeall.addActionListener((ActionEvent e)->tf.setText("CloseAll"));

         auto.addItemListener((ItemEvent i)-> {
            if(auto.getState())tf.setText("AutoOn");
            else tf.setText("AutoOff");
         });

        sub.add(close);
        sub.add(closeall);
        File.add(open);
        File.add(save);
        File.add(sub);
        File.add(auto);

        MenuBar mb=new MenuBar();
        mb.add(File);
        setMenuBar(mb);

        tf=new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

    }
}
public class MenuDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,500);
        f.setVisible(true);
    }
}

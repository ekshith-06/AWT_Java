import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    public MyFrame(){
        super("CheckBox Demo");
        setLayout(new FlowLayout());
        l=new Label("Nothing Is Selected");
        c1=new Checkbox("Java");
        c2=new Checkbox("Python");
        c3=new Checkbox("C#");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        add(l);
        add(c1);
        add(c2);
        add(c3);
    }
    public void itemStateChanged(ItemEvent e){
        String str="";
        if(c1.getState())str+="  "+c1.getLabel();
        if(c2.getState())str+="  "+c2.getLabel();
        if(c3.getState())str+="  "+c3.getLabel();
        if(str.isEmpty())str="Nothing Is Selected";
        l.setText(str);
    }
}
public class CheckBoxDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,300);
        f.setVisible(true);
    }
}

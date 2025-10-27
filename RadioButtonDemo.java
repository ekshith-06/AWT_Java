import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg;
    public MyFrame(){
        super("CheckBox Demo");
        setLayout(new FlowLayout());
        cbg=new CheckboxGroup();
        l=new Label("Nothing Is Selected");
        c1=new Checkbox("Java",false,cbg);
        c2=new Checkbox("Python",false,cbg);
        c3=new Checkbox("C#",false,cbg);
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
public class RadioButtonDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,300);
        f.setVisible(true);
    }
}

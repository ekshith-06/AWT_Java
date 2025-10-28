import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements  ItemListener,ActionListener{
    List l;
    Choice c;
    TextArea ta;
    MyFrame(){
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(20,30);
        setLayout(new FlowLayout());
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");
        c.add("January");
        c.add("Feburary");
        c.add("March");
        l.addItemListener(this);
        l.addActionListener(this);
        c.addItemListener(this);
        add(l);
        add(c);
        add(ta);
    }
    public void itemStateChanged(ItemEvent ie){
        if(ie.getSource()==l)ta.setText(l.getSelectedItem());
        else ta.setText(c.getSelectedItem());
    }
    public void actionPerformed(ActionEvent e){
        String str[]=l.getSelectedItems();
        String s="";
        for(String c:str){
            s+=c+"\n";
            ta.setText(s);
        }
    }
}


public class ListBoxDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(300,400);
        f.setVisible(true);
    }
}

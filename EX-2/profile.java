import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class profile extends JFrame implements ActionListener,ItemListener
{
JLabel l1,l2,l3,l4,l5,l6,l7;
String sex,community,degree,report; 
JTextField t1;
JTextArea t2,t3;
JCheckBox c1,c2;
JRadioButton r1,r2,r3;
JComboBox cb1;
JButton submit;
//Constructor
public profile()
{
input();
actionListener();
}
//Function
public void input()
{
//Controls Creation
ImageIcon i1=new ImageIcon("div.jpeg");
l7=new JLabel();
l7.setIcon(i1);
l1=new JLabel("Name:");
t1=new JTextField(20);
l2=new JLabel("Sex");
c1=new JCheckBox("Male");
c2=new JCheckBox("Female");
l3=new JLabel("Community");
ButtonGroup bg=new ButtonGroup();
r1=new JRadioButton("OC");
r2=new JRadioButton("BC");
r3=new JRadioButton("MBC");
bg.add(r1);
bg.add(r2);
bg.add(r3);
l4=new JLabel("Degree");
cb1=new JComboBox();
cb1.addItem("B.Sc");
cb1.addItem("BCA");
cb1.addItem("B.E");
cb1.addItem("B.Tech");
cb1.addItem("M.Sc");
cb1.addItem("MCA");
cb1.addItem("M.E");
cb1.addItem("M.Tech");
l5=new JLabel("Address");
t2=new JTextArea(10,15);
l6=new JLabel("Report");
t3=new JTextArea(10,15);
submit=new JButton("Submit");
//Creating Panel-1
JPanel p1=new JPanel();
p1.add(l7);
p1.add(l1);
p1.add(t1);
//Creating Panel-2
JPanel p2=new JPanel();
p2.add(l2);
p2.add(c1);
p2.add(c2);
//Creating Panel-3
JPanel p3=new JPanel();
p3.add(l3);
p3.add(r1);
p3.add(r2);
p3.add(r3);
//Creating Panel-4
JPanel p4=new JPanel();
p4.add(l4);
p4.add(cb1);
p4.add(l5);
p4.add(t2);
//Creating Panel-5
JPanel p5=new JPanel();
p5.add(l6);
p5.add(t3);
p5.add(submit);
//Creating ContentPane
getContentPane().setLayout(new GridLayout(5,0));
getContentPane().add(p1);
getContentPane().add(p2);
getContentPane().add(p3);
getContentPane().add(p4);
getContentPane().add(p5);
}
public void actionListener()
{
submit.addActionListener(this);
c1.addItemListener(this);
c2.addItemListener(this);
r1.addItemListener(this);
r2.addItemListener(this);
r3.addItemListener(this);
cb1.addItemListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==submit)
{
report="Name:" + t1.getText();
report+="\nSex:" + sex;
report+="\nCommunity:" + community;
report+="\nDegree:" + degree;
report+="\nAddress:" + t2.getText();
t3.setText(report);
}
}
public void itemStateChanged(ItemEvent ie)
{
if(c1.getModel().isSelected())
{
sex="Male";
}
if(c2.getModel().isSelected())
{
sex="Female";
}
if(r1.getModel().isSelected())
{
community="OC";
}
if(r2.getModel().isSelected())
{
community="BC";
}
if(r3.getModel().isSelected())
{
community="MBC";
}
if(ie.getSource()==cb1)
{
degree=(String)cb1.getSelectedItem();
}
}
public static void main(String[] args)
{
profile pr=new profile();
pr.setSize(500,850);
pr.setVisible(true);
}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*<html>
<applet code="swgcon" height="500" width="500">
</applet>
</html>*/

public class swgcon extends JApplet implements ActionListener
{
JTextField t1,t2,t3;
JButton Addition,Subtraction,Multiplication,Division,clear;
ImageIcon ad,sub,mul,div;
public void init()
{
//textbox and button creation
JLabel l1=new JLabel("Enter the First value:");
t1=new JTextField(5);
JLabel l2=new JLabel("Enter the Second Value:");
t2=new JTextField(5);
JLabel l3=new JLabel("Answer:");
t3=new JTextField(5);
ad=new ImageIcon("add.png");
Addition=new JButton(ad);
sub=new ImageIcon("sub.png");
Subtraction=new JButton(sub);
mul=new ImageIcon("mul.jpg");
Multiplication=new JButton(mul);
div=new ImageIcon("div.jpeg");
Division=new JButton(div);
clear=new JButton("Clear");
//adding the content to the panel
JPanel p=new JPanel();
p.setLayout(new GridLayout(6,2));
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(l3);
p.add(t3);
p.add(Addition);
p.add(Subtraction);
p.add(Multiplication);
p.add(Division);
p.add(clear);
getContentPane().add(p);
//action listener
Addition.addActionListener(this);
Subtraction.addActionListener(this);
Multiplication.addActionListener(this);
Division.addActionListener(this);
clear.addActionListener(this);
}
//arithmetic operations
public void actionPerformed(ActionEvent ae)
{
double a=Double.parseDouble(t1.getText());
double b=Double.parseDouble(t2.getText());
if(ae.getSource()==Addition)
{
double result;
result=a+b;
t3.setText(""+result);
}
else if(ae.getSource()==Subtraction)
{
double result;
result=a-b;
t3.setText(""+result);
}
else if(ae.getSource()==Multiplication)
{
double result;
result=a*b;
t3.setText(""+result);
}
else if(ae.getSource()==Division)
{
double result;
result=a/b;
t3.setText(""+result);
}
else
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}
}

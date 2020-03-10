import java.rmi.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class samplermi extends JFrame implements ActionListener
{
//Object creation for Controls
JTextField input,output;
JButton convert;
double cels,fare;

//Constructor
public samplermi()
{
//Controls creation
JLabel l1=new JLabel("Enter the Input value:");
input=new JTextField(10);
JLabel l2=new JLabel("The Converted Value is:");
output=new JTextField(10);
convert=new JButton("Convert");

//Adding controls to the Panel
JPanel p1=new JPanel();
p1.add(l1);
p1.add(input);
p1.add(l2);
p1.add(output);
p1.add(convert);
getContentPane().setLayout(new GridLayout(3,2));
getContentPane().add(p1);

//Creating Listener to the Button
convert.addActionListener(this);
}

//Creating Event to the Button
public void actionPerformed(ActionEvent ae)
{
try
{
server_interface serinter=(server_interface)Naming.lookup("rmi://localhost/Conversion");
if(ae.getSource()==convert)
{
cels=Double.parseDouble(input.getText());
fare=serinter.Celsius_To_Farenheit(cels);
output.setText(String.valueOf(fare));
}
}
catch(Exception e)
{
//Catch Statements
}
}
public static void main(String[] args)throws Exception
{
samplermi serinter=new samplermi();
serinter.setSize(200,250);
serinter.setVisible(true);
}
}


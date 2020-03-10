import java.rmi.*;
import java.net.*;
import java.io.*;

public class console_client
{
public static void main(String[] args)throws Exception
{
server_interface serinter=(server_interface)Naming.lookup("rmi://localhost/Conversion");
System.out.println("Object Found...");
DataInputStream dis=new DataInputStream(System.in);
System.out.print("Enter the Celsius Value:");
double celsius=Double.parseDouble(dis.readLine());
System.out.println("Farenheit:"+serinter.Celsius_To_Farenheit(celsius));
System.out.print("Enter the Dollar Value:");
double dollar=Double.parseDouble(dis.readLine());
System.out.println("Indian Rupees:"+serinter.Dollar_To_Rupees(dollar));
System.out.print("Enter the Degree Value:");
double degree=Double.parseDouble(dis.readLine());
System.out.println("Radian"+serinter.Degree_To_Radian(degree));
}
}

import java.rmi.*;
import java.rmi.server.*;
import java.net.*;

public class server_implementation extends UnicastRemoteObject implements server_interface
{
public server_implementation() throws RemoteException
{
//super();
}
public double Celsius_To_Farenheit(double celsius)throws RemoteException
{
return (celsius*(9.0/5.0)+32);
}

public double Dollar_To_Rupees(double dollar)throws RemoteException
{
return (dollar*0.015);
}

public double Degree_To_Radian(double deg)throws RemoteException
{
return (deg*3.14/180);
}

public static void main(String[] args)throws Exception
{
server_implementation serinter=new server_implementation();
Naming.rebind("Conversion",serinter);
System.out.println("Server is ready to receive Client's Request");
}
}


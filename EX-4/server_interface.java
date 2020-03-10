import java.rmi.*;

public interface server_interface extends Remote
{
 double Celsius_To_Farenheit(double Celsius)throws RemoteException;
 double Dollar_To_Rupees(double Dollar)throws RemoteException;
 double Degree_To_Radian(double Degree)throws RemoteException;
}


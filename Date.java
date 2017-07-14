/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;
import java.util.*;
/**
 *
 * @author WELCOME
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int date1,date2,month1,month2,year1,year2,check=1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Input-1");
        System.out.print("Enter the Date:");
        date1=sc.nextInt();
        System.out.print("Enter the Month:");
        month1=sc.nextInt();
        System.out.print("Enter the Year:");;
        year1=sc.nextInt();
        
        System.out.println("Input-2");
        System.out.print("Enter the Date:");
        date2=sc.nextInt();
        System.out.print("Enter the Month:");
        month2=sc.nextInt();
        System.out.print("Enter the Year:");;
        year2=sc.nextInt();
        
        if((date1<0 || date1 >31)||(month1<0 || month1 >12)|| (year1==0))
        {
            System.out.println("Please enter a valid Date..");
            check=0;
        }
        else
        {
        switch (month1)
            {
                case 2:
                    if(date1<0 || date1>28)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 4:
                    if(date1<0 || date1>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 6:
                    if(date1<0 || date1>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 9:
                    if(date1<0 || date1>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 11:
                    if(date1<0 || date1>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;    
            }
        }
        
        if((date2<0 || date2 >31)||(month2<0 || month2 >12)|| (year2==0))
        {
            System.out.println("Please enter a valid Date..");
            check=0;
        }
        else 
        {
            switch (month2)
            {
                case 2:
                    if(date2<0 || date2>28)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 4:
                    if(date2<0 || date2>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 6:
                    if(date2<0 || date2>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 09:
                    if(date2<0 || date2>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;
                    
                case 11:
                    if(date2<0 || date2>30)
                    {
                        System.out.println("Please enter a valid Date..");
                        check=0;
                    }
                    break;    
            }
        }
        if(check==1)
        {
            if((date1>date2) && (month1>month2) && (year1>year2))
            {
                System.out.println("Latest Date is:");
                System.out.println(date1+"-"+month1+"-"+year1);
            }
            else
            {
                System.out.println("Latest Date is:");
                System.out.println(date2+"-"+month2+"-"+year2);
            }
        }
    }
}

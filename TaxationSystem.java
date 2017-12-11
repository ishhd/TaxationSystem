package taxationsystem;
import java.util.*;
public class TaxationSystem {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("||*************************************************||");
        System.out.println("        Welcome to Taxation System ");
        System.out.println("||*************************************************||");
        System.out.println("Please select the correct choice ");
        System.out.println(" 1.America\n 2.Australia");
        System.out.print("Please Enter the choice ");
        int choice1=input.nextInt();
        switch(choice1){
            case 1:{ 
        System.out.println("------------------------");
        System.out.print("Enter; Taxpayer Identification Number(ITIN): ");
        int ID = input.nextInt();
        String id = ID+"";
         
        char s1 = id.charAt(3);
        char s2 = id.charAt(4);
        String s3 = ""+s1+s2;
        int s =Integer.parseInt(s3);
        if (id.length()!=9){
            System.out.println(" ");
            System.out.println("There must be 9 numbers.");
            System.out.println("Try Again");
            System.out.println("----------------------------------------------");
            System.out.println("Thanks for Using Taxation System");
            System.exit(0);
        }        
        else if ((ID/100000000)!=9){ 
            System.out.println(" ");
            System.out.println("Number must begin with 9.");
            System.out.println("Try Again");
            System.out.println("------------------------");
            System.out.println("Thanks for Using Taxation System");
            System.exit(0);
        }
        else if (!(s>=70&&s<=88||s>=90&&s<=92||s>=94&&s<=99)){
            System.out.println(" ");
            System.out.println("Incorrect Format , please check the number .");
            System.out.println("Try Again");
            System.out.println("------------------------");
            System.out.println("Thanks for Using Taxation System");
            System.exit(0);
        }
        System.out.print("Enter your Full Name: ");
        String name = scan.nextLine();
        String name1=((name.substring(0, 2)).toUpperCase());
        System.out.println("Welcome your ID is "+name1+id);
        
        System.out.print("Please,Enter your yearly Salary in 0.0 Format : ");
         double salary = input.nextDouble();
         double tax=1;
         if (salary>=0&&salary<=8700)
             tax = salary*0.1;
         else if (salary>=8701&&salary<=35350)
             tax = salary*0.15;
         else if (salary>=35351&&salary<=85650)
             tax = salary*0.25;
         else if (salary>=85651&&salary<=178650)
             tax = salary*0.28;
         else if (salary>=178651&&salary<=388350)
             tax = salary*0.33;
         else
             tax = salary*0.35;
         System.out.println("Dear Citizen !!Your Taxpayable amount is "+(int)(tax*100.0)/100.0+"$");
         System.out.println("Thanks for Using Taxation System!!");
         break;  
            }
            case 2:{
                System.out.println("------------------------");
                System.out.print("Enter; TaxFile Number ");
                int ID = input.nextInt();
                String id = ID+"";
            if (id.length()!=9){
            System.out.println(" ");
            System.out.println("There must be 9 numbers.");
            System.out.println("Try Again");
            System.out.println("----------------------------------------------");
            System.out.println("Thanks for Using Taxation System");
            System.exit(0);}
            System.out.print("Enter your Full Name: ");
            String name = scan.nextLine();
            String name1=((name.substring(0, 2)).toUpperCase());
            System.out.println("Welcome your ID is "+name1+"-"+id);
            
            System.out.print("Please,Enter your Salary: ");
                    double salary = input.nextDouble();
                    double tax=1;
         if (salary>=0&&salary<=6000)
             tax = salary;
         else if (salary>=6001&&salary<=37000)
             tax = salary*0.15;
         else if (salary>=37001&&salary<=80000)
             tax = salary*0.30;
         else if (salary>=80001&&salary<=180000)
             tax = salary*0.37;
         else 
             tax = salary*0.45;
         
         System.out.println("Dear Citizen !!Your Taxpayable amount is "+(int)(tax*100.0)/100.0+"$");
         System.out.println("Thanks for Using Taxation System!!");
            break;
            }
            
            default : {
                System.out.println("It should be Either 1 or 2 :"); 
                System.out.println("Try Again");
                System.out.println("----------------------------------------------");
                System.out.println("Thanks for Using Taxation System!!");
                System.exit(0);
            }   
            
            
       
        
        }
            
    
        
        
        
        
        
        
        
        
        
        
        
    } 
}

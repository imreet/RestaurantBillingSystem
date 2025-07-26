import java.util.*;
public class Restaurant_Management {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d,vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvfd,tnvfd=0,fd,tfd=0,amt=0,tamt=0,tamt1=0,tamt2=0,totald=0,damt=0,ch;
        double gst=0,tot,gtotal;
        String str="",choice,choice1="Y";
        System.out.println("Welcome to the Multi Cuisine Restaurant!!!");
        System.out.println("1: Starter Corner");
        System.out.println("2: Main Course");
        System.out.println("3: Dessert Corner");
        System.out.println();
        while(choice1.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter Your Choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Welcome To Starter Menu!!!");
                    System.out.println("Enter VS for Veg Starter and NVS for Non-Veg Starter");
                    str=sc.next();
                    if(str.equalsIgnoreCase("VS"))
                    {
                        System.out.println("Starters\t\t\tPrice in Rs.");
                        System.out.println("1.Paneer Tikka\t\t\t\t110");
                        System.out.println("2.Veg Seekh Kabab\t\t\t110");
                        System.out.println("3.Hara Bhara Kabab\t\t\t110");
                        System.out.println("4.Shanghai Spring Roll\t\t150");
                        System.out.println("5.American Corn Ball\t\t\t\t150");
                        System.out.println("6.Crispy American Corn\t\t\t\t140");
                        System.out.println("7.Crispy Baby Corn\t\t\t140");
                        System.out.println("8.Crispy Mushroom\t\t\t120");
                        System.out.println("9.Crispy Chilly Potato\t\t\t120");
                        System.out.println("10.Crispy Chilly Chana\t\t\t150");
                        System.out.println();
                        choice="Y";
                        while(choice.equalsIgnoreCase("Y")) {
                            System.out.println("Choose the veg starter by entering number: ");
                            vstr = sc.nextInt();
                            System.out.println("Enter the quantity:");
                            tvstr = sc.nextInt();
                            if (vstr >= 1 && vstr <= 3)
                                amt = tvstr * 100;
                            if (vstr == 4 || vstr == 5 || vstr == 10)
                                amt = tvstr * 150;
                            if (vstr == 6 || vstr == 7)
                                amt = tvstr * 140;
                            if (vstr == 8 || vstr == 9)
                                amt = tvstr * 120;
                            tamt = tamt + amt;
                            System.out.println("Do you wnat to place more order? Enter Y/N");
                            choice = sc.next();
                        }
                    }
                    if(str.equalsIgnoreCase("NVS")) {
                        System.out.println("Non-Veg Starters\t\t\tPrice in Rs.");
                        System.out.println("1.Chicken Tikka\t\t\t170");
                        System.out.println("2.Murg Reshmi Kabab\t\t\t170");
                        System.out.println("3.Murg Chilli Kabab\t\t\t160");
                        System.out.println("4.Chicken Seekh Kabab\t\t\t180");
                        System.out.println("5.Tangdi Kabab\t\t\t180");
                        System.out.println("6.Murg Tandori\t\t\t190");
                        System.out.println("7.Fish Ajwani Tikka\t\t\t190");
                        System.out.println("8.Chilli Chicken\t\t\t160");
                        System.out.println("9.Drums of Heaven\t\t\t180");
                        System.out.println("10.Shanghai Chicken\t\t\t180");
                        choice = "Y";
                        while (choice.equalsIgnoreCase("Y")) {
                            System.out.println("Choose the non-veg starter by entering number:");
                            nvstr = sc.nextInt();
                            System.out.println("Enter the quantity:");
                            tnvstr = sc.nextInt();
                            if (nvstr == 1 || nvstr == 2)
                                amt = tnvstr * 170;
                            if (nvstr == 3 || nvstr == 8)
                                amt = tnvstr * 160;
                            if (nvstr == 4 || nvstr == 5 || nvstr == 9 || nvstr == 10)
                                amt = tnvstr * 180;
                            if (nvstr == 6 || nvstr == 7)
                                amt = tnvstr * 190;
                            tamt = tamt + amt;
                            System.out.println("Do you want to place more order? Enter Y/N");
                            choice = sc.next();
                        }
                    }
                break;
                case 2:
                    System.out.println("Main Course: Indian and Chinese Dishes!!");
                    System.out.println("Enter 'V' for Indian Veg Dishes, 'NV' for Indian Non-Veg Dishes and 'C' for Chines Dishes");
                    str=sc.next();
                        if(str.equalsIgnoreCase("V"))
                        {
                                System.out.println("Welcome to Indian Veg Dishes!!!");
                                System.out.println("Indian Veg Dishes\t\t\tPrice in Rs.");
                                System.out.println("1.Shahi Paneer\t\t\t180");
                                System.out.println("2.Navratan Korma\t\t\t180");
                                System.out.println("3.Kadhai Paneer\t\t\t150");
                                System.out.println("4.Malai Kofta\t\t\t140");
                                System.out.println("5.Kadhai Vegetable\t\t\t140");
                                System.out.println("6.Vegetable Pakeeza\t\t\t140");
                                System.out.println("7.Shabnam Curry\t\t\t150");
                                System.out.println("8.Makai Corn Palak\t\t\t150");
                                System.out.println("9.Veg Pulao\t\t\t110");
                                System.out.println("10.Kashmiri Pulao\t\t\t140");
                                System.out.println("11.Butter Naan\t\t\t40");
                                System.out.println("12.Stuffed Kuchla\t\t\t60");
                                choice="Y";
                                while(choice.equalsIgnoreCase("Y"))
                                {
                                    System.out.println("Choose the order by entering number: ");
                                    vfd=sc.nextInt();
                                    System.out.println("Enter the quantity");
                                    tvfd=sc.nextInt();
                                    if(vfd==1||vfd==2)
                                        amt=tvfd*180;
                                    if(vfd==3||vfd==7||vfd==8)
                                        amt=tvfd*150;
                                    if(vfd==4||vfd==5||vfd==6||vfd==10)
                                        amt=tvfd*140;
                                    if(vfd==9)
                                        amt=tvfd*110;
                                    if(vfd==11)
                                        amt=tvfd*40;
                                    if(vfd==12)
                                        amt=tvfd*60;
                                    tamt1=tamt1+amt;
                                    System.out.println("Do you want to place more order? Enter Y/N");
                                    choice=sc.next();
                                }
                            }
                            if(str.equalsIgnoreCase("NV"))
                            {
                                System.out.println("Welcome to Indian Non-Veg Dishes!!");
                                System.out.println("Indian Non-Veg Dishes\t\t\tPrice in Rs.");
                                System.out.println("1.Chicken Tikka Masala\t\t\t180");
                                System.out.println("2.Chicken Tikka Labadar\t\t\t180");
                                System.out.println("3.Chicken Bharta\t\t\t150");
                                System.out.println("4.Kadhai Chicken\t\t\t160");
                                System.out.println("5.Mughlai Chicken\t\t\t160");
                                System.out.println("6.Murg Navratan Korma\t\t\t160");
                                System.out.println("7.Chicken Do Pyaza\t\t\t170");
                                System.out.println("8.Murg Masallam\t\t\t170");
                                System.out.println("9.Mutton Rogan Josh\t\t\t190");
                                System.out.println("10.Prawn Malai Curry\t\t\t190");
                                System.out.println("11.Fish Sarsowala\t\t\t140");
                                System.out.println("12.Fish Dhaniawala\t\t\t160");
                                choice="Y";
                                while(choice.equalsIgnoreCase("Y"))
                                {
                                    System.out.println("Choose the order by entering number:");
                                    vfd=sc.nextInt();
                                    System.out.println("Enter the quantity");
                                    tvfd=sc.nextInt();
                                    if(vfd==1||vfd==2)
                                        amt=tvfd*180;
                                    if(vfd==3)
                                        amt=tvfd*150;
                                    if(vfd==4||vfd==5||vfd==6||vfd==12)
                                        amt=tvfd*160;
                                    if(vfd==7||vfd==8)
                                        amt=tvfd*170;
                                    if(vfd==9||vfd==10)
                                        amt=tvfd*190;
                                    if(vfd==11)
                                        amt=tvfd*140;
                                    tamt1=tamt1+amt;
                                    System.out.println("Do you want to place more order? Enter Y/N");
                                    choice=sc.next();
                                }
                            }
                            if(str.equalsIgnoreCase("C"))
                            {
                                System.out.println("Welcome to Chinese Dishes!!");
                                System.out.println("Chinese Dishes\t\t\tPrice in Rs.");
                                System.out.println("1.Schezwan Fried Rice\t\t\t240");
                                System.out.println("2.Schewan Chicken\t\t\t280");
                                System.out.println("3.Chilly Chicken\t\t\t280");
                                System.out.println("4.Chicken Noodle\t\t\t210");
                                System.out.println("5.Veg Hakka Noodle\t\t\t210");
                                System.out.println("6.Chicken Manchurian\t\t\t190");
                                System.out.println("7.Paneer Manchurian\t\t\t190");
                                System.out.println("8.Chilly Paneer\t\t\t190");
                                System.out.println("9.Sanghai Fried Rice\t\t\t240");
                                System.out.println("10.Veg Fried Rice\t\t\t210");
                                System.out.println("11.Chicken Fried Rice\t\t\t210");
                                System.out.println("12.Kimchi Rice Veg\t\t\t210");
                                choice="Y";
                                while(choice.equalsIgnoreCase("Y"))
                                {
                                    System.out.println("Choose the order by entering number:");
                                    fd=sc.nextInt();
                                    System.out.println("Enter the quantity:");
                                    tfd=sc.nextInt();
                                    if(fd==1||fd==9)
                                        amt=tfd*240;
                                    if(fd==2||fd==3)
                                        amt=tfd*280;
                                    if(fd==4||fd==5||fd==10||fd==11||fd==12)
                                        amt=tfd*210;
                                    if(fd==6||fd==7||fd==8)
                                        amt=tfd*190;
                                    tamt1=tamt1+amt;
                                    System.out.println("Do you want to place more order? Enter Y/N");
                                    choice=sc.next();
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Welcome to Desert Corner!!");
                            System.out.println("Desert\t\t\tPrice in Rs.");
                            System.out.println("1.Softy Pineapple\t\t\t110");
                            System.out.println("2.Softy Crunchy\t\t\t110");
                            System.out.println("3.Chocolate Walnut Brownie\t\t\t90");
                            System.out.println("4.Chocolate Doughnut\t\t\t90");
                            System.out.println("5.Marble Cake\t\t\t70");
                            System.out.println("6.Mocha Magic\t\t\t90");
                            System.out.println("7.Black Forest\t\t\t90");
                            System.out.println("8.Mango Shake\t\t\t80");
                            System.out.println("9.Pineapple Shake\t\t\t80");
                            System.out.println("10.Tooty Fruity\t\t\t120");
                            choice="Y";
                            while(choice.equalsIgnoreCase("Y"))
                            {
                                System.out.println("Choose the desert by entering number:");
                                d=sc.nextInt();
                                System.out.println("Enter the quantity");
                                totald=sc.nextInt();
                                if(d==1||d==2)
                                    damt=totald*110;
                                if(d==3||d==4||d==6||d==7)
                                    damt=totald*90;
                                if(d==5)
                                    damt=totald*70;
                                if(d==8||d==9)
                                    damt=totald*80;
                                if(d==10)
                                    damt=totald*120;
                                tamt2=tamt2+damt;
                                System.out.println("Do you want to place more order? Enter Y/N");
                                choice=sc.next();
                            }
                            break;
                        default:
                            System.out.println("You have entered wrong choice!!");
                    }
                    System.out.println("Enter 'Y' to go to 'Main Menu' and 'N' to print the 'Bill':");
                    choice1=sc.next();
            }
            System.out.println("********Multi Cuisine Restaurant********");
            System.out.println("****************Starter*****************");
            System.out.println("Total Cost of Starter= Rs."+tamt);
            System.out.println("**************Main Course***************");
            System.out.println("Total Cost of Main Course= Rs."+tamt1);
            System.out.println("****************Desserts****************");
            System.out.println("Total Cost of Desserts= Rs."+tamt2);
            tot=tamt+tamt1+tamt2;
            gst=tot*5.0/100.0;
            System.out.println("GST =Rs."+gst);
            gtotal=tot+gst;
            System.out.println("Amount to be paid Rs."+gtotal);
            System.out.println("Thanks for visiting Multi Cuisine Restaurant!!");
            System.out.println("Your Pleasure Our Comfort");
            System.out.println("Visit Again");
            System.out.println("Program Ends");
    }
}
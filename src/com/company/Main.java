// package com.company;

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

class HOtel_Mangement_system{
    static void Login(){
        Scanner scanner_for_admin = new Scanner(System.in);
        Collection_of_Admin();
        System.out.println("\t\t\t\t******Login Here******");
        System.out.println("Enter Name :");
        String username = scanner_for_admin.nextLine();
        System.out.println("Enter Password : ");
        String password = scanner_for_admin.nextLine();

        if(username.equals(Administration.getUser_name()) || password.equals(Administration.getPassword())){
            System.out.println("Succcesfull!!!!");
        }
        else{
            System.out.println("Wroung Passowrd");
            Login();
        }

    }

    static void Collection_of_Admin(){
         ArrayList<Administration> Array_of_admin = new ArrayList<Administration>(3);
         Array_of_admin.add(new Administration("jaffar","123"));
         Array_of_admin.add(new Administration("ahmed","123"));
         Array_of_admin.add(new Administration("hasan","123"));
         //Administration.Admin_Collection_in_FIle();
    }
}


class Administration{
    private static String user_name;
    private static String password;

    public static void setUser_name(String user_name) {
        Administration.user_name = user_name;
    }


    public static String getUser_name() {
        return user_name;
    }

    public static void setPassword(String password) {
        Administration.password = password;
    }

    public static String getPassword() {
        return password;
    }

    public Administration(String username, String password){
          setUser_name(username);
          setPassword(password);
    }

    static void Admin_Collection_in_FIle(){
        try {
            String filename = "C:\\Users\\gamap\\OneDrive\\Documents\\GitHub\\Hotel_Mangement_System_In_Java\\src\\com\\company\\Files\\Admins.txt";
            File file = new File(filename);
            if(file.createNewFile()){
                System.out.println("File created");
            }

            //insertion admin
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));

            writer.write("\n"+getUser_name()+"  \t\t"+getPassword()+"\n");

            writer.close();
        }
        catch (IOException e){
            System.out.println("Error : "+e);
        }
    }
}


class Hotel_Records extends Administration{
    public Hotel_Records(){
        super(Administration.getUser_name(),Administration.getPassword());
    }

    public void Hotel_system(){
        System.out.println("Choose your desire : \n1)Customer Record\n2)Update Record\n3)Room Occupied\n");
        Scanner scanner_for_Hotel_System = new Scanner(System.in);

        short slecter_for_scanner = scanner_for_Hotel_System.nextShort();

        switch (slecter_for_scanner){
            case '1':
                //
                break;
            case '2':
                //
                break;
            case '3':
                //
                break;
            default:
                //
                break;
        }
    }
}
class Cutomers_Record extends Hotel_Records{
     public void Set_Cutomers_Record(){

     }
}
class Update_Record  extends Hotel_Records{

}
class Room_Occupied  extends Hotel_Records{

}
public class Main {

    public static void main(String[] args) {
	HOtel_Mangement_system obj = new HOtel_Mangement_system();
	HOtel_Mangement_system.Login();
    }
}

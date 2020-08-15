package com.revature;

import java.util.Scanner;

public class InputHandler {
    //all in one source for inputs
    //to help minimize those wonky scanner errors
    //thought about using generics somehow, but these are primitives, and are therefore sinful and unclean

    //using a singleton class because i got my tryhard pants on
    private static Scanner scanner = new Scanner(System.in);

    private static InputHandler onlyInstance; //lazy singleton (not premade)

    private InputHandler(){ //constructor is private, so other methods can't lay their dirty java hands on it
        super();
        System.out.println("[LOG] - InputHandler instanced.");
    }

    public static InputHandler getInstance(){//must be static since method isn't used in created object
        if(onlyInstance == null){
            onlyInstance = new InputHandler();
        }//this checks if instance was made, and if not, makes it
        return onlyInstance;
    }

    @Override //override clone so it can't be cloned. only COWARDS clone singleton patterned objects
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    public boolean yesOrNo(){
        boolean confirm = false;
        try{
            System.out.print("Yes or No: ");
            String str = scanner.nextLine().toLowerCase();
            if(str.equals("true") || str.equals("yes")){
                confirm = true;
            } else {
                System.out.println("Gonna take that as a 'no'.");
                //confirm = false; //redundant
            }
        } catch(Exception e){
            System.out.println("No.");
            e.printStackTrace();
            yesOrNo(); //trying to allow a do-over, will need todo figure it out when i get time
        }
        return confirm;
    }
    public String strInput(){
        String str = "Default input error string.";
        try {
            System.out.print("Enter string: ");
            if (scanner.hasNext()) {
                str = scanner.nextLine();
            }
        } catch (Exception e){
            System.out.println("No.");
            e.printStackTrace();
            strInput();
        }
        return str;
    }
    public int intInput(){
        int i = 0;
        try{
            System.out.print("Enter int: ");
            i = Integer.parseInt(scanner.nextLine());
            return i;
        } catch(Exception e){
            System.out.println("No.");
            e.printStackTrace();
            intInput();
        }
        return 0;
    }

    public float floatInput(){
        float f = 0;
        try{
            System.out.print("Enter float: ");
            f = Float.parseFloat(scanner.nextLine());
        } catch(Exception e){
            System.out.println("No.");
            e.printStackTrace();
            floatInput();
        }
        return f;
    }

    public double doubleInput(){
        double d = 0.0;
        try{
            System.out.print("Enter double: ");
            d = Double.parseDouble(scanner.nextLine());
        }catch(Exception e){
            System.out.println("No.");
            e.printStackTrace();
            doubleInput();
        }
        return d;
    }

    public int[] intArrayInput(){
        int[] array;
        try{
            System.out.print("Enter array size: ");
            int size = -1;
            while(size < 0 || size > 1000){
                size = Integer.parseInt(scanner.nextLine());
            }
            array = new int[size];
            for(int i = 0; i < size; i++){
                System.out.print("Enter int element "+i+" : ");
                array[i] = Integer.parseInt(scanner.nextLine());
            }
            return array;
        }catch(Exception e){
            System.out.println("No.");
            e.printStackTrace();
            intArrayInput();
            return null;
        }

    }

    public String[] strArrayInput(){
        String[] array;
        try{
            System.out.print("Enter array size: ");
            int size = -1;
            while(size < 0 || size > 1000){
                size = Integer.parseInt(scanner.nextLine());
            }
            array = new String[size];
            for(int i = 0; i < size; i++){
                System.out.print("Enter String element "+i+" : ");
                array[i] = scanner.nextLine();
            }
            return array;
        }catch(Exception e){
            System.out.println("No.");
            e.printStackTrace();
            strArrayInput();
            return null;
        }
    }

    public static void endScanning(){
        scanner.close(); //even the all the stars in the night sky eventually die out
    }

}

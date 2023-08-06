import  java.util.Scanner;

class boiling {
    public static void main(String[] args) {
        System.out.println("What is the temperature of the water?");
Scanner sc = new Scanner(System.in);
double temperature = sc.nextDouble();
boolean boiling;
        if (temperature>=100)
        {boiling=true;}
        else {boiling=false;}
        if (boiling==true)
        {
        System.out.println("Boiling");
        } else {
        	System.out.println("Not Boiling");
        }
    }
}
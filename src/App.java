import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        boolean loop=true;
        boolean veg=true;
        System.out.println("--------Deen Pizza Hub--------");
        while (loop) {
            System.out.println("\n1. Order Pizza\n2. Complaint\n3. Exit\nEnter Number:");
            String choice1=input.next();
            switch(choice1){
                case "1":
                    System.out.println("Order Pizza:\n---------------\n1.Regular Pizza\n2. Deulux Pizza\n3. Back\nEnter value:");
                    String choice2=input.next();
                    switch (choice2) {
                        case "1":
                            System.out.println("Regular Pizza:\n---------------\n1. Veg Pizza\n2.Non-veg Pizza\n3.Back\nEnter Number:");
                            String choice3=input.next();
                            switch (choice3) {
                                case "1":
                                    veg=true;
                                    break;
                                case "2":
                                    veg=false;
                                    break;
                                case "3":
                                    System.out.println("Exiting....");
                                    loop=false;
                                    continue;
                                default:
                                    System.out.println("Enter Correct Input.");
                                    loop=false;
                                    break;
                            }
                            Pizza p1=new Pizza(veg);
                            System.out.println("Do you want to add Extra Cheese?y/n:");
                            String choice4=input.next();
                            switch(choice4){
                                case "y":
                                    p1.addExtraCheese();
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("Do you want to add Extra Toppings?y/n:");
                            String choice7=input.next();
                            switch(choice7){
                                case "y":
                                    p1.addExtraToppings();
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("Do you want your food to take away?y/n:");
                            String choice8=input.next();
                            switch(choice8){
                                case "y":
                                    p1.takeAway();
                                    break;
                                default:
                                    break;
                            }
                            System.out.println(" +----------------------+\n |        Bill          |\n +----------------------+");
                            System.out.println(p1.billGenerate());    
                            break;
                        case "2":
                            System.out.println("\nOrder Pizza:\n---------------\n1. Veg Pizza\n2.Non-veg Pizza\n3.Back\nEnter Number:");
                            String choice5=input.next();
                            switch (choice5) {
                                case "1":
                                    veg=true;
                                    break;
                                case "2":
                                    veg=false;
                                    break;
                                case "3":
                                    System.out.println("Exiting...");
                                    loop=false;
                                    continue;
                                default:
                                    System.out.println("Enter Correct Input.");
                                    break;
                            }
                            DeluxPizza d1=new DeluxPizza(veg);
                            System.out.println("Do you want your food to take away?y/n:");
                            String choice9=input.next();
                            switch(choice9){
                                case "y":
                                    d1.takeAway();
                                    break;
                                default:
                                    break;
                            }    
                            System.out.println(" +----------------------+\n |        Bill          |\n +--------------------=-+");
                            System.out.println(d1.billGenerate()); 
                            break;
                        case "3":
                            System.out.println("Exiting....");
                            break;
                        default:
                            System.out.println("Enter correct value....");
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Complain:\n--------------\n1. Raise Complaint\n2. Back\nEnter value: ");
                    String choice6 =input.next();
                    switch(choice6) {
                        case "1":
                            System.out.println("Type your complain:");
                            input.nextLine();
                            String complaint=input.nextLine();
                            System.out.println("Thanks for your complaint.....");
                            loop=false;
                            break;
                        case "2":
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Enter correct value...");
                            break;
                    }
                    break;
                case "3":
                    loop=false;
                    System.out.println("Thank you\n-----------------");
                    break;
                default:
                    System.out.println("Enter Correct value: ");
                    break;
            }
        }
        input.close();
    }
}

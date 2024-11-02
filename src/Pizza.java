public class Pizza {
    int price;
    boolean vegCheck;
    int extraCheesPrice=100;
    int extraToppingPrice=150;
    int backPack=20;
    String bill="";
    int basePrice=300;
    boolean isExtraCheeseAdded=false;
    boolean isExtraToppingsAdded=false;
    boolean isTakeAwayAdded=false;
    public Pizza(boolean veg){
        if(veg){
            vegCheck=true;
            this.price=basePrice;
        }
        else{
            vegCheck=false;
            this.price=400;
        }
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        //System.out.println("Extra Cheese Added.");
        this.price+=extraCheesPrice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        //System.out.println("Extra Toppings Added.");
        this.price+=extraToppingPrice;
    }
    public void takeAway(){
        isTakeAwayAdded=true;
        //System.out.println("Packing Charges Added.");
        this.price+=backPack;
    }
    public String billGenerate(){
        if(vegCheck){
            bill+=(" | Base pizza: "+basePrice+"      |");
        }
        if(vegCheck==false){
            bill+=(" | Base pizza: "+(basePrice+100)+"      |");
        }
        if(isExtraCheeseAdded){
            bill+="\n | Extra Cheese: "+extraCheesPrice+"    |";
        } 
        if(isExtraToppingsAdded){
            bill+="\n | Extra Toppings: "+extraToppingPrice+"  |";
        }
        if(isTakeAwayAdded){
            bill+="\n | Packing Charges: "+backPack+"  |";
        }
        bill+="\n +----------------------+\n | Total bill: "+this.price;
        bill+="      |\n +----------------------+";
        return bill;
    }
}

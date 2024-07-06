public class DeluxPizza extends Pizza{

    int dprice=550;
    public DeluxPizza(boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
    @Override
    public String billGenerate(){
        if(vegCheck){
            super.bill += "Base pizza: "+dprice;
        }
        if(vegCheck==false){
            super.bill += "Base pizza: "+(dprice+100);
        }
        if(isTakeAwayAdded){
            super.bill+="\nPacking Charges: "+backPack;
        }
        super.bill+="\n------------------------------\nTotal bill: "+super.price;
        return super.bill;
    }
    
}

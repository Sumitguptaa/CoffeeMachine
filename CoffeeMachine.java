import java.util.Scanner;

class CoffeeMachine{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        Function f = new Function();
                
       while (true){
            System.out.println("Write action (1 - buy, 2 - fill, 3 - take, 4 - remaining, 5 - exit):");
            System.out.println(">");
            int action = sc.nextInt();
            
            switch(action){
                case 1:
                    f.buy();
                    break;
                case 2:
                    f.fill();
                    break;
                case 3:
                    System.out.println("I gave you $" + f.money);
                    f.money = 0;
                    break;
                case 4:
                    f.machineDetail();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
       }
    }
}

class Function{
    protected int water = 1500;
    protected int milk = 2040;
    protected int beans = 620;
    protected int cups = 50;
    protected int money = 550;
    Scanner sc = new Scanner(System.in);
    protected void machineDetail(){
        System.out.println("The coffee machine has");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " grams of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
    protected void buy(){
        System.out.println("What do you want to buy? 1 - espresso($4), 2 - latte($7), 3 - cappuccino($6), 4 - to main menu:");
        System.out.print(">");
        int type = sc.nextInt();
        switch(type){
            case 1:
                if(water < 250 ){
                    System.out.println("Sorry not enough water!");
                    break;
                } else if (beans < 16){
                    System.out.println("Sorry not enough beans!");
                    break;
                } else if (cups < 1) {
                    System.out.println("Sorry not enough cups!");
                    break;
                }
                water -= 250;
                beans -= 16;
                money += 4;
                cups--;
                System.out.println("Please take your Espresso");
                break;
            case 2:
                if(water < 350 ){
                    System.out.println("Sorry not enough water!");
                    break;
                } else if (beans < 20){
                    System.out.println("Sorry not enough beans!");
                    break;
                } else if (milk < 75) {
                     System.out.println("Sorry not enough milk!");
                     break;
                } else if (cups < 1) {
                    System.out.println("Sorry not enough cups!");
                    break;
                }
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
                cups--;
                System.out.println("Please take your Latte");
                break;
            case 3:
                if(water < 200 ){
                    System.out.println("Sorry not enough water!");
                    break;
                } else if (beans < 12){
                    System.out.println("Sorry not enough beans!");
                    break;
                } else if (milk < 100) {
                     System.out.println("Sorry not enough milk!");
                     break;
                } else if (cups < 1) {
                    System.out.println("Sorry not enough cups!");
                    break;
                }
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                cups--;
                System.out.println("Please take your Cappuccino");
                break;
            case 4:
                break;
        }
    }
    protected void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        System.out.print(">");
        int w = sc.nextInt();
        if(w<0){
            System.out.println("You can not subtract water");
        } else {
            water += w;
        }
        
        System.out.println("Write how many ml of milk do you want to add: ");
        System.out.print(">");
        int m = sc.nextInt();
        if(m<0){
            System.out.println("You can not subtract milk");
        } else {
            milk += m;
        }
        
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        System.out.print(">");
        int c = sc.nextInt();
        if(c<0){
            System.out.println("You can not subtract coffe");
        } else {
            beans += c;
        }
        
        
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        System.out.print(">");
        int d = sc.nextInt();
        if(d<0){
            System.out.println("You can not subtract cups");
        } else {
            cups += d;
        }
        
    }
}

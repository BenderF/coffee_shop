package Controller;
import Additionals.*;
import CoffeeTypes.*;
import java.util.Scanner;

public class DrinkFactory {
    private int op;
    private double totalPrice;
    private double drinkPrice;
    private int validator = 1;

    //Switch case to select the drink type
    public void selectDrink(int op) {
        switch (op) {
            case 0:
                break;
            case 1:
                Drink coffee = new Coffee();
                drinkPrice = coffee.getPrice();
                break;
            case 2:
                Drink milkCoffee = new MilkCoffee();
                drinkPrice = milkCoffee.getPrice();
                break;
            case 3:
                Drink milkChocolate = new MilkChocolate();
                drinkPrice = milkChocolate.getPrice();
                break;
            case 4:
                Drink mocha = new Mocha();
                drinkPrice = mocha.getPrice();
                break;
            case 5:
                Drink espressoConPanna = new EspressoConPanna();
                drinkPrice = espressoConPanna.getPrice();
                break;
        }
    }

    //Switch case to select the cup serving size
    public void selectSize(int op) {
        switch (op) {
            case 1:
                totalPrice = drinkPrice;
                break;
            case 2:
                totalPrice = (drinkPrice * 0.2) + drinkPrice;
                break;
            case 3:
                totalPrice = (drinkPrice * 0.35) + drinkPrice;
                break;
        }
    }

    //Switch case para escolher os adicionais
    public void selectAdditional() {
        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Selecione o adicional: );
//        System.out.println("[0] - Sem adicional");
//        System.out.println("[1] - Raspas de limao");
//        System.out.println("[2] - Canela em po");
//        System.out.println("[3] - Leite ninho (colher)");
//        System.out.println("[4] - Gelo de creme de leite (Cubo)");
//        System.out.println("[5] - Leite condensado (colher)");
//        System.out.println("[6] - Chocolate em po(Colher)");
//        System.out.println("[7] - Cookie (Unidade)");
//        System.out.println("Digite a opcao do adicional: ");
        op = sc.nextInt();
        switch (op) {
            case 1:
                Additional lemonSrapes = new ScrapedLemon();
                totalPrice += lemonSrapes.getAddPrice();
                break;
            case 2:
                Additional cinnamon = new CinnamonPowder();
                totalPrice += cinnamon.getAddPrice();
                break;
            case 3:
                Additional milkPowder = new MilkPowder();
                totalPrice += milkPowder.getAddPrice();
                break;
            case 4:
                Additional creamCubes = new CreamCubes();
                totalPrice += creamCubes.getAddPrice();
                break;
            case 5:
                Additional condensedMilk = new CondensedMilk();
                totalPrice += condensedMilk.getAddPrice();
                break;
            case 6:
                Additional chocPowder = new ChocolatePowder();
                totalPrice += chocPowder.getAddPrice();
                break;
            case 7:
                Additional cookie = new Cookie();
                totalPrice += cookie.getAddPrice();
                break;
        }
    }

    public void moreAdditional() {
        Scanner sc = new Scanner(System.in);
        while (validator == 1) {
            System.out.println("Gostaria de colocar mais um adicional?(Lembre que isso é um café, não uma festa)");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");
            validator(sc.nextInt());
        }

    }

    private void validator(int op) {
        switch (op) {
            case 1:
                selectAdditional();
                break;
            case 2:
                validator -= 1;
                break;
        }

    }

    public double getTotalPrice() {
        return totalPrice;
    }


}

package Controller;
import Additionals.*;
import CoffeeTypes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class DrinkFactory {
    private double totalPrice;
    private double drinkPrice;
    private int validator = 1;
    private ArrayList<String> additionalList = new ArrayList();
    private ArrayList<String> drinkList = new ArrayList();

    //Switch case to select the drink type
    public void selectDrink(int op) {

        switch (op) {
            case 0:
                break;
            case 1:
                Drink coffee = new Coffee();
                drinkPrice = coffee.getPrice();
                drinkList.add("Café");
                break;
            case 2:
                Drink milkCoffee = new MilkCoffee();
                drinkPrice = milkCoffee.getPrice();
                drinkList.add("Café com Leite");
                break;
            case 3:
                Drink milkChocolate = new MilkChocolate();
                drinkPrice = milkChocolate.getPrice();
                drinkList.add("Leite com Chocolate");
                break;
            case 4:
                Drink mocha = new Mocha();
                drinkPrice = mocha.getPrice();
                drinkList.add("Mocha");
                break;
            case 5:
                Drink espressoConPanna = new EspressoConPanna();
                drinkPrice = espressoConPanna.getPrice();
                drinkList.add("Espresso Con Panna");
                break;
            default:
                System.out.println("Você não selecionou nenhum nenhum café.");
        }
    }

    //Switch case to select the cup serving size
    public void selectSize(int op) {
        switch (op) {
            case 1 -> totalPrice = drinkPrice;
            case 2 -> totalPrice = (drinkPrice * 0.2) + drinkPrice;
            case 3 -> totalPrice = (drinkPrice * 0.35) + drinkPrice;
            default -> System.out.println("Você não selecionou nenhum tamanho.6");
        }
    }

    //Switch case para escolher os adicionais
    public void selectAdditional() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o adicional para colocar no seu drink: ");
        System.out.println("0 - Sem adicional");
        System.out.println("1 - Raspas de limao");
        System.out.println("2 - Canela em po");
        System.out.println("3 - Leite ninho (colher)");
        System.out.println("4 - Gelo de creme de leite (Cubo)");
        System.out.println("5 - Leite condensado (Colher)");
        System.out.println("6 - Chocolate em po(Colher)");
        System.out.println("7 - Cookie (Unidade)");
        System.out.println("Digite a opção do adicional: ");

        int op = sc.nextInt();
        switch (op) {
            case 1 -> {
                Additional lemonScrapes = new ScrapedLemon();
                totalPrice += lemonScrapes.getAddPrice();
                additionalList.add("Raspas de Limão");
            }
            case 2 -> {
                Additional cinnamon = new CinnamonPowder();
                totalPrice += cinnamon.getAddPrice();
                additionalList.add("Canela em Pó");
            }
            case 3 -> {
                Additional milkPowder = new MilkPowder();
                totalPrice += milkPowder.getAddPrice();
                additionalList.add("Leite em Pó");
            }
            case 4 -> {
                Additional creamCubes = new CreamCubes();
                totalPrice += creamCubes.getAddPrice();
                additionalList.add("Gelo de Creme de Leite");
            }
            case 5 -> {
                Additional condensedMilk = new CondensedMilk();
                totalPrice += condensedMilk.getAddPrice();
                additionalList.add("Leite Condensado");
            }
            case 6 -> {
                Additional chocPowder = new ChocolatePowder();
                totalPrice += chocPowder.getAddPrice();
                additionalList.add("Chocolate em Pó");
            }
            case 7 -> {
                Additional cookie = new Cookie();
                totalPrice += cookie.getAddPrice();
                additionalList.add("Cookie");
            }
            default -> System.out.println("Você não selecionou nenhum adicional");
        }
    }

    //Validador de adicional
    public void moreAdditional() {
        Scanner sc = new Scanner(System.in);
        while (validator == 1) {
            System.out.println("Gostaria de colocar mais um adicional?(Lembre que isso é um café, não uma festa)");
            System.out.println("1 - Sim");
            System.out.println("2 - Nao");
            validator(sc.nextInt());
        }

    }

    private void validator(int op) {
        switch (op) {
            case 1 -> selectAdditional();
            case 2 -> validator -= 1;
        }

    }

    //Getters
    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<String> getAdditionalList() {
        return additionalList;
    }

    public ArrayList<String> getDrinkList() {
        return drinkList;
    }
}

import CoffeeTypes.*;
import Controller.DrinkFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Drink drink = new Drink();
        Coffee coffee = new Coffee();
        DrinkFactory createDrink = new DrinkFactory();

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione um drink: ");
        System.out.println("1 - Cafe");
        System.out.println("2 - Cafe com Leite");
        System.out.println("3 - Leite com Chocolate");
        System.out.println("4 - Mocha");
        System.out.println("5 - Espresso con Panna");
        System.out.println("Digite a opcao desejada: ");
        createDrink.selectDrink(sc.nextInt());

        System.out.println("Selecione um tamanho: ");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Medio");
        System.out.println("3 - Grande");
        System.out.println("Digite a opcao de tamanho: ");
        createDrink.selectSize(sc.nextInt());

        createDrink.moreAdditional();


        sc.close();

        System.out.println("O valor do pedido foi: " + createDrink.getTotalPrice());
        System.out.println("A bebida pedida foi: " + createDrink.getDrinkList());
        System.out.println("O(s) adicional(is) pedidos foram: " + createDrink.getAdditionalList());
    }


}

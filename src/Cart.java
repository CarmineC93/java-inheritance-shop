import org.lessons.java.Headphones;
import org.lessons.java.Product;
import org.lessons.java.Smartphone;
import org.lessons.java.Tv;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {

    static int maxCapacityCart = 5;
    public static Product[] productsCart = new Product[maxCapacityCart];
    static int counter = -1;

    public static int contatorItem(){
        if(counter <= maxCapacityCart){
            counter++;
        }else{
            maxCapacityCart++; //not working
            counter++;
        }
        return counter;
    }

    public static void addToCart(Product product){
        productsCart[counter] = product;

        System.out.println(Arrays.toString(productsCart));
    }

    public static BigDecimal getActualTotalCart(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Have you a fidelity card?");

        // info se ha carta fedeltà e quindi se i prezzi sono da scontare
        boolean fidelity = scan.nextLine().equalsIgnoreCase("s");
        // calcolo il totale
        BigDecimal totale = new BigDecimal("0.00");
        for (Product prod:productsCart) {
            if (fidelity) {
                // uso il prezzo scontato
                totale = totale.add(prod.getDiscountedPrice(true));
            } else {
                // uso il prezzo normale
                totale = totale.add(prod.priceWithIva());
            }
        }
        return totale.setScale(2, RoundingMode.HALF_EVEN);
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int typeOfProduct;

        do{
            System.out.println("What kind of product do you want buy? " +
                    "1) Smartphone" +
                    "2) TV" +
                    "3) Headphones" +
                    "4) Nothing more, go to payment");

            typeOfProduct = Integer.parseInt(scan.nextLine());

            if(typeOfProduct == 1){
                Smartphone iphone6 = new Smartphone(50504060, 256, "Iphone6", "Smartphone della casa Apple", new BigDecimal("700.00"), new BigDecimal("0.22"));
                contatorItem();
                addToCart(iphone6);
                System.out.println("TOTALE: " + getActualTotalCart());


            }
            else if(typeOfProduct == 2){
                Tv sony4k = new Tv(70, true, "Sony 4k 70", "tv 4k Sony ottima risoluzione..", new BigDecimal("4000.00"), new BigDecimal("0.22"));
                contatorItem();
                addToCart(sony4k);
                System.out.println("TOTALE: " + getActualTotalCart());


            }
            else if(typeOfProduct == 3){
                Headphones marshall = new Headphones("black", true, "Cuffie Marshall", "Cuffie Marshall senza cavo wireless ecc...", new BigDecimal("150.00"), new BigDecimal("22"));
                contatorItem();
                addToCart(marshall);
                System.out.println("TOTALE: " + getActualTotalCart());


            }
            else{
                System.out.println("Select a valid option");
            }
        }while(typeOfProduct  !=  4);

        /* BONUS */





        scan.close();
    }


}
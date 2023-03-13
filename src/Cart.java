import org.lessons.java.Headphones;
import org.lessons.java.Product;
import org.lessons.java.Smartphone;
import org.lessons.java.Tv;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
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
                Smartphone iphone6 = new Smartphone(50504060, 256, "Iphone6", "Smartphone della casa Apple", new BigDecimal("700.00"), new BigDecimal("22"));

                Product.contatorItem();
                Product.addToCart(iphone6);

            }
            else if(typeOfProduct == 2){
                Tv sony4k = new Tv(70, true, "Sony 4k 70", "tv 4k Sony ottima risoluzione..", new BigDecimal("4000.00"), new BigDecimal("22"));
                Product.contatorItem();
                Product.addToCart(sony4k);

            }
            else if(typeOfProduct == 3){
                Headphones marshall = new Headphones("black", true, "Cuffie Marshall", "Cuffie Marshall senza cavo wireless ecc...", new BigDecimal("150.00"), new BigDecimal("22"));
                Product.contatorItem();
                Product.addToCart(marshall);

                }


        }while(typeOfProduct  !=  4);



        scan.close();
    }


}
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int typeOfProduct;

        do{
            System.out.print("What kind of product do you want buy? " +
                    "1) Smartphone" +
                    "2) TV" +
                    "3) Headphones" +
                    "4) Nothing more, go to payment");

            typeOfProduct = Integer.parseInt(scan.nextLine());




        }while(typeOfProduct  !=  4);


    }
}
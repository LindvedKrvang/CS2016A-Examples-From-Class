/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample;

import factoerymethodexample.BE.Product;
import static factoerymethodexample.ProductType.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class FactoryMethodExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProductFactory shitFactory = new ShitProductFactory();
        IProductFactory goodFactory = new GoodProductFactory();

        Product shitCar = shitFactory.createProduct(CAR);
        Product shitBike = shitFactory.createProduct(BIKE);

        Product goodCar = goodFactory.createProduct(CAR);
        Product goodBike = goodFactory.createProduct(BIKE);

        System.out.println("Good Car: " + goodCar.getPrice()
                + "\nShit Car: " + shitCar.getPrice()
                + "\n\nGood Bike: " + goodBike.getPrice()
                + "\nShit Bike: " + shitBike.getPrice());

    }

}

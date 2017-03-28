/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoerymethodexample;

import factoerymethodexample.BE.Bike;
import factoerymethodexample.BE.Car;
import factoerymethodexample.BE.Product;

/**
 *
 * @author Rasmus
 */
public class GoodProductFactory implements IProductFactory {

    @Override
    public Product createProduct(ProductType type) {
        switch (type) {
            case CAR:
                return new Car(1, "Good Car", 5000);
            case BIKE: {
                return new Bike(2, "Good Bike", 3000);
            }
            default:
                throw new RuntimeException("Product not in production!");
        }
    }

}

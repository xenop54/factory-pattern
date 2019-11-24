package factory;

import factory.samples.BMWFactory;
import factory.samples.WolswagenFactory;

/**
 * @author umut.bayram
 */
public class Factory {

    public static void main(String args[]) {
        BMWFactory bmwFactory = new BMWFactory();
        WolswagenFactory wolswagenFactory = new WolswagenFactory();

        bmwFactory.getCars().stream().forEach(car -> {
            System.out.println(car.getName() + " - " + car.getModel());
        });

        wolswagenFactory.getCars().stream().forEach(car -> {
            System.out.println(car.getName() + " - " + car.getModel());
        });

    }
}

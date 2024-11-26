package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.println("----------------------------");
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());

		System.out.println("----------------------------");
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Movie 1");
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Movie 2");
	    DigitalVideoDisc dvd6 = new DigitalVideoDisc("Movie 3");
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd4, dvd5);
		anOrder.addDigitalVideoDisc(dvd4,dvd5,dvd6);
		
	}
}

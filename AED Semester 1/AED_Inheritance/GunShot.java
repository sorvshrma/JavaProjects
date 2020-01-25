package edu.neu.aed;

import java.util.ArrayList;
import java.util.List;

public class GunShot extends Explosion implements GunShotMeasurable {
	public GunShot() {
		super();
	}

	@Override
	public void explode() {
		System.out.println("(POW)");
	}
	
	@Override
	public double getMetric() {
		return 376.5;	// muzzle velocity meter/second
	}
	
	@Override
	public String getMetricDescription() {
		StringBuilder description = new StringBuilder();
		description.append("A Gun Shot having a Muzzle Velocity of ");
		description.append(this.getMetric());
		description.append(" meters/second.");
		return description.toString();
	}

	public static void demo() {
		Explosion explosion = new Explosion(); // explosion object
		GunShot gunShot = new GunShot(); // GunShot object

		System.out.println("My object inherited this from Object class ->" + gunShot.getClass().getName());
		System.out.println("My class inherited this from Object class ->" + GunShot.class.getName());

		System.out.println("Demonstrate Polymorphism (hide derived classes)");
		List<AbstractExplosionAPI> explosions = new ArrayList<>(); // container
		explosions.add(explosion); // add Explosion obj to container
		explosions.add(gunShot); // add GunShot obj to container
		System.out.println(explosions.size() + " explosion objects");
		for (AbstractExplosionAPI obj : explosions) {
			obj.explode(); // explode object
		}
		if (gunShot instanceof Measurable) {
			System.out.println(gunShot.getMetricDescription());
		}
	}

}

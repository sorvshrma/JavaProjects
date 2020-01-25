package edu.neu.aed;

import java.util.ArrayList;
import java.util.List;

/**
 * ExplosionController
 * Employ Factory Design pattern
 * 
 * @author danielgmp
 *
 */
public class ExplosionController {
	private int explosionCount = 0;
	private List<AbstractExplosionFactoryAPI> factories = new ArrayList<>();
	private List<Explosion> explosions = new ArrayList<>();
	
	/**
	 * default constructor demonstrates loose coupling in
	 * this class
	 * 	a. Never references classes derived from AbstractExplosionFactory.
	 * 	a. Never references classes derived from Explosion. 
	 */
	public ExplosionController() {
	}
	
	/*
	 * Class constructor for default demonstration usigng
	 * small set of Explosion factories 
	 */
	public ExplosionController(int explosionCount) {
		this.explosionCount = explosionCount;
		
		// default list of Factories
		this.load(new GunShotFactory());
		this.load(new GrenadeFactory());
		this.load(new ABombFactory());
		System.out.println(this.factories.size() + " factories Added.");
		
		// generate and add explosions using factories
		this.load();
	}
	
	/**
	 * load factories into controller
	 * @param f		explosion factory
	 */
	public void load(AbstractExplosionFactoryAPI f) {
		factories.add(f);
	}
	
	/**
	 * use loaded explosion factories to generate and load explosions (specified by explosion count) into controller.
	 */
	private void load() {
		this.add(this.explosionCount);
	}
	
	/**
	 * use loaded explosion factories to generate and load explosions (specified by supplied explosion count) into controller.
	 * 
	 * @param n		explosion count
	 */
	public void load(int n) {
		if (0 == n) {
			this.explosions.clear();
			this.explosionCount = n;
		} else {			
			this.add(n);
		}
	}	
	
	/**
	 * load specific explosion into factory.
	 * @param e		specific explosion to load
	 */
	public void load(Explosion e) {
		this.explosions.add(e);
		this.explosionCount++;
	}
	
	/**
	 * use loaded factories to generate and add (explosion count) expolosions to controller.
	 * @param n
	 */
	private void add(int n) {
		System.out.println( "Adding " + n * this.factories.size() + " explosions (" + n + " each of " + this.factories.size() + " different types).");

		/* generate explosion count explosion count explosions from each factory
		 * and add to controller
		 */
		for (int i = 0; i < n; i++) {
			// generate explosion(s) from each loaded factory
			for (AbstractExplosionFactoryAPI f : this.factories) {
				this.explosions.add(f.getObject());
				this.explosionCount++;
			}
		}
	}
	
	public void start() {
		System.out.println(explosions.size() + " explosions to set off.");
		for (Explosion e : explosions) {
			System.out.print(e.getClass().getSimpleName() + " ");
			e.explode();
			if (e instanceof Measurable) {
				Measurable m = (Measurable) e;
				System.out.println(m.getMetricDescription());
			}
		}
	}
	public static void demo() {
		System.out.println("\t" + ExplosionController.class.getName() + " .demo() starting...\n");
		ExplosionController obj = new ExplosionController(2);	// use small set of factories	
		/*
		 * using Factor Pattern
		 */
		obj.start();
		
//		obj.load(new GunShot());
//		obj.load(new Grenade());
//		obj.load(new ABomb());
//		obj.start();
		System.out.println(ExplosionController.class.getName() + " .demo() done!\n");
	}
	public static void demo2() {
		System.out.println("\t" + ExplosionController.class.getName() + " .demo2() starting...\n");
		ExplosionController obj = new ExplosionController();	// empty		
		/*
		 * Explosion Controller uses Factory Pattern
		 * Load Explosion Factories (AbstractExplosionFactory)
		 */
		obj.load(new GunShotFactory());
		obj.load(new GrenadeFactory());
		obj.load(new ABombFactory());
		/*
		 * Use loaded factories to create Explosions
		 */
		obj.load(2);		// creating two explosions from each factory
		obj.start();
		
		System.out.println(ExplosionController.class.getName() + " .demo2() done!\n");
	}
}

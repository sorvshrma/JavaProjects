package edu.neu.aed;

public class GunShotFactory extends AbstractExplosionFactoryAPI{

	@Override
	public Explosion getObject() {
		return new GunShot();
	}

}

package edu.neu.aed;

public class GrenadeFactory extends AbstractExplosionFactoryAPI {

	@Override
	public Explosion getObject() {
		return new Grenade();
	}

}

package edu.neu.aed;

public interface ExplosionMeasurable extends Measurable {
	/**
	 * the measure for quantification: tons of TNT.
	 * @return metric value.
	 */
	public double getMetric();
	/**
	 * the description of the measure for quantification: tons of TNT.
	 * @return metric value.
	 */
	public String getMetricDescription();

}

package edu.neu.aed;

/**
 * An API for obtaining a metric for comparison and quantification.
 * 
 * @author danielgmp
 *
 */
public interface Measurable {
	/**
	 * the measure for quantification.
	 * @return metric value.
	 */
	public double getMetric();
	/**
	 * the description of the measure for quantification.
	 * @return metric value.
	 */
	public String getMetricDescription();
}

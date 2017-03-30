package org.roi.itlab.cassandra.random_attributes;

/**
 * Created by Vlad on 24.03.2017.
 */
public class RandomDistanceGenerator extends RandomGenerator {

    static double[] x = {2000,10000,15000,20000,40000.0};
    static double[] y = {1.0,1.0,0.5,0.4,0.1};

    public RandomDistanceGenerator(org.apache.commons.math3.random.RandomGenerator rng) {
        super(rng, x,y);
    }
}

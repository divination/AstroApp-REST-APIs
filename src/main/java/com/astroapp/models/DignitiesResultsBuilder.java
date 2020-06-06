/*
 * AstroAppRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.astroapp.models;

import java.util.*;

public class DignitiesResultsBuilder {
    //the instance to build
    private DignitiesResults dignitiesResults;

    /**
     * Default constructor to initialize the instance
     */
    public DignitiesResultsBuilder() {
        dignitiesResults = new DignitiesResults();
    }

    public DignitiesResultsBuilder p0(List<DignitiesValue> p0) {
        dignitiesResults.setP0(p0);
        return this;
    }

    public DignitiesResultsBuilder p1(List<DignitiesValue> p1) {
        dignitiesResults.setP1(p1);
        return this;
    }

    public DignitiesResultsBuilder p2(List<DignitiesValue> p2) {
        dignitiesResults.setP2(p2);
        return this;
    }

    public DignitiesResultsBuilder p3(List<DignitiesValue> p3) {
        dignitiesResults.setP3(p3);
        return this;
    }

    public DignitiesResultsBuilder p4(List<DignitiesValue> p4) {
        dignitiesResults.setP4(p4);
        return this;
    }

    public DignitiesResultsBuilder p5(List<DignitiesValue> p5) {
        dignitiesResults.setP5(p5);
        return this;
    }

    public DignitiesResultsBuilder p6(List<DignitiesValue> p6) {
        dignitiesResults.setP6(p6);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DignitiesResults build() {
        return dignitiesResults;
    }
}
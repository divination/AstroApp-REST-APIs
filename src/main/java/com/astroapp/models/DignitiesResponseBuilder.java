/*
 * AstroAppRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.astroapp.models;

import java.util.*;

public class DignitiesResponseBuilder {
    //the instance to build
    private DignitiesResponse dignitiesResponse;

    /**
     * Default constructor to initialize the instance
     */
    public DignitiesResponseBuilder() {
        dignitiesResponse = new DignitiesResponse();
    }

    public DignitiesResponseBuilder chart(Chart chart) {
        dignitiesResponse.setChart(chart);
        return this;
    }

    public DignitiesResponseBuilder output(DignitiesResults output) {
        dignitiesResponse.setOutput(output);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DignitiesResponse build() {
        return dignitiesResponse;
    }
}
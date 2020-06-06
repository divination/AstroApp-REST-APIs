/*
 * AstroAppRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.astroapp.models;

import java.util.*;

public class TransitsParametersBuilder {
    //the instance to build
    private TransitsParameters transitsParameters;

    /**
     * Default constructor to initialize the instance
     */
    public TransitsParametersBuilder() {
        transitsParameters = new TransitsParameters();
    }

    /**
     * The date to start the search from.
     */
    public TransitsParametersBuilder startDate(String startDate) {
        transitsParameters.setStartDate(startDate);
        return this;
    }

    /**
     * This is the date that will be returned for pagination purposes. Transits are limited to 90 days intervals for Transits to Natal and to 180 days to Transits to Transits. The nextStartDate is the date that should be used as the start date in the next request.
     */
    public TransitsParametersBuilder nextStartDate(String nextStartDate) {
        transitsParameters.setNextStartDate(nextStartDate);
        return this;
    }

    /**
     * Geographical Latitude.
     */
    public TransitsParametersBuilder lat(String lat) {
        transitsParameters.setLat(lat);
        return this;
    }

    /**
     * Geographical longitude.
     */
    public TransitsParametersBuilder lng(String lng) {
        transitsParameters.setLng(lng);
        return this;
    }

    /**
     * Time Zone of the transits location.
     */
    public TransitsParametersBuilder tz(String tz) {
        transitsParameters.setTz(tz);
        return this;
    }

    /**
     * List of objects to be included in calculations. This is an array of object IDs.
     */
    public TransitsParametersBuilder objects(List<Integer> objects) {
        transitsParameters.setObjects(objects);
        return this;
    }

    /**
     * List of objects to explicitly exclude.
     */
    public TransitsParametersBuilder exclusions(String exclusions) {
        transitsParameters.setExclusions(exclusions);
        return this;
    }

    /**
     * List of aspects to include in events calculations. This is an array of aspect angles.
     */
    public TransitsParametersBuilder aspects(List<Integer> aspects) {
        transitsParameters.setAspects(aspects);
        return this;
    }

    /**
     * Type of the events. For example, 1 is aspects to natal planets, 3 is ingresses into houses.
     */
    public TransitsParametersBuilder eventTypes(List<Integer> eventTypes) {
        transitsParameters.setEventTypes(eventTypes);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransitsParameters build() {
        return transitsParameters;
    }
}
/*
 * AstroAppRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.astroapp.models;

import java.util.*;

public class TransitsToTransitsResponseBuilder {
    //the instance to build
    private TransitsToTransitsResponse transitsToTransitsResponse;

    /**
     * Default constructor to initialize the instance
     */
    public TransitsToTransitsResponseBuilder() {
        transitsToTransitsResponse = new TransitsToTransitsResponse();
    }

    public TransitsToTransitsResponseBuilder aspectAngle(int aspectAngle) {
        transitsToTransitsResponse.setAspectAngle(aspectAngle);
        return this;
    }

    public TransitsToTransitsResponseBuilder eventType(int eventType) {
        transitsToTransitsResponse.setEventType(eventType);
        return this;
    }

    public TransitsToTransitsResponseBuilder exactDate1(String exactDate1) {
        transitsToTransitsResponse.setExactDate1(exactDate1);
        return this;
    }

    public TransitsToTransitsResponseBuilder exactDate2(String exactDate2) {
        transitsToTransitsResponse.setExactDate2(exactDate2);
        return this;
    }

    public TransitsToTransitsResponseBuilder exactJD(double exactJD) {
        transitsToTransitsResponse.setExactJD(exactJD);
        return this;
    }

    public TransitsToTransitsResponseBuilder exactJD2(double exactJD2) {
        transitsToTransitsResponse.setExactJD2(exactJD2);
        return this;
    }

    public TransitsToTransitsResponseBuilder exactLng(int exactLng) {
        transitsToTransitsResponse.setExactLng(exactLng);
        return this;
    }

    public TransitsToTransitsResponseBuilder exactLng2(int exactLng2) {
        transitsToTransitsResponse.setExactLng2(exactLng2);
        return this;
    }

    public TransitsToTransitsResponseBuilder objectId1(int objectId1) {
        transitsToTransitsResponse.setObjectId1(objectId1);
        return this;
    }

    public TransitsToTransitsResponseBuilder objectId2(int objectId2) {
        transitsToTransitsResponse.setObjectId2(objectId2);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransitsToTransitsResponse build() {
        return transitsToTransitsResponse;
    }
}
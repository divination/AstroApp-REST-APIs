/*
 * AstroAppRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.astroapp.models;

import java.util.*;

public class TransitsToTransitsRequestBuilder {
    //the instance to build
    private TransitsToTransitsRequest transitsToTransitsRequest;

    /**
     * Default constructor to initialize the instance
     */
    public TransitsToTransitsRequestBuilder() {
        transitsToTransitsRequest = new TransitsToTransitsRequest();
    }

    /**
     * Transit parameters.
     */
    public TransitsToTransitsRequestBuilder params(TransitsParameters params) {
        transitsToTransitsRequest.setParams(params);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TransitsToTransitsRequest build() {
        return transitsToTransitsRequest;
    }
}
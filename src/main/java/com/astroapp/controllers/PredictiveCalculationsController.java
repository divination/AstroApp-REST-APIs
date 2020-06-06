/*
 * AstroAppRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.astroapp.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import com.astroapp.*;
import com.astroapp.models.*;
import com.astroapp.exceptions.*;
import com.astroapp.http.client.HttpClient;
import com.astroapp.http.client.HttpContext;
import com.astroapp.http.request.HttpRequest;
import com.astroapp.http.response.HttpResponse;
import com.astroapp.http.response.HttpStringResponse;
import com.astroapp.http.client.APICallBack;
import com.astroapp.controllers.syncwrapper.APICallBackCatcher;

public class PredictiveCalculationsController extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static PredictiveCalculationsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PredictiveCalculationsController class 
     */
    public static PredictiveCalculationsController getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new PredictiveCalculationsController();
                }
            }
        }
        return instance;
    }

    /**
     * The API calculates Transits to Transits.
     * The Chart data parameter is the starting date for calculations. 
     * The Target chart data must include date, time, location and the time zone. The date and time will be used to define the calculation period, where chart data is the starting point and target data is the end point for progressions listing. The target location will be used for all transits calculations.
     * The Chart and Target chart objects do not need to include any calculation results.
     * The time range cannot exceed 180 days.
     * 406 error will be returned if there are more than 9 objects requested or if the Luminaries or the Mercury transits are requested along with 3 or more other objects.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     * @return    Returns the List<TransitsToTransitsResponse> response from the API call 
     */
    public List<TransitsToTransitsResponse> createTransitsToTransits(
                final String contentType,
                final String key,
                final TransitsToTransitsRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateTransitsToTransitsRequest(contentType, key, body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateTransitsToTransitsResponse(_context);
    }

    /**
     * The API calculates Transits to Transits.
     * The Chart data parameter is the starting date for calculations. 
     * The Target chart data must include date, time, location and the time zone. The date and time will be used to define the calculation period, where chart data is the starting point and target data is the end point for progressions listing. The target location will be used for all transits calculations.
     * The Chart and Target chart objects do not need to include any calculation results.
     * The time range cannot exceed 180 days.
     * 406 error will be returned if there are more than 9 objects requested or if the Luminaries or the Mercury transits are requested along with 3 or more other objects.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     */
    public void createTransitsToTransitsAsync(
                final String contentType,
                final String key,
                final TransitsToTransitsRequest body,
                final APICallBack<List<TransitsToTransitsResponse>> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateTransitsToTransitsRequest(contentType, key, body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            List<TransitsToTransitsResponse> returnValue = _handleCreateTransitsToTransitsResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createTransitsToTransits
     */
    private HttpRequest _buildCreateTransitsToTransitsRequest(
                final String contentType,
                final String key,
                final TransitsToTransitsRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/transits/transits");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("Content-Type", contentType);
        _headers.put("key", key);

        _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createTransitsToTransits
     * @return An object of type List<TransitsToTransitsResponse>
     */
    private List<TransitsToTransitsResponse> _handleCreateTransitsToTransitsResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 401) {
            throw new APIException("Failed Authentication.", _context);
        }
        if (_responseCode == 404) {
            throw new APIException("Transits for the selected objects within the provided date range are not found or cannot be calculated.", _context);
        }
        if (_responseCode == 406) {
            throw new APIException("This error will be returned if transits for more than 9 objects requested or if the the Sun, the Moon or the Mercury transits are requested along with at least 3 or more other objects.", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        List<TransitsToTransitsResponse> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<TransitsToTransitsResponse>>(){});

        return _result;
    }

    /**
     * This API calculates Solar, Lunar and Planetary returns.
     * This API will work with both chart data only requests and calculated chart requests. To achieve better response times it's always recommended to supply planetary data for previously calculated charts.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     * @return    Returns the ReturnsResponse response from the API call 
     */
    public ReturnsResponse createReturns(
                final String contentType,
                final String key,
                final ReturnsRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateReturnsRequest(contentType, key, body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateReturnsResponse(_context);
    }

    /**
     * This API calculates Solar, Lunar and Planetary returns.
     * This API will work with both chart data only requests and calculated chart requests. To achieve better response times it's always recommended to supply planetary data for previously calculated charts.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     */
    public void createReturnsAsync(
                final String contentType,
                final String key,
                final ReturnsRequest body,
                final APICallBack<ReturnsResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateReturnsRequest(contentType, key, body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ReturnsResponse returnValue = _handleCreateReturnsResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createReturns
     */
    private HttpRequest _buildCreateReturnsRequest(
                final String contentType,
                final String key,
                final ReturnsRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/returns");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("Content-Type", contentType);
        _headers.put("key", key);

        _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createReturns
     * @return An object of type ReturnsResponse
     */
    private ReturnsResponse _handleCreateReturnsResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 401) {
            throw new APIException("Failed authentication.", _context);
        }
        if (_responseCode == 404) {
            throw new APIException("Return not found or cannot be calculated for selected target date or chart.", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        ReturnsResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ReturnsResponse>(){});

        return _result;
    }

    /**
     * The API to calculate astrological progressions.
     * Chart data must provide all points to which aspects/progressions need to be calculated. The Objects filter parameter doesn't have any effect as of now.
     * The target chart object must include date, time, location and the time zone. The date and time will be used to define the calculation period, where chart data is the starting point and target data is the end point for progressions listing. The target location will be used for all progression calculations. The target chart does not need to include calculation results.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     * @return    Returns the ProgressionsResponse response from the API call 
     */
    public ProgressionsResponse createProgressions(
                final String contentType,
                final String key,
                final ProgressionsRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateProgressionsRequest(contentType, key, body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateProgressionsResponse(_context);
    }

    /**
     * The API to calculate astrological progressions.
     * Chart data must provide all points to which aspects/progressions need to be calculated. The Objects filter parameter doesn't have any effect as of now.
     * The target chart object must include date, time, location and the time zone. The date and time will be used to define the calculation period, where chart data is the starting point and target data is the end point for progressions listing. The target location will be used for all progression calculations. The target chart does not need to include calculation results.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     */
    public void createProgressionsAsync(
                final String contentType,
                final String key,
                final ProgressionsRequest body,
                final APICallBack<ProgressionsResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateProgressionsRequest(contentType, key, body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            ProgressionsResponse returnValue = _handleCreateProgressionsResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createProgressions
     */
    private HttpRequest _buildCreateProgressionsRequest(
                final String contentType,
                final String key,
                final ProgressionsRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/progressions");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("Content-Type", contentType);
        _headers.put("key", key);

        _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createProgressions
     * @return An object of type ProgressionsResponse
     */
    private ProgressionsResponse _handleCreateProgressionsResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 401) {
            throw new APIException("Failed authentication.", _context);
        }
        if (_responseCode == 404) {
            throw new APIException("Progressions cannot be calculated for selected dates range.", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        ProgressionsResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ProgressionsResponse>(){});

        return _result;
    }

    /**
     * The API generates listing of the dates of transits to natal points.
     * The API expects the start date and location along with the natal chart data and calcualted planetary positions and house cusps positions.
     * The results are paginated at 90 day intervals. Each respons includes the nextStartDate parameter that must be used to scroll results forward in time.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     * @return    Returns the TransitsToNatalResponse response from the API call 
     */
    public TransitsToNatalResponse createTransitsToNatal(
                final String contentType,
                final String key,
                final TransitsToNatalRequest body
    ) throws Throwable {

        HttpRequest _request = _buildCreateTransitsToNatalRequest(contentType, key, body);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleCreateTransitsToNatalResponse(_context);
    }

    /**
     * The API generates listing of the dates of transits to natal points.
     * The API expects the start date and location along with the natal chart data and calcualted planetary positions and house cusps positions.
     * The results are paginated at 90 day intervals. Each respons includes the nextStartDate parameter that must be used to scroll results forward in time.
     * @param    contentType    Required parameter: Example: 
     * @param    key    Required parameter: AstroApp API key
     * @param    body    Required parameter: Example: 
     */
    public void createTransitsToNatalAsync(
                final String contentType,
                final String key,
                final TransitsToNatalRequest body,
                final APICallBack<TransitsToNatalResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildCreateTransitsToNatalRequest(contentType, key, body);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            TransitsToNatalResponse returnValue = _handleCreateTransitsToNatalResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for createTransitsToNatal
     */
    private HttpRequest _buildCreateTransitsToNatalRequest(
                final String contentType,
                final String key,
                final TransitsToNatalRequest body) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/transits/natal");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>();
        _headers.put("Content-Type", contentType);
        _headers.put("key", key);

        _headers.put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
        _headers.put("user-agent", BaseController.userAgent);
        _headers.put("accept", "application/json");


        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(body));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for createTransitsToNatal
     * @return An object of type TransitsToNatalResponse
     */
    private TransitsToNatalResponse _handleCreateTransitsToNatalResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //Error handling using HTTP status codes
        int _responseCode = _response.getStatusCode();

        if (_responseCode == 401) {
            throw new APIException("Failed Authentication.", _context);
        }
        if (_responseCode == 404) {
            throw new APIException("Transits for the selected objects within the provided date range are not found or cannot be calculated.", _context);
        }
        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        String _responseBody = ((HttpStringResponse)_response).getBody();
        TransitsToNatalResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<TransitsToNatalResponse>(){});

        return _result;
    }

}

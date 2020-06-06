# Getting started

# Introduction
AstroApp APIs provide various astrological calculations for use on external web sites and mobile apps.

# Overview
Things that the developers should know about

# Authentication
Bearer token Authentication is used.
    The Bearer token must be included in every request along with the AstroApp API Key.
    Successful authentication returns a valid token with each request.
    'EXPIRED' token value is returned when the token expires and must be renewed.

# Error Codes
401 - Unauthorized
403 - Forbidden. Resource not accessible.
404 - not found (not found resource, or requested astrological events are not found within the specified time frame).
406 - parameters not acceptable for requested calculations.

# Rate limit
Please contact AstroApp Sales for details on rate limits and pricing.

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

## How to Use

The following section explains how to use the AstroAppRESTAPIs library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *AstroAppRESTAPIsLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

Clicking the ``` Add ``` button will open a dialog where you need to specify AstroAppRESTAPIs in ``` Group Id ``` and AstroAppRESTAPIsLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=AstroApp%20REST%20APIs-Java&workspaceName=AstroAppRESTAPIs&projectName=AstroAppRESTAPIsLib&rootNamespace=com.astroapp)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *AstroAppRESTAPIsLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| oAuthAccessToken | OAuth 2.0 Access Token |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String oAuthAccessToken = "oAuthAccessToken"; // OAuth 2.0 Access Token

AstroAppRESTAPIsClient client = new AstroAppRESTAPIsClient(oAuthAccessToken);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [PredictiveCalculationsController](#predictive_calculations_controller)
* [LocationsAndTimeZonesController](#locations_and_time_zones_controller)
* [ChartsAndDetailsController](#charts_and_details_controller)

## <a name="predictive_calculations_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.astroapp.controllers.PredictiveCalculationsController") PredictiveCalculationsController

### Get singleton instance

The singleton instance of the ``` PredictiveCalculationsController ``` class can be accessed from the API Client.

```java
PredictiveCalculationsController predictiveCalculations = client.getPredictiveCalculations();
```

### <a name="create_transits_to_transits_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.PredictiveCalculationsController.createTransitsToTransitsAsync") createTransitsToTransitsAsync

> The API calculates Transits to Transits.
> 
> The Chart data parameter is the starting date for calculations. 
> 
> The Target chart data must include date, time, location and the time zone. The date and time will be used to define the calculation period, where chart data is the starting point and target data is the end point for progressions listing. The target location will be used for all transits calculations.
> 
> The Chart and Target chart objects do not need to include any calculation results.
> 
> 
> 
> The time range cannot exceed 180 days.
> 
> 406 error will be returned if there are more than 9 objects requested or if the Luminaries or the Mercury transits are requested along with 3 or more other objects.


```java
void createTransitsToTransitsAsync(
        final String contentType,
        final String key,
        final TransitsToTransitsRequest body,
        final APICallBack<List<TransitsToTransitsResponse>> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    TransitsToTransitsRequest body = new TransitsToTransitsRequest();
    // Invoking the API call with sample inputs
    predictiveCalculations.createTransitsToTransitsAsync(contentType, key, body, new APICallBack<List<TransitsToTransitsResponse>>() {
        public void onSuccess(HttpContext context, List<TransitsToTransitsResponse> response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Failed Authentication. |
| 404 | Transits for the selected objects within the provided date range are not found or cannot be calculated. |
| 406 | This error will be returned if transits for more than 9 objects requested or if the the Sun, the Moon or the Mercury transits are requested along with at least 3 or more other objects. |



### <a name="create_returns_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.PredictiveCalculationsController.createReturnsAsync") createReturnsAsync

> This API calculates Solar, Lunar and Planetary returns.
> 
> This API will work with both chart data only requests and calculated chart requests. To achieve better response times it's always recommended to supply planetary data for previously calculated charts.


```java
void createReturnsAsync(
        final String contentType,
        final String key,
        final ReturnsRequest body,
        final APICallBack<ReturnsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    ReturnsRequest body = new ReturnsRequest();
    // Invoking the API call with sample inputs
    predictiveCalculations.createReturnsAsync(contentType, key, body, new APICallBack<ReturnsResponse>() {
        public void onSuccess(HttpContext context, ReturnsResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Failed authentication. |
| 404 | Return not found or cannot be calculated for selected target date or chart. |



### <a name="create_progressions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.PredictiveCalculationsController.createProgressionsAsync") createProgressionsAsync

> The API to calculate astrological progressions.
> 
> Chart data must provide all points to which aspects/progressions need to be calculated. The Objects filter parameter doesn't have any effect as of now.
> 
> The target chart object must include date, time, location and the time zone. The date and time will be used to define the calculation period, where chart data is the starting point and target data is the end point for progressions listing. The target location will be used for all progression calculations. The target chart does not need to include calculation results.


```java
void createProgressionsAsync(
        final String contentType,
        final String key,
        final ProgressionsRequest body,
        final APICallBack<ProgressionsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    ProgressionsRequest body = new ProgressionsRequest();
    // Invoking the API call with sample inputs
    predictiveCalculations.createProgressionsAsync(contentType, key, body, new APICallBack<ProgressionsResponse>() {
        public void onSuccess(HttpContext context, ProgressionsResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Failed authentication. |
| 404 | Progressions cannot be calculated for selected dates range. |



### <a name="create_transits_to_natal_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.PredictiveCalculationsController.createTransitsToNatalAsync") createTransitsToNatalAsync

> The API generates listing of the dates of transits to natal points.
> 
> The API expects the start date and location along with the natal chart data and calcualted planetary positions and house cusps positions.
> 
> The results are paginated at 90 day intervals. Each respons includes the nextStartDate parameter that must be used to scroll results forward in time.


```java
void createTransitsToNatalAsync(
        final String contentType,
        final String key,
        final TransitsToNatalRequest body,
        final APICallBack<TransitsToNatalResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    TransitsToNatalRequest body = new TransitsToNatalRequest();
    // Invoking the API call with sample inputs
    predictiveCalculations.createTransitsToNatalAsync(contentType, key, body, new APICallBack<TransitsToNatalResponse>() {
        public void onSuccess(HttpContext context, TransitsToNatalResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Failed Authentication. |
| 404 | Transits for the selected objects within the provided date range are not found or cannot be calculated. |



[Back to List of Controllers](#list_of_controllers)

## <a name="locations_and_time_zones_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.astroapp.controllers.LocationsAndTimeZonesController") LocationsAndTimeZonesController

### Get singleton instance

The singleton instance of the ``` LocationsAndTimeZonesController ``` class can be accessed from the API Client.

```java
LocationsAndTimeZonesController locationsAndTimeZones = client.getLocationsAndTimeZones();
```

### <a name="get_locations_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.LocationsAndTimeZonesController.getLocationsAsync") getLocationsAsync

> Locations search.
> 
> This API searches by place names (such as full or partial city names, hospital names, historic locations, military bases and so on). The API returns coordinates of all the places that match the search criteria along with the time zone name.
> 
> The output from this API is used as an input for all the AstroAPP APIs that require chart calculation or depend on location and/or time zone information.


```java
void getLocationsAsync(
        final String cityName,
        final String stateCode,
        final int countryID,
        final String contentType,
        final String key,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| cityName |  ``` Required ```  | Full or partial name of the location (city, historical location, reservation, military bases, etc) |
| stateCode |  ``` Required ```  | 2-letter state code abbreviation; applicable only for the locations in the USA. |
| countryID |  ``` Required ```  | Id of the country. Please contact AstroApp Support for details. |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | Your AstroApp API access key. |


#### Example Usage

```java
String cityName = "Sunnyv";
String stateCode = "ca";
int countryID = 1;
String contentType = "application/json";
String key = "YOUR_ASTROAPP_APY_KEY";
// Invoking the API call with sample inputs
locationsAndTimeZones.getLocationsAsync(cityName, stateCode, countryID, contentType, key, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_locations_by_coords_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.LocationsAndTimeZonesController.getLocationsByCoordsAsync") getLocationsByCoordsAsync

> Locations search by coordinates.
> 
> This API provides proximity searches based on the provided geographical coordinates (longitude and latitude). The API returns coordinates of all the places that match the search criteria along with the time zone name.
> 
> The default proximity radius is 10 international miles (or 16.0934 km) from the provided location.
> 
> The output from this API is used as an input for all the AstroAPP APIs that require chart calculation or depend on location and/or time zone information.


```java
void getLocationsByCoordsAsync(
        final double lat,
        final double lng,
        final String contentType,
        final String key,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| lat |  ``` Required ```  | Geographical latitude |
| lng |  ``` Required ```  | Geographical longitude |
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | You AstroApp API access key. |


#### Example Usage

```java
double lat = 37.3688;
double lng = -122.036;
String contentType = "application/json";
String key = "YOUR_ASTROAPP_APY_KEY";
// Invoking the API call with sample inputs
locationsAndTimeZones.getLocationsByCoordsAsync(lat, lng, contentType, key, new APICallBack<void>() {
    public void onSuccess(HttpContext context, void response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="charts_and_details_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.astroapp.controllers.ChartsAndDetailsController") ChartsAndDetailsController

### Get singleton instance

The singleton instance of the ``` ChartsAndDetailsController ``` class can be accessed from the API Client.

```java
ChartsAndDetailsController chartsAndDetails = client.getChartsAndDetails();
```

### <a name="create_stats_by_sign_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.ChartsAndDetailsController.createStatsBySignAsync") createStatsBySignAsync

> This API provides statistical information for a given chart. It requires a previously calculated chart (chart with objects/planets and house cusps already calculated).


```java
void createStatsBySignAsync(
        final String contentType,
        final String key,
        final StatsBySignRequest body,
        final APICallBack<StatsBySignResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | Pre-calculated chart data. |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    StatsBySignRequest body = new StatsBySignRequest();
    // Invoking the API call with sample inputs
    chartsAndDetails.createStatsBySignAsync(contentType, key, body, new APICallBack<StatsBySignResponse>() {
        public void onSuccess(HttpContext context, StatsBySignResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Failed authentication. |
| 404 | Stats data not found or cannot be calculated. |



### <a name="create_dignities_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.ChartsAndDetailsController.createDignitiesAsync") createDignitiesAsync

> API that returns essential and accidental dignities based on already calculated chart data.


```java
void createDignitiesAsync(
        final String contentType,
        final String key,
        final DignitiesRequest body,
        final APICallBack<DignitiesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | Pre-calculated chart data. |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    DignitiesRequest body = new DignitiesRequest();
    // Invoking the API call with sample inputs
    chartsAndDetails.createDignitiesAsync(contentType, key, body, new APICallBack<DignitiesResponse>() {
        public void onSuccess(HttpContext context, DignitiesResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Failed Authentication. |



### <a name="create_dignities_for_dates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.ChartsAndDetailsController.createDignitiesForDatesAsync") createDignitiesForDatesAsync

> API that returns essential and accidental dignities based on the regular chart data (birth date and time along with location and the time zone).


```java
void createDignitiesForDatesAsync(
        final String contentType,
        final String key,
        final DignitiesForDatesRequest body,
        final APICallBack<DignitiesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | Chart information that will be used to calculate a new chart and provide dignities data. |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    DignitiesForDatesRequest body = new DignitiesForDatesRequest();
    // Invoking the API call with sample inputs
    chartsAndDetails.createDignitiesForDatesAsync(contentType, key, body, new APICallBack<DignitiesResponse>() {
        public void onSuccess(HttpContext context, DignitiesResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Failed Authentication. |



### <a name="create_chart_data_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.ChartsAndDetailsController.createChartDataAsync") createChartDataAsync

> This API is used to create a new astrological chart (new horoscope).
> 
> The API Returns the new chart data, and optionally - aspects listing and the chart image in the png format.


```java
void createChartDataAsync(
        final String contentType,
        final String key,
        final ChartDataRequest body,
        final APICallBack<ChartDataResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | Chart information to be used to calculate a new horoscope. |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    ChartDataRequest body = new ChartDataRequest();
    // Invoking the API call with sample inputs
    chartsAndDetails.createChartDataAsync(contentType, key, body, new APICallBack<ChartDataResponse>() {
        public void onSuccess(HttpContext context, ChartDataResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid or missing parameters |
| 401 | Failed authentication. |



### <a name="create_chart_data_with_tokens_based_authentication_async"></a>![Method: ](https://apidocs.io/img/method.png "com.astroapp.controllers.ChartsAndDetailsController.createChartDataWithTokensBasedAuthenticationAsync") createChartDataWithTokensBasedAuthenticationAsync

> This API is used to create a new astrological chart (new horoscope).
> 
> The API Returns the new chart data, and optionally - aspects listing and the chart image in the png format.
> 
> 
> 
> The API is identical to the Chart Data API and is provided to demonstrate the proper Bearer token authentication usage.
> 
> 
> 
> The toekn based authentication method is the required method that must be used for all AstroApp REST APIs.


```java
void createChartDataWithTokensBasedAuthenticationAsync(
        final String contentType,
        final String key,
        final ChartDataRequest body,
        final APICallBack<ChartDataResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contentType |  ``` Required ```  | TODO: Add a parameter description |
| key |  ``` Required ```  | AstroApp API key |
| body |  ``` Required ```  | Chart information for the new horoscope. |


#### Example Usage

```java
try {
    String contentType = "Content-Type";
    String key = "key";
    ChartDataRequest body = new ChartDataRequest();
    // Invoking the API call with sample inputs
    chartsAndDetails.createChartDataWithTokensBasedAuthenticationAsync(contentType, key, body, new APICallBack<ChartDataResponse>() {
        public void onSuccess(HttpContext context, ChartDataResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid or missing parameters |
| 401 | Failed authentication. |



[Back to List of Controllers](#list_of_controllers)




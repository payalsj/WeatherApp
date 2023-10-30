
### About Project: 
The Weather API provides access to weather information for various locations around the world. We can also get hourly weather information.
To use the Weather API, you need to make HTTP requests to specific endpoints with the required parameters. The API will respond with weather data in JSON format.

### Authentication:
Authentication is required to access the Weather API. Following are the authentiaction details you have to pass in the header to use the API's
1. ClientId= myClientId
2. Client-Sercret= myClientSecret <br/>
<br/>
If you do not provide correct client-Id and secret then this api will throw an exception <br/>
{
<br/>
    "error": "Login Information Is Wrong", <br/>
    "code": 412 (i.e pre Condition failed)
<br/>
}
<br/>
<br/>
   Endpoints: The Weather API offers the following endpoints:-

### ForeCast By Location:
-EndPoint= "http://localhost:8081/weather/getForcast/{city}" <br/>
-Description: Get the current weather conditions for a specific location(city). <br/>
-HTTP Method: GET <br/> <br/>

### Hourly ForeCast By Location:
EndPoint= "http://localhost:8081/weather/getForcastHourly/{city}" <br/>
Description: Get hourly weather condtion for specific location(city). <br/>
-HTTP Method: GET <br/>

For API Documentation refer this swagger link :- http://localhost:8081/swagger-ui.html <br/>
### **NOTE:- Please use Postman for API testing & pass the headers mentioned above for authentication.


 

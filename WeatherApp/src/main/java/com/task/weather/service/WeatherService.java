package com.task.weather.service;

import org.springframework.http.ResponseEntity;

public interface WeatherService {

	public ResponseEntity<String> getForcastSummaryByLocation(String city);

	public ResponseEntity<String> rapidApiGetHourlyForecastByLocationName(String city);

}

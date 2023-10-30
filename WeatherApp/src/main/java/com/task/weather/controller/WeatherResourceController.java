package com.task.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.task.weather.service.WeatherService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
public class WeatherResourceController {

	@Autowired
	private WeatherService weatherService;

	@Operation(summary = "This API returns weather forecast for specific location", description = "This API returns weather forecast for specific location")
	@GetMapping("weather/getForcast/{city}")
	public ResponseEntity<String> getForcastSummaryByLocation(
			@Parameter(example = "Berlin", description = "Provide city name for weather forecast") @PathVariable("city") String city) {
		return weatherService.getForcastSummaryByLocation(city);

	}

	@Operation(summary = "This API returns hourly Weather forecast details of Any city using API", description = "This API returns hourly Weather forecast details of Any city using API")
	@GetMapping("weather/getForcastHourly/{city}")
	public ResponseEntity<String> rapidApiGetHourlyForecastByLocationName(
			@Parameter(example = "Berlin", description = "Provide city name for weather forecast") @PathVariable("city") String city) {
		return weatherService.rapidApiGetHourlyForecastByLocationName(city);
	}

}

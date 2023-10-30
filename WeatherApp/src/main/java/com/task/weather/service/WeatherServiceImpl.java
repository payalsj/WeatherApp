package com.task.weather.service;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.task.weather.constant.AppConstants;
import com.task.weather.exception.RapidApiDownException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private HttpService httpService;

	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<String> getForcastSummaryByLocation(String city) {

		log.info("City.....:" + city);

		HttpEntity<Void> requestEntity = httpService.getHeadersForRapidApi();

		ResponseEntity<String> response = restTemplate.exchange(
				MessageFormat.format(AppConstants.FORECAST_BY_LOCATION, city), HttpMethod.GET, requestEntity,
				String.class, "");

		log.info("response status .......:" + response.getStatusCode());

		if (response.getStatusCode() != HttpStatus.OK) {
			throw new RapidApiDownException(AppConstants.RAPID_API_EXEPTION);
		}

		return ResponseEntity.ok(response.getBody());

	}

	public ResponseEntity<String> rapidApiGetHourlyForecastByLocationName(String city) {
		HttpEntity<Void> requestEntity = httpService.getHeadersForRapidApi();

		ResponseEntity<String> response = restTemplate.exchange(
				MessageFormat.format(AppConstants.FORECAST_HOURLY, city), HttpMethod.GET, requestEntity, String.class,
				"");
		log.info("response status .......:" + response.getStatusCode());
		if (response.getStatusCode() != HttpStatus.OK) {
			throw new RapidApiDownException(AppConstants.RAPID_API_EXEPTION);
		}
		return ResponseEntity.ok(response.getBody());

	}

}

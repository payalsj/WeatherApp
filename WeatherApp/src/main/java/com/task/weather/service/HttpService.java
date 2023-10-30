package com.task.weather.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.task.weather.constant.AppConstants;

@Service
public class HttpService {

	public HttpEntity<Void> getHeadersForRapidApi() {

		HttpHeaders headers = new HttpHeaders();
		headers.set(AppConstants.X_RAPIDAPI_KEY, AppConstants.X_RAPIDAPI_VALUE);
		headers.set(AppConstants.X_RAPIDAPI_HOST, AppConstants.X_RAPIDAPI_HOST_VALUE);
		headers.set(AppConstants.ACCESS_CONTROL_CREDENTIALS, AppConstants.ACCESS_CONTROL_VALUE);
		headers.set(AppConstants.ACCESS_CONTROL_HEADERS, AppConstants.ACCESS_CONTROL_HEADERS_VALUE);
		headers.set(AppConstants.ACCESS_CONTROL_METHODS, AppConstants.ACCESS_CONTROL_METHODS_VALUES);
		headers.set(AppConstants.ACCESS_CONTROL_ORIGIN, AppConstants.ACCESS_CONTROL_ORIGIN_VALUE);
		headers.set(AppConstants.CONTENT_TYPE, AppConstants.CONTENT_TYPE_VALUE);
		headers.set(AppConstants.SERVER, AppConstants.SERVER_VALUE);

		HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
		return requestEntity;

	}

}

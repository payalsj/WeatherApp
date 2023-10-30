package com.task.weather.interceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.task.weather.exception.InvalidHeaderException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RequestHandlerInterceptor implements HandlerInterceptor {

	@Value("${app.client.id}")
	private String clientId;

	@Value("${app.client.secret}")
	private String clientSecret;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String id = request.getHeader("client-id");
		String secretKey = request.getHeader("client-secret");

		log.info("clientId:" + id);
		log.info("secretKey:" + secretKey);

		if (clientId.equals(id) && clientSecret.equals(secretKey)) {
			return true;
		} else {
			throw new InvalidHeaderException("Login Information Is Wrong");
		}
	}

}

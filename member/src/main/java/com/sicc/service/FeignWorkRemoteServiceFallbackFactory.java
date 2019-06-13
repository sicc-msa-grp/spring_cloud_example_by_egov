package com.sicc.service;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

/**
 * Feign용 Hystrix fallback exception 원인 파악을 위한 클레스
 * @author Woongs
 */
@Component
public class FeignWorkRemoteServiceFallbackFactory
		implements FallbackFactory<FeignWorkRemoteService> {
	/**
	 * Feign용 Hystrix fallback exception 원인 파악을 위한 클레스
	 * @author Woongs
	 */
	@Override
	public FeignWorkRemoteService create(Throwable cause) {
		System.out.println("exception = "+cause);
		return workId -> "[ this work is finished ]";
	}
}

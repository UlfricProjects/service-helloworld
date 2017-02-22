package com.ulfric.service.helloworld;

import com.ulfric.turtle.method.GET;

public class HelloResource {

	@GET
	public HelloResponse hello(HelloRequest request)
	{
		HelloResponse response = new HelloResponse();
		response.setGreeting("Hello, " + request.getName() + "!");
		return response;
	}

}

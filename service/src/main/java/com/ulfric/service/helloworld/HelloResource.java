package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Response;
import com.ulfric.turtle.method.GET;

public class HelloResource {

	@GET
	public Response hello(HelloRequest request)
	{
		String name = request.getName();

		HelloResponse response = new HelloResponse();

		response.setGreeting("Hello, " + request.getName() + "!");

		return response;
	}

}

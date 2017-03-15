package com.ulfric.service.helloworld;

import com.ulfric.dragoon.bean.Beans;
import com.ulfric.turtle.method.GET;

public class HelloResource {

	@GET
	public HelloResponse hello(HelloRequest request)
	{
		HelloResponse response = Beans.create(HelloResponse.class);
		response.setGreeting("Hello, " + request.getName() + "!");
		return response;
	}

}

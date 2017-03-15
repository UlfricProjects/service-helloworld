package com.ulfric.service.helloworld;

import com.ulfric.dragoon.bean.Beans;
import com.ulfric.turtle.method.GET;
import com.ulfric.turtle.model.Response;

public class HelloResource {

	@GET
	public Response hello(HelloRequest request)
	{
		HelloResponse response = Beans.create(HelloResponse.class);
		response.setGreeting("Hello, " + request.getName() + "!");
		return response;
	}

}

package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Response;
import com.ulfric.turtle.method.GET;

public class HelloAdapter {

	@GET
	public Response hello(HelloRequest request)
	{
		String name = request.getName();

		Response response = new HelloResponse(name);

		return response;
	}

}

package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Response;
import com.ulfric.turtle.method.GET;

public class DefaultResponseAdapter {

	@GET
	public Response hello(DefaultRequest request)
	{
		String name = request.getName();

		Response response = new DefaultResponse(name);

		return response;
	}

}

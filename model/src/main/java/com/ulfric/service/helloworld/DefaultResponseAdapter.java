package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Request;
import com.ulfric.turtle.message.Response;
import com.ulfric.turtle.method.GET;
import com.ulfric.turtle.method.PARAM;

public class DefaultResponseAdapter {

	@GET
	public Response respond(DefaultRequest request)
	{
		String name = request.getName();

		Response response = new DefaultResponse(name);

		return response;
	}

	public static class DefaultRequest extends Request
	{

		@PARAM private String name;

		public String getName()
		{
			return this.name;
		}

	}

	public static class DefaultResponse extends Response
	{

		private String name;

		public DefaultResponse(String name)
		{
			this.name = name;
		}

		@Override
		public String respond()
		{
			return "Hello, " + this.name + "!";
		}

	}

}

package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Response;

public class DefaultResponse extends Response {

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
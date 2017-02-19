package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Response;

public class HelloResponse extends Response {

	private String name;

	public HelloResponse(String name)
	{
		this.name = name;
	}

	@Override
	public String respond()
	{
		return "Hello, " + this.name + "!";
	}

}
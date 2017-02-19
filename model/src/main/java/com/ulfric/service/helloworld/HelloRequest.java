package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Request;

public class HelloRequest extends Request {

	private String name;

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
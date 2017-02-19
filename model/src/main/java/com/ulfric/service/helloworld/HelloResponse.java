package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Response;

public class HelloResponse extends Response {

	private String greeting;

	public String getGreeting()
	{
		return this.greeting;
	}

	public void setGreeting(String greeting)
	{
		this.greeting = greeting;
	}

}
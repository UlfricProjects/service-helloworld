package com.ulfric.service.helloworld;

import com.ulfric.turtle.TurtleService;

public class HelloWorld extends TurtleService {

	@Override
	public void onEnable()
	{
		this.install(DefaultResponseAdapter.class);
	}

}

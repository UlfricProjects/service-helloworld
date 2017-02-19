package com.ulfric.service.helloworld;

import com.ulfric.commons.naming.Name;
import com.ulfric.turtle.TurtleService;

@Name("HelloWorld")
public class HelloWorld extends TurtleService {

	@Override
	public void onEnable()
	{
		this.install(HelloAdapter.class);
	}

}

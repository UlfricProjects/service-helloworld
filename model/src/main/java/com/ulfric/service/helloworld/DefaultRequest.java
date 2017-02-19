package com.ulfric.service.helloworld;

import com.ulfric.turtle.message.Request;
import com.ulfric.turtle.method.PARAM;

public class DefaultRequest extends Request {

	@PARAM private String name;

	public String getName()
	{
		return this.name;
	}

}
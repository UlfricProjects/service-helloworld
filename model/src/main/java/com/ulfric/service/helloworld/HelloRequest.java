package com.ulfric.service.helloworld;

import com.ulfric.turtle.model.Request;

public interface HelloRequest extends Request {

	String getName();

	HelloRequest setName(String name);

}

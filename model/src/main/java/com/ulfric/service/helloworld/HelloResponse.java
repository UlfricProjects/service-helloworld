package com.ulfric.service.helloworld;

import com.ulfric.turtle.model.Response;

public interface HelloResponse extends Response {

	String getGreeting();

	HelloResponse setGreeting(String greeting);

}

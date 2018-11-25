package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"GoodBye"})
public class GoodBye implements MessageHello {
	@Value("${name:bye}")
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "GoodBye [name=" + name + "]";
	}

	@Override
	public String Message() {
		// TODO Auto-generated method stub
		return "Good"+this.name;
	}

}

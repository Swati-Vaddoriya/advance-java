package com.codeming.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ABC {
	
	@Autowired
	public XYZ xyz;   // xyz is ready put it here,,so now my ABC is also ready.
}

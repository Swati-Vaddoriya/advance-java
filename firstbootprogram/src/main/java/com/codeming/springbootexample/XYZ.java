package com.codeming.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class XYZ {
	
	@Autowired
	@Lazy
	public ABC abc;  // abc no need to required.. my xyz is ready

}

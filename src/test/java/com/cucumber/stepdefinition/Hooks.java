package com.cucumber.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	
	public void beforehook() {

		System.out.println("before hook");
	}
	
	@After
	
	public void afterhook() {
       System.out.println("after hook");
	}
	
	
}

package org.manju.lambdaExpression;

@FunctionalInterface
public interface MyfunctionalInterface {

	public String sayHello();
	
	static String sayManju(){
		return "hi Manju";
	}
}

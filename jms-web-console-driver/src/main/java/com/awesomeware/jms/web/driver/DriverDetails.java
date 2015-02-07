package com.awesomeware.jms.web.driver;

public interface DriverDetails<T extends DriverType> {
	public String getDisplayVersion();
	
	public T getDriverType();
}

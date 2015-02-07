package com.awesomeware.jms.web.driver;

import java.util.Comparator;

public interface DriverType {
	public String getDisplayName();
	
	public Comparator<DriverDetails<? extends DriverType>> getVersionComparator();
}

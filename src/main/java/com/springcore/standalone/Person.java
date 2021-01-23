package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private List<String> friendsList;
	private Set<String> namesSet;
	private Map<String,String> courseMap;
	private Properties properties;
	
	public List<String> getFriendsList() {
		return friendsList;
	}
	
	public void setFriendsList(List<String> friendsList) {
		this.friendsList = friendsList;
	}
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Set<String> getNamesSet() {
		return namesSet;
	}
	public void setNamesSet(Set<String> namesSet) {
		this.namesSet = namesSet;
	}
	public Map<String, String> getCourseMap() {
		return courseMap;
	}
	public void setCourseMap(Map<String, String> courseMap) {
		this.courseMap = courseMap;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [friendsList=" + friendsList + ", namesSet=" + namesSet + ", courseMap=" + courseMap
				+ ", properties=" + properties + "]";
	}

	
}

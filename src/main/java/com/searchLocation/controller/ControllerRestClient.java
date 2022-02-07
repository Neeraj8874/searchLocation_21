package com.searchLocation.controller;

import org.springframework.web.client.RestTemplate;

import com.searchLocation.controller.dto.Location;

public class ControllerRestClient {

 public Location getLocation(long id) {
	 RestTemplate rest = new RestTemplate();
	 Location location = rest.getForObject("http://localhost:8080/location/"+id, Location.class);
	 return location;
 }
}

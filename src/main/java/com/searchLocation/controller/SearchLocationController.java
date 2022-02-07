package com.searchLocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.searchLocation.controller.dto.Location;

@Controller
public class SearchLocationController {
	
	@RequestMapping("/searchLocation")
	public String showSearchLocationPage() {
	 return "searchLocation";
	}
	@RequestMapping("/searchLoc")
	public String getLocationById(@RequestParam("id") long id, ModelMap modelMap) {
		ControllerRestClient client = new ControllerRestClient();
		 Location location = client.getLocation(id);
		 modelMap.addAttribute("location",location);
	return "searchResult";
	}
}

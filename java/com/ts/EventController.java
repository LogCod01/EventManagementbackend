package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EventDAO;
import com.dto.Event;

@RestController
public class EventController {
	@Autowired
	EventDAO eventDAO;
	@RequestMapping("/getAllEvents")
	public List<Event> getAllEvents(){
		return eventDAO.getAllEvents();
	}
	@PostMapping("/registerEvent")
	public String registerEvent(@RequestBody Event event) {
		eventDAO.registerEvent(event);
		return "event Registered Successfully";
	}

	@PutMapping("/update")
	public String updateevent(@RequestBody Event event) {
		eventDAO.updateEvent(event);
		return "event Updated Successfully";
	}
	
	@DeleteMapping("/deleteEvent/{eventId}")
	public String deleteEventID(@PathVariable("eventId") int eventId) {
		eventDAO.deleteEvent(eventId);
		return "Event with " + eventId + ", Deleted Successfully!!!";
	}

}
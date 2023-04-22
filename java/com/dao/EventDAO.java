package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Event;

@Service
public class EventDAO {
@Autowired
EventRepository eventRepository;

public List<Event> getAllEvents(){
	return eventRepository.findAll();
}
public Event registerEvent(Event event) {
	return eventRepository.save(event);
}
public Event updateEvent(Event event) {
	return eventRepository.save(event);
}
public void deleteEvent(int eventId) {
	eventRepository.deleteById(eventId);
}
}
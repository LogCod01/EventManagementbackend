package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
@Id@GeneratedValue
private int eventId;
private String eventType;
private String name;
private String number;
private String date;
private String time;
private String location;
private long guests;
//private double price;

public Event() {
	super();
}
public Event(int eventId, String eventType, String name, String number, String date, String time, String location,
		long guests) {
	super();
	this.eventId = eventId;
	this.eventType = eventType;
	this.name = name;
	this.number = number;
	this.date = date;
	this.time = time;
	this.location = location;
	this.guests = guests;
}
public int getEventId() {
	return eventId;
}
public void setEventId(int eventId) {
	this.eventId = eventId;
}
public String getEventType() {
	return eventType;
}
public void setEventType(String eventType) {
	this.eventType = eventType;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public long getGuests() {
	return guests;
}
public void setGuests(long guests) {
	this.guests = guests;
}
@Override
public String toString() {
	return "Event [eventId=" + eventId + ", eventType=" + eventType + ", name=" + name + ", number=" + number
			+ ", date=" + date + ", time=" + time + ", location=" + location + ", guests=" + guests + "]";
}

}
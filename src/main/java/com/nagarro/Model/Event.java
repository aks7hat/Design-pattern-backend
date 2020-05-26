package com.nagarro.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.nagarro.Model.Registration;

@Entity
@Table (name="events")
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eventId;
	
	
	private Boolean celebration;
	private Boolean urgentHelp;
	private Boolean holiday;
	private Boolean news;
	private Boolean newPolicy;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Registration registration;
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public Boolean getCelebration() {
		return celebration;
	}
	public void setCelebration(Boolean celebration) {
		this.celebration = celebration;
	}
	public Boolean getUrgentHelp() {
		return urgentHelp;
	}
	public void setUrgentHelp(Boolean urgentHelp) {
		this.urgentHelp = urgentHelp;
	}
	public Boolean getHoliday() {
		return holiday;
	}
	public void setHoliday(Boolean holiday) {
		this.holiday = holiday;
	}
	public Boolean getNews() {
		return news;
	}
	public void setNews(Boolean news) {
		this.news = news;
	}
	public Boolean getNewPolicy() {
		return newPolicy;
	}
	public void setNewPolicy(Boolean newPolicy) {
		this.newPolicy = newPolicy;
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
	
	

}

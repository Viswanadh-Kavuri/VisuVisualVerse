package com.visuvisualverse.controllers;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@GetMapping("/hello")
	public @ResponseBody Map<String,Long> welcome() {
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime targetDate = LocalDateTime.of(2024, 12, 15, 0, 0);
		 
		
		Map<String, Long> timeLeft = new HashMap<>();
		long days = ChronoUnit.DAYS.between(currentDate, targetDate);
		timeLeft.put("Days", days);
		long hours = ChronoUnit.HOURS.between(currentDate.plusDays(days), targetDate);
		timeLeft.put("Hours", hours);
		long minutes = ChronoUnit.MINUTES.between(currentDate.plusDays(days).plusHours(hours), targetDate);
		timeLeft.put("Minutes", minutes);
		long seconds = ChronoUnit.SECONDS.between(currentDate.plusDays(days).plusHours(hours).plusMinutes(minutes), targetDate);
		timeLeft.put("Seconds", seconds);
		
		System.out.println(timeLeft);
		return timeLeft;
	}
	
}

package com.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.di.services.NotificationService;

@RestController
public class PageController {
	// notificationService
	private NotificationService notificationService;

	@Autowired
	public PageController(NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}

	@RequestMapping("/")
	public String home() {
		return notificationService.toString();
	}

}

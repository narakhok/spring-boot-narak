package com.di.services;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	public NotificationService() {
	}

	public void send() {
		System.out.println("Is sending ......!");
	}

	public void sendAsync() {
		System.out.println("Send Async");
	}

	@Override
	public String toString() {
		return "NotificationService{}";
	}

}

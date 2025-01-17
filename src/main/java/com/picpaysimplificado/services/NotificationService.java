package com.picpaysimplificado.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.dtos.NotificationDTO;

@Service
public class NotificationService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public void sendNotification(User user, String message) throws Exception {
		String email = user.getEmail();
		NotificationDTO notificationRequest = new NotificationDTO(email, message);
		
		// Aqui tiver que deixar comentado pq não esta funcionando mais este serviço
//		ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v1/notify", notificationRequest, String.class);
//		
//		if (!(notificationResponse.getStatusCode() == HttpStatus.OK)) {
//			System.out.println("erro ao enviar notificação");
//			throw new Exception("Serviço de notificação esta fora do AR");
//		}
		
		System.out.println("Notificação envida para o usuário");
	}

}

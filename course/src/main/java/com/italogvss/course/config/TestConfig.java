package com.italogvss.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.italogvss.course.entities.Category;
import com.italogvss.course.entities.Order;
import com.italogvss.course.entities.User;
import com.italogvss.course.entities.enuns.OrderStatus;
import com.italogvss.course.repositories.CategoryRepository;
import com.italogvss.course.repositories.OrderRepository;
import com.italogvss.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryrepository;
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Ciclano Cantano", "cc@gmail.com", "1111111", "12546");
		User u2 = new User(null, "Fulano Deltrano", "fd@gmail.com", "2222222", "23444");
		User u3 = new User(null, "Rolando Ekikando", "re@gmail.com", "3333333", "1235444");
		
		Order o1 = new Order(null, Instant.now(), u1, OrderStatus.SHIPPED);
		Order o2 = new Order(null, Instant.now(), u1, OrderStatus.PAID);
		Order o3 = new Order(null, Instant.now(), u1, OrderStatus.PAID);
		Order o4 = new Order(null, Instant.now(), u2, OrderStatus.DELIVERED);
		Order o5 = new Order(null, Instant.now(), u2, OrderStatus.WAITING_PAYMENT);
		Order o6 = new Order(null, Instant.now(), u3, OrderStatus.DELIVERED);
		Order o7 = new Order(null, Instant.now(), u1, OrderStatus.SHIPPED);
		Order o8 = new Order(null, Instant.now(), u2, OrderStatus.PAID);
		
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7, o8));
		categoryrepository.saveAll(Arrays.asList(c1, c2, c3));
	}
}

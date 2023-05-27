package com.example.SpringBoot_s456;

import com.example.SpringBoot_s456.entities.Laptop;
import com.example.SpringBoot_s456.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootS456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootS456Application.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "hp", 8, 80000d);
		Laptop laptop2 = new Laptop(null, "acer", 4, 50000d);

		System.out.println("Cantidad de laptops en la base: "+ repository.findAll().size());
		repository.save(laptop1);
		repository.save(laptop2);
		System.out.println("Cantidad de laptops en la base: "+ repository.findAll().size());

	}

}

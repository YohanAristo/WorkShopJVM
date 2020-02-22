package com.jvm.workshop;

import com.jvm.workshop.domain.Car;
import com.jvm.workshop.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorkshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository repository){
		return (args) -> {
			repository.save(new Car("AAA", "BBB", "CCC", "DDD", 2000));
			repository.save(new Car("AAA1", "BBB1", "CCC1", "DDD1", 2001));
			repository.save(new Car("AAA2", "BBB2", "CCC2", "DDD2", 2002));
			repository.save(new Car("AAA3", "BBB3", "CCC3", "DDD3", 2003));
			repository.save(new Car("AAA4", "BBB4", "CCC4", "DDD4", 2004));
			repository.save(new Car("AAA5", "BBB5", "CCC5", "DDD5", 2005));
			repository.save(new Car("AAA6", "BBB6", "CCC6", "DDD6", 2006));
			repository.save(new Car("AAA7", "BBB7", "CCC7", "DDD7", 2007));
			repository.save(new Car("AAA8", "BBB8", "CCC8", "DDD8", 2008));

		};
	}

}

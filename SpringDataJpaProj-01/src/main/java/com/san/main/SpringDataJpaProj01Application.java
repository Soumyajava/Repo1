package com.san.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.san.repo.MyRepo;

@SpringBootApplication(scanBasePackages = {"com.san"})
public class SpringDataJpaProj01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cctx=SpringApplication.run(SpringDataJpaProj01Application.class,args);
		MyRepo repo=cctx.getBean(MyRepo.class);
		System.out.println(repo.getClass().getName());
		cctx.close();
	}

}

package com.arista.nestnavigator;

import com.arista.nestnavigator.user.repository.UserRepository;
import com.arista.nestnavigator.user.entity.User;
import com.arista.nestnavigator.user.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NestNavigatorApplication extends SpringBootServletInitializer implements CommandLineRunner {

//    private final AuthenticationService authenticationService;
//    public NestNavigatorApplication(AuthenticationService authenticationService) {
//        this.authenticationService = authenticationService;
//    }
    public static void main(String[] args){
        SpringApplication.run(NestNavigatorApplication.class, args);
    }
    @Override
    public void run(String ...args){
//    User user = new User("Siddu","Tammireddy","abc@gmail.com","9876543210","sidda_sai","password");
//    authenticationService.register(user);
    }
}

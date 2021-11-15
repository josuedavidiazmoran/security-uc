package uc.us_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UsSecurityApplication {

    static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(); 
    
    public static void main(String[] args) {
       
        SpringApplication.run(UsSecurityApplication.class, args);

        System.out.println(bCryptPasswordEncoder.encode("123").toString()); 
    }

}
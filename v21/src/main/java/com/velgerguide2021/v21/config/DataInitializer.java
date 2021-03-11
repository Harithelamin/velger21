package com.velgerguide2021.v21.config;

import com.velgerguide2021.v21.model.User;
import com.velgerguide2021.v21.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    @Autowired
    UserRepository users;


    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (this.users.findAll().isEmpty())
        {
            //To Insert an admin for one time
            this.users.save(User.builder()
                    .username("admin")
                    .password(this.passwordEncoder.encode("123456"))
                    .roles(Arrays.asList("ADMIN"))
                    .email("admin@velger.no")
                    .mobileNo("96692299")
                    //.read(true)
                    //.create(true)
                    //.update(true)
                    //.delete(true)
                    .build()
            );

            //To Insert an admin for one time
            this.users.save(User.builder()
                    .username("harith")
                    .password(this.passwordEncoder.encode("123456"))
                    .roles(Arrays.asList("USER"))
                    .email("harithelamin@gmail.com")
                    .mobileNo("96692000")
                    //.read(true)
                    //.create(true)
                    //.update(true)
                    //.delete(true)
                    .build()
            );

        }
        log.debug("printing all users...");
        this.users.findAll().forEach(u -> log.debug(" User :" + u.toString()));
    }
}

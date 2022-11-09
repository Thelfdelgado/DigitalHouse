package com.example.SpringSecurity.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    private UserRepository repository;

    @Autowired
    public DataLoader(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("password");
        String password2 = passwordEncoder.encode("password2");

        repository.save(new AppUser("Luiz", "luiz", "luiz@dh.com", password, AppUserRoles.ROLE_USER));
        repository.save(new AppUser("Luiz2", "luiz2", "luiz2@dh.com", password2, AppUserRoles.ROLE_ADMIN));
    }
}

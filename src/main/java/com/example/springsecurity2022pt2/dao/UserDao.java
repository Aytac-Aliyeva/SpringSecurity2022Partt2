package com.example.springsecurity2022pt2.dao;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDao {
    private final static List<UserDetails> APPLICATION_USERS = Arrays.asList(
            new User("seferovramin7@gmail.com",
                    "password",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE ADMIN"))),

            new User("ramin.safarov@kapitalbank.az",
                    "password123",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE USER"))));

public  UserDetails findUserByEmail (String email){
    return APPLICATION_USERS.stream()
            .filter(u -> u.getUsername().equals(email))
            .findFirst()
            .orElseThrow(() -> new UsernameNotFoundException("Hechbir istifadeci tapilmadi"));

}

}

package org.example.services;

import java.io.File;
import java.util.List;

import org.example.entities.User;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserBookingService {
 private User user;
 private List<User> userList;
 private ObjectMapper objectMapper = new ObjectMapper();
 private static final String USERS_PATH = "../localDB/users.json";
 public UserBookingService (User user){
    this.user = user;
    File file = new File(USERS_PATH);
 }
}



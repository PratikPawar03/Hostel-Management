package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

}

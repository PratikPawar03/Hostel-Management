package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.dto.UserDto;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
@Autowired
UserRepository userRepository;
	
	@Override
	public void addUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setAge(userDto.getAge());
		user.setGender(userDto.getGender());
		user.setName(userDto.getName());
		userRepository.save(user);
	}

}

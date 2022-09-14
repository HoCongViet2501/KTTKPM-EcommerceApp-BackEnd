package com.se.backend.ecommerceapp.service.impl;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.backend.ecommerceapp.model.entity.User;
import com.se.backend.ecommerceapp.repository.UserRepository;
import com.se.backend.ecommerceapp.service.UserService;

@Service
public class UserServicelmpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(user);
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userRepository.delete(user);
	}

}

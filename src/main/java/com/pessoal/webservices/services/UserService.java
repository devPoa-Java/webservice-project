package com.pessoal.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pessoal.webservices.entities.User;
import com.pessoal.webservices.repositories.UserRepository;
import com.pessoal.webservices.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
		
	}
	
	public User update(Long id, User obj) {
		User user = userRepository.getReferenceById(id);
		upDateData(user, obj);
		return userRepository.save(user);
	}

	private void upDateData(User user, User obj) {
		user.setName(obj.getName());
		user.setEmail(obj.getEmail());
		user.setPhone(obj.getPhone());
	}

}

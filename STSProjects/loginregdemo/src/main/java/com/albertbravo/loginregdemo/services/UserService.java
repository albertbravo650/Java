package com.albertbravo.loginregdemo.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.albertbravo.loginregdemo.models.User;
import com.albertbravo.loginregdemo.repositories.UserRepository;

@Service
public class UserService {
	// Add additional validations here. (eg. checking passwords match, unique email, valid login)
	
	@Autowired
	private UserRepository userRepo;
	
	public User register(User newUser, BindingResult result) {
		if(!newUser.getConfirmPassword().equals(newUser.getPassword())) {
			result.rejectValue("confirmPassword", "Matches", "Passwords must match.");
		}
		Optional<User> optionalUser = userRepo.findByEmail(newUser.getEmail());
		if(optionalUser.isPresent()) {
			result.rejectValue("email", "Matches", "Email already exists.");
		}
		if(result.hasErrors()) {
			return null;
		} else {
			String hashedPassword = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			newUser.setPassword(hashedPassword);
			return userRepo.save(newUser);
		}
	}
	
	public User findById(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
		return optionalUser.orElseGet(() -> null);
	}
	
	public User findByEmail(String email) {
		Optional<User> optionalUser = userRepo.findByEmail(email);
		return optionalUser.orElseGet(() -> null);
	}
	
	public User updateUser(User newUser) {
		return userRepo.save(newUser);
	}

}

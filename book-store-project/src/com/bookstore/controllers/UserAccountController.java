package com.bookstore.controllers;

import java.time.LocalDate;
import java.time.Period;

import com.bookstore.dao.UserAccountDAO;
import com.bookstore.dao.UserAccountDAOImpl;
import com.bookstore.model.Interest;
import com.bookstore.model.UserAccount;

public class UserAccountController {
	
	public static void main(String[] args) {
		
		UserAccountController userAccountCtrl = new UserAccountController();
		userAccountCtrl.registerUser();
		
	}
	
	public void registerUser() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		UserAccount userAccount = new UserAccount();
		Interest interest = new Interest();
		UserAccountController userAccountCtrl = new UserAccountController();
		  
		userAccount.setId(1);
		userAccount.setUserName("paulB");
		userAccount.setFirstName("Paul");
		userAccount.setLastName("Breganza");
		userAccount.setBirthDate("2012-07-25");
		LocalDate dob = LocalDate.parse(userAccount.getBirthDate());
		int age = userAccountCtrl.calculateAge(dob);
		userAccount.setAge(age);
		userAccount.setGender("M");
		userAccount.setPhoneNumber("12345");
		userAccount.setEmail("paul.breganza@123.com");
		userAccount.setPassword("abcdef");
		userAccount.setCity("Manila");
		userAccount.setCountry("PH");
		interest.setId(1);
		interest.setLikes("sci-fi");
		interest.setDislikes("horror");
		userAccount.setInterest(interest);
		dao.save(userAccount);
		System.out.println(dao.findById(1));
	}
	
    public int calculateAge(LocalDate birthDate) {
    	
    	LocalDate currentDate = LocalDate.now();  
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

}

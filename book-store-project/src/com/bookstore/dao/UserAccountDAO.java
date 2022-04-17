package com.bookstore.dao;

import com.bookstore.model.UserAccount;

public interface UserAccountDAO {
	
	 void save (UserAccount userAccount);
	 void update (UserAccount userAccount, int id);
	 void delete (int id);
	 UserAccount findById (int id);

}

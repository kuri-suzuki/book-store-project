package com.bookstore.dao;

import java.util.HashMap;
import java.util.Map;

import com.bookstore.model.UserAccount;

public class UserAccountDAOImpl implements UserAccountDAO {

	Map<Integer, UserAccount> userAccounts = new HashMap<>();

	@Override
	public void save(UserAccount userAccount) {
		userAccounts.put(userAccount.getId(), userAccount);

	}

	@Override
	public void update(UserAccount userAccount, int id) {
		userAccounts.replace(id, userAccount);
	}

	@Override
	public void delete(int id) {
		userAccounts.remove(id);
	}

	@Override
	public UserAccount findById(int id) {
		return userAccounts.get(id);
	}

}

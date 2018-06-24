package com.neuedu.lvcity.dao;

import com.neuedu.lvcity.model.Users;

public interface UsersDao {

	Users login(String username, String passwrod);

}

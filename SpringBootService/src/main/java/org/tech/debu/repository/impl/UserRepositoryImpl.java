package org.tech.debu.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tech.debu.common.DummyUserDB;
import org.tech.debu.model.User;
import org.tech.debu.repository.UserRepository;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
	
	@Autowired
	private DummyUserDB userDB;

	@SuppressWarnings("static-access")
	@Override
	public User userGetRepo(String id) {

		return (User) userDB.getIntance().map.get(id);
	}

	@SuppressWarnings("static-access")
	@Override
	public User userAddRepo(User user) {

		return (User) userDB.getIntance().map.put(user.getId(), user);
	}

	@SuppressWarnings("static-access")
	@Override
	public User userUpdateRepo(String id, User user) {

		return (User) userDB.getIntance().map.put(user.getId(), user);
	}

	@SuppressWarnings("static-access")
	@Override
	public String userRemoveRepo(String id) {
		userDB.getIntance().map.remove(id);
		return "User : " + id + " successfully deleted from Dummy DB";
	}

}

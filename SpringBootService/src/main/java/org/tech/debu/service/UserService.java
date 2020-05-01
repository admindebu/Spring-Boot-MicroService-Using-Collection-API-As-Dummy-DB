package org.tech.debu.service;

import org.tech.debu.model.User;

public interface UserService {

	public User userGetServ(String id);

	public User userAddServ(User user);

	public User userUpdateServ(String id, User user);

	public String userRemoveServ(String id);

}

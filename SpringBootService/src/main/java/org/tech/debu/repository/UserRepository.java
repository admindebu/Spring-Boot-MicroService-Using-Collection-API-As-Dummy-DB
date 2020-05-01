package org.tech.debu.repository;

import org.tech.debu.model.User;

public interface UserRepository {

	public User userGetRepo(String id);

	public User userAddRepo(User user);

	public User userUpdateRepo(String id, User user);

	public String userRemoveRepo(String id);

}

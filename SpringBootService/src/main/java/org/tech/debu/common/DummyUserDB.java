package org.tech.debu.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class DummyUserDB {

	public static DummyUserDB userDB = null;

	public static Map<String, Object> map;

	private DummyUserDB() {
		map = new HashMap<String, Object>();

	}

	public static DummyUserDB getIntance() {
		if (userDB == null)
			userDB = new DummyUserDB();
		return userDB;

	}

}

package com.mindlin.baker;

import java.nio.file.Path;
import java.util.concurrent.ConcurrentHashMap;

public class Properties {
	public Path p;
	public ConcurrentHashMap<String, String> properties = new ConcurrentHashMap<>();
	public Properties(Path p) {
		
	}
}

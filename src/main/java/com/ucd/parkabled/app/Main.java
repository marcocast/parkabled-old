package com.ucd.parkabled.app;

import com.aol.micro.server.MicroserverApp;

public class Main {

	public static void main(String[] args) {

		new MicroserverApp(() -> "parkabled").run();

	}

}

package com.example.demo;

public class ShainRepositoryImpl implements ShainRepository {

	@Override
	public String serchByNo(String number) {
		String name;
		switch(number) {
		case "100":
			name = "sato"; break;
		case "101":
			name = "suzuki"; break;
		default:
			name = "not registered"; break;
		}
		return name;
	}

}

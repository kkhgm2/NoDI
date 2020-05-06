package com.example.demo;

public class ShainServiceImpl implements ShainService {

	@Override
	public String findByNo(String number) {
		ShainRepository shainRepository = new ShainRepositoryImpl();
		String name = shainRepository.serchByNo(number);

		return name;
	}

}

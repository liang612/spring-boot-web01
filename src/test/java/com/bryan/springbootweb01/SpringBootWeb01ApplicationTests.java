package com.bryan.springbootweb01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class SpringBootWeb01ApplicationTests {
//	@Autowired
//	DataSource dataSource;

	@Test
	void contextLoads() {
//		System.out.println(dataSource.getClass());

//		Connection connection = dataSource.getConnection();
////		System.out.println(connection);
//		connection.close();
	}

}

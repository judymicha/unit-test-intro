package com.example.task02;

import com.example.date.DateProvider;
import com.example.user.User;
import com.example.user.UserDao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

import static org.junit.Assert.*;


public class UserServiceTest {
	UserDao userDao;
	DateProvider dateProvider;
	UserService userService;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("test before-Class");
	}
	@Before
	public void before() {
		System.out.println("before test");
		userDao = new TestUserDao();
		dateProvider = new TestDateProvider();
		userService = new UserService(userDao, dateProvider);
	}
	@After
	public void after(){
		System.out.println("after test");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("test after-Class");
	}
	
    @Test
    public void shouldCalculateAvgAgeFor3Person() {
        // given
//        userDao = new TestUserDao();
//        dateProvider = new TestDateProvider();
//        userService = new UserService(userDao, dateProvider);
    	System.out.println("test 1");
        // when
        double result = userService.calculateAvgAgeOfUsers();

        // then
        assertEquals(5, result, 0.01);
    }
    
    @Test
    public void shouldTest2(){
    	System.out.println("test 2");
    }
}
	
class TestUserDao extends UserDao {
    @Override
    public Set<User> getAllUsers() {
        Set<User> users = new HashSet<>();
        users.add(new User("John", LocalDate.of(2007, 1, 6)));
        users.add(new User("Max", LocalDate.of(2017, 1, 6)));
        return users;
    }
}

class TestDateProvider implements DateProvider {
    @Override
    public LocalDate now() {
        return LocalDate.of(2017, 5, 1);
    }
    
}


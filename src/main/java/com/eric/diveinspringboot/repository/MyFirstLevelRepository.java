package com.eric.diveinspringboot.repository;

//import com.eric.diveinspringboot.annotation.FirstLevelRepository;
import com.eric.diveinspringboot.annotation.SecondLevelRepository;
import org.springframework.stereotype.Component;

//@FirstLevelRepository(value = "myFirstLevelRepository")
@SecondLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {

}

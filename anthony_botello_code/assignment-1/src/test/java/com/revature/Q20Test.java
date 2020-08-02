package com.revature;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.revature.Q20.Person;

import org.junit.Test;

public class Q20Test {
    
    @Test // data read and print format
    public void testDataReadingAndFormat(){

        List<Person> expected = new ArrayList<>();
        expected.add(new Person("Mickey Mouse", 35, "Arizona"));
        expected.add(new Person("Hulk Hogan", 50, "Virginia"));
        expected.add(new Person("Roger Rabbit", 22, "California"));
        expected.add(new Person("Wonder Woman", 18, "Montana"));

        try{
            List<Person> result = Q20.getPeopleList();

            assertEquals(expected, result);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
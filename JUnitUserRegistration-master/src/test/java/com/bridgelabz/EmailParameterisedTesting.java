package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith
(Parameterized.class)
public class EmailParameterisedTesting {
	String email;
	boolean expected;

	public EmailParameterisedTesting(String email, boolean result) {
    	this.email = email;
    	this.expected = result;
	}
	@Parameterized.Parameters
	public static List<Object[]> inputFirst() {
    	List<Object[]> list = new ArrayList<Object[]>();
    	list.add(new Object[]{"abc@yahoo.com",true});
    	list.add(new Object[]{"abc-100@yahoo.com",true});
    	list.add(new Object[]{"abc.100@yahoo.com",true});
    	list.add(new Object[]{"abc111@abc.com",true});
    	list.add(new Object[]{"abc-100@abc.net",true});
    	list.add(new Object[]{"abc.100@abc.com.au",true});
    	list.add(new Object[]{"abc@1.com",true});
    	list.add(new Object[]{"abc@gmail.com.com",true});
    	list.add(new Object[]{"abc+100@gmail.com",true});
    	list.add(new Object[]{"abc",false});
    	list.add(new Object[]{" abc@.com.my ",false});
    	list.add(new Object[]{"abc123@gmail.a",false});//
    	list.add(new Object[]{"abc123@.com",false});
    	list.add(new Object[]{"abc123@.com.com",false});
    	list.add(new Object[]{".abc@abc.com ",false});
    	list.add(new Object[]{"abc()*@gmail.com",false});
    	list.add(new Object[]{"abc@%*.com",false});
    	list.add(new Object[]{"abc..2002@gmail.com ",false});
    	list.add(new Object[]{"abc.@gmail.com",false});//
   		list.add(new Object[]{"abc@abc@gmail.com",false});
    	list.add(new Object[]{"abc@gmail.com.1a",false});
    	list.add(new Object[]{"abc@gmail.com.aa.au",false});
    	return list;
	}

	@Test
	public void validatePassword() throws UserDefineException {
		UserRegistration userValidator = new UserRegistration();
    	Assert.assertEquals(this.expected,userValidator.validateMail.validate(this.email));
	}
}

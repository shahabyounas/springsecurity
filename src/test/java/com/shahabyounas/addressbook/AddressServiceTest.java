package com.shahabyounas.addressbook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

/**
 * Created by Shahab on 7/24/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=AddressBookConfiguration.class)
public class AddressServiceTest {

    @Autowired
    private AddressService addressService;

//    @Test
//    public void testService() {
//        Address address = addressService.findByLastName("Sheman");
//        assertEquals("P", address.getFirstName());
//        assertEquals("Sherman", address.getLastName());
//        assertEquals("42 Wallaby Way", address.getAddressLine1());
//        assertEquals("Sydney", address.getCity());
//        assertEquals("New South Wales", address.getState());
//        assertEquals("2000", address.getPostCode());
//    }
}
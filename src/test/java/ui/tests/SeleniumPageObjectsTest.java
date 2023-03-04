package ui.tests;

import org.junit.jupiter.api.*;
import static ui.pageObjects.QaDemoPage.demoPage;

public class SeleniumPageObjectsTest {
    String firstName = "Vlad";
    String lastName = "Ivanov";
    String email = "vlad@ivanov.com";
    String phoneNumber = "9999999999";
    String subject = "Arts";
    String currentAddress = "Pacific Ocean";
    String year = "1900";
    String month = "January";
    String picAddress = "src/test/resources/pic.jpg";

    @AfterEach
    public void postUslovie(){
        System.out.println("привет, мир !");
    }

    @Test
    void seleniumTest(){
        demoPage()
                .openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender()
                .setPhoneNumber(phoneNumber)
                .openCalendar()
                .setYear(year)
                .setMonth(month)
                .setDay()
                .setSubject(subject)
                .setHobby()
                .setPicture(picAddress)
                .scrollToCurrentAddress()
                .setCurrentAddress(currentAddress)
                .openState()
                .setState()
                .openCity()
                .setCity()
                .scrollToSubmit()
                .clickSubmit();
    }
}
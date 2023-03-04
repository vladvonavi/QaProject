package ui.pageObjects;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static propLoader.PropLoader.getPropertyByName;
import static steps.UiSteps.setValueInTextField;

public class QaDemoPage {
    public static QaDemoPage demoPage(){
        return new QaDemoPage();
    }

    private final SelenideElement firstNameTextField = $("#firstName"); // текстовое поле с именем
    private final SelenideElement lastNameTextField = $("#lastName"); // текстовое поле с именем
    private final SelenideElement emailTextField = $("#userEmail"); // текстовое поле с почтой
    private final SelenideElement phoneNumberTextField = $("#userNumber"); // текстовое поле с телефоном
    private final SelenideElement subjectList = $("[id=subjectsInput]"); // выпадающий список предметов
    private final SelenideElement currentAddressTextField = $("[id=currentAddress]"); // текстовое поле с адресом;
    private final SelenideElement genderRadio = $("[for=gender-radio-1]"); // выбор пола
    private final SelenideElement hobbyRadio = $("[for=hobbies-checkbox-2]"); // выбор хобби
    private final SelenideElement pictureField = $("#uploadPicture"); // кнопка загрузки картинки
    private final SelenideElement birthdateOpen = $x("//input[@id=\"dateOfBirthInput\"]"); // открытие календаря
    private final SelenideElement yearCalendarOption = $(".react-datepicker__year-select"); // поле ввода года
    private final SelenideElement monthCalendarOption = $(".react-datepicker__month-select"); // поле ввода месяца
    private final SelenideElement dayCalendarOption = $(".react-datepicker__day--001"); // поле ввода дня
    private final SelenideElement stateField = $("[id=state]"); // нажатие на поле штат
    private final SelenideElement stateName = $(byText("NCR")); // поле со штатом
    private final SelenideElement cityField = $("[id=city]"); // нажатие на поле город
    private final SelenideElement cityName = $(byText("Delhi")); // поле с городом

    private final SelenideElement submitButton = $("[id=submit]"); // кнопка сабмит

    @Step("Открываем главную страницу")
    public QaDemoPage openPage(){
        open(getPropertyByName("demoQaPageUrl"));
        return this;
    }

    @Step("Вводим имя {firstName}")
    public QaDemoPage setFirstName(String firstName){
        setValueInTextField(firstNameTextField, firstName);
        return this;
    }

    @Step("Вводим фамилию {lastName}")
    public QaDemoPage setLastName(String lastName){
        lastNameTextField.setValue(lastName);
        return this;
    }

    @Step("Ввводим email {email}")
    public QaDemoPage setEmail(String email){
        emailTextField.setValue(email);
        return this;
    }

    @Step("Ввводим телефон {phoneNumber}")
    public QaDemoPage setPhoneNumber(String phoneNumber){
        phoneNumberTextField.setValue(phoneNumber);
        return this;
    }

    @Step("Ввводим предмет {subject}")
    public QaDemoPage setSubject(String subject){
        subjectList.setValue(subject).pressEnter();
        return this;
    }

    @Step("Ввводим адрес {currentAddress}")
    public QaDemoPage setCurrentAddress(String currentAddress){
        currentAddressTextField.setValue(currentAddress);
        return this;
    }

    @Step("Выбираем пол")
    public QaDemoPage setGender(){
        genderRadio.click();
        return this;
    }

    @Step("Выбираем хобби")
    public QaDemoPage setHobby(){
        hobbyRadio.click();
        return this;
    }

    @Step("Загружаем картинку из {picAddress}")
    public QaDemoPage setPicture(String picAddress){
        pictureField.uploadFile(new File(picAddress));
        return this;
    }

    @Step("Открываем календарь")
    public QaDemoPage openCalendar(){
        birthdateOpen.click();
        return this;
    }

    @Step("Выбираем год {year}")
    public QaDemoPage setYear(String year){
        yearCalendarOption.setValue(year);
        return this;
    }

    @Step("Выбираем месяц {month}")
    public QaDemoPage setMonth(String month){
        monthCalendarOption.setValue(month);
        return this;
    }

    @Step("Выбираем день")
    public QaDemoPage setDay(){
        dayCalendarOption.click();
        return this;
    }

    @Step("Открываем список штатов")
    public QaDemoPage openState(){
        stateField.click();
        return this;
    }

    @Step("Выбираем штат NCR")
    public QaDemoPage setState(){
        stateName.click();
        return this;
    }

    @Step("Открываем список городов")
    public QaDemoPage openCity(){
        cityField.click();
        return this;
    }

    @Step("Выбираем город Delhi")
    public QaDemoPage setCity(){
        cityName.click();
        return this;
    }

    @Step("Прокручиваем страницу до поля адреса")
    public QaDemoPage scrollToCurrentAddress(){
        currentAddressTextField.click();
        return this;
    }

    @Step("Прокручиваем страницу до кнопки сабмита")
    public QaDemoPage scrollToSubmit(){
        submitButton.scrollTo();
        return this;
    }

    @Step("Нажимаем кнопку сабмит")
    public QaDemoPage clickSubmit(){
        submitButton.click();
        return this;
    }

    public QaDemoPage assertBasfa(){
        return this;
    }
}
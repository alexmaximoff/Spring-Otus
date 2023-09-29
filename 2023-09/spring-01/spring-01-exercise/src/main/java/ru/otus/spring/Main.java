package ru.otus.spring;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

public class Main {

    public static void main(String[] args) {
        // TODO: создайте здесь класс контекста
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");

        // TODO: Получите Person Service
        PersonService personService = context.getBean("personService", PersonService.class);

        // Получите Person "Ivan"
        Person ivan = personService.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
    }
}

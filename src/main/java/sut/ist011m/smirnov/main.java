package sut.ist011m.smirnov;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Robot sam = (Robot) context.getBean("robot");
        sam.action();

    }
}
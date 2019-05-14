package com.stackroute.spring;

import com.stackroute.spring.bean.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class Main {
        public static void main(String[] args) {

//Using ApplicationContext
            ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            Movie movieA = (Movie) context.getBean("movieA");
            Movie movieB = (Movie) context.getBean("movieB");

            System.out.println("MovieA Details : "+movieA);
            System.out.println("MovieB Details : "+movieB);
            System.out.println(movieA==movieB);


        }
    }



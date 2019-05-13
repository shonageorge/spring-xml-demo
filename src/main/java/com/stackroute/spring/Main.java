package com.stackroute.spring;

import com.stackroute.spring.bean.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

    public class Main {
        public static void main(String[] args) {

//Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
       /*BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("bean.xml"));
        Movie movies=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie2");*/

//Using XmlBeanFactory
        /*Resource resource=new ClassPathResource("bean.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        Movie movies= (Movie) beanFactory.getBean("movie2");*/

//Using ApplicationContext
            ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            Movie movie = (Movie) context.getBean("movie");
            System.out.println("Movie Details : "+movie);

           // Movie movies = (Movie) context.getBean("movie2");
            //System.out.println( "\nMovie Name : " + movie.getMovieName() + "\nActor Name : " + movie.getActor() + "\nGenre : " + movie.getGenre());
            //System.out.println("\nMovie Name : " + movies.getMovieName() + "\nActor Name : " + movies.getActorName() + "\nGenre : " + movies.getGenre());

        }
    }



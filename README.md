Spring Fundamentals with XML Configurations

<<<<<<< HEAD
Task 2: From the master branch of spring-xml-demo repo create a constructor-injectionbranch.
Add constructor to the Actor class to initialize with name and gender, and ageCreate three beans of type Actor in the bean definition file.  

Use constructor-based injection in the bean definition file (beans.xml) to inject property values in each of the three beans via name, index, and type respectively.

For the Movie bean, use constructor based object injection in the bean definition file (beans.xml) to inject an Actor bean.

In the Main class, look up Movie bean using ApplicationContext and print out Author information. Use the same ApplicationContext to again look up the same Movie bean.
Print out the equality result of the two Movie beans.System.out.println(beanA==beanB); 
Change the scope of the Movie bean in beans.xml to prototype and run the application again. Note the output. 
Replace id of the Movie bean with name having two values, like this: 
<bean name=”MovieA, MovieB” ........> Update the code in Main to get the Movie bean by its two different name. Push the code to constructor-injection branch.
=======
Task 1: Create a Maven project and add required dependency of spring-context5.1.4.RELEASE

Create a Main class in package com.stackroute and two Spring Beans –  Movie, and Actor in package com.stackroute.domain.

Actor has two String properties, name and gender, and an age property of type int. 
An Actor can be initialized with the three properties via the corresponding setter methods. 
Use property based injection in the bean definition file (beans.xml) Movie “has a” Actor that can be initialized via the corresponding setter method. 

Use property based object injection in the bean definition file (beans.xml) The Main class looks up Movie bean via three ways to print out actor information: 
1.Using XmlBeanFactory
2.Using Spring 3.2 BeanDefinitionRegistry and BeanDefinitionReader
3.Using ApplicationContextCreate a spring-xml-demo repo and push the code to master branch.
>>>>>>> b9560743b0f48a03f6e30075324332e498232336

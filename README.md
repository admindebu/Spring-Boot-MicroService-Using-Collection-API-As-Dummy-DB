# Spring-Boot-MicroService-Using-Collection-API-As-Dummy-DB
In this Code we have used Collection API as a Dummy Data Base for storing the data instead of using traditional Database

# YouTube Link for this Video (Live Demo) : 

Start with Collection Framework, then start with below DB
1. in Memory DB 
2. RDBMS DB
3. NoSQL DB
4. Cache


► Download the sample java and microservice application from gitHub: 
https://github.com/admindebu/
► Follow on Facebook: https://www.facebook.com/TechTalkDebu
► Follow on LinkedIn: https://www.linkedin.com/in/debu-paul

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
► Here is our amazing playlist for Core Java, Spring MVC/Boot, Git and Micro service 
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
1. Core Java :: https://www.youtube.com/watch?v=IR_h0okI_eU&list=PLRlT3yKdok6o5pLrr74SdpRI0ZV-KbGOl
2. Spring MVC & Spring Boot :: https://www.youtube.com/watch?v=f-Wk1t8Cfio&list=PLRlT3yKdok6rFd0_O6-lpuIrNwFgxP_b8
3. Micro Service :: https://www.youtube.com/watch?v=pscyaLdGtnI&list=PLRlT3yKdok6r_6j4Y0R75TP4WiiaT21K7
4. Git/GitHub :: https://www.youtube.com/watch?v=XHxBAyEnl4E&list=PLRlT3yKdok6ojVpar7ImPHZ6JbSy6Lnj7

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Watch my "Most Watched Videos"
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
► HTTPS & HTTPS protocol :: https://www.youtube.com/watch?v=BlnSSD0Vw98&list=PLRlT3yKdok6ovZ3BGGM3eanawiNUOcrWz


~~~~~~~~~~~~~~~~~~~~~~~~
► Required Application
~~~~~~~~~~~~~~~~~~~~~~~~
 1. JDK 1.8 - Execution environment
 2. Maven 3.6 - Proejct build tool
 3. IDE ( Eclipse/Intellij ) - Writing Code
 4. For API Testing - Postman or Restclient  
► Generate Spring Boot Template use SPring Initializr : https://start.spring.io/

~~~~~~~~~~~~
► API URL 
~~~~~~~~~~~~
:::: GET ::: Url :-  http://localhost:8080/api/v1/user

:::: POST ::: Url ->  http://localhost:8080/api/v1/user
give below value in "raw" section of "body" tab and select (JSON)

	{
		"id": 1,
		"name": "Debu",
		"address": "INDIA",
		"emailId": "techtalk.debu@gmail.com"
	}

:::: Put(Update) ::: Url ->  http://localhost:8080/api/v1/user/2

give below value in "raw" section of "body" tab and select (JSON)

	{
		"id": 2,
		"name": "PAUL",
		"address": "UK",
		"emailId": "debu@gmail.com"
	}

:::: Delete ::: Url ->  http://localhost:8080/api/v1/user/2

~~~~~~~~~~~~~~~~~~~~~~~
► Software installation
~~~~~~~~~~~~~~~~~~~~~~~

Java 8 Download lInk : https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
install java
Goto Java 8 JDK path in c drive
Add in environment variables : JAVA_HOME =  value
Edit path variable : %JAVA_HOME%\bin   -> then save 
Come to cmd and check java version
Command : javac 
check java version :  java -version

Install Maven :
Check maven install & Version command : mvn -version
set the  M2_HOME from environment variables
set the path varibales =  %M2_HOME%\bin
check mvaen version in cmd : mvn -version
For building application CMD with maven command is : mvn clean install ( make sure you will be in POM file location )

Install postman : https://www.postman.com/downloads/

HTTP Methods : GET , POST, PUT, DELETE, PATCH

HTTP status Code : ( Home status code ) Ref: https://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html
1xx (Informational)
3xx ( Redirect )
2xx (Success or  Ok )
4xx ( Client Side error ) - 400 ( Bad Request ) / 401 ( unauthroized acces ) / 404 ( URL not found ) / 405 (Method not allowed)
5xx ( Server side error ) - 500 (internal server Error) / 503 ( Bad Gaetway)

Play List : https://www.youtube.com/watch?v=CFoxrsEdo-w&list=PLRlT3yKdok6pLwhX58LwNBcsqGl_K206b Tutorial for beginners with examples, Interview Questions and Concepts.

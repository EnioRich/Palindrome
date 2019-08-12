Palindrome Project

Web program for searching first and last Palindrome
in some range

WARNING: jar file may work incorrect.
For more details visit - https://github.com/EnioRich/Palindrome

What things you need to launch the program:

    1) launch SQL code, from file - db.sql in your database:
    CREATE TABLE BLOCK (
      ID               BIGINT PRIMARY KEY AUTO_INCREMENT,
      START_NUMBER     LONG (200) NOT NULL,
      PALINDROME_COUNT LONG (200) NOT NULL,
      FIRST_PALINDROME VARCHAR (255) NOT NULL,
      LAST_PALINDROME  VARCHAR (255) NOT NULL
    );
    
    *Database properties:
    spring.datasource.url=jdbc:h2:tcp://localhost/~/hw2;
    spring.datasource.driver-class-name=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=
    
    2) Open console. Go to folder, where your file.
       In console write: java -jar palindrome-0.0.1-SNAPSHOT.jar
    3) Wait while your program starts
    4) Open your browser and go to - localhost:8080/home
    5) Username: user, Password: 1234

Example

    Enter start number and count of palindromes
    Wait for computing
    Refresh your page

Built With

    Java - Used to write code
    Spring Framework - The web framework used
    Maven - Dependency Management

Authors:

    Egor Vakulenk

# Group-37-ENSF409
Team members MD Shaherier Khan (30132195) ,Syed Mohammed Abbas Kazmi (30125715),Alexander Burn (30002916),Jimmy (30030897)

This repository contains our ENSF 409 final project for the Winter 2022 term.


# Usage:
- Ensure the following files are placed in lib/ at the working directory level
    - hamcrest-core-1.3.jar
    - junit-4.13.2.jar
    - mysql-connector-java-8.0.23.jar
- Default Database Connection information:
    - Username: student
    - Password: ensf
    - Host: localhost
    - Database: food_inventory
- Since Database connections across different platforms can at times cause connection issues, the program will print SQL errors in the event that TA's need to modify DB Connection information for their specfic environment. The only information that may need to be modified can be found in Inventory.java ( line 38)  and CLientType.java (lines 331).

# Warnings:
- To run tests, make sure the database connection is setup and working. Even though the tests do not use database data, the program relies on the active connection to initialize.
- Just run the Client handler class That our final main.
- During order processing, this program can take 30-40 seconds per hamper depending on your machine.
    - This is due to a very lengthy and complex arithmetic operation (orders of ~2^20).
    - Multiple loading screens will appear during this process. Please wait for the loading screens to disappear on their own before continuing.

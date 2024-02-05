# Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

• Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.

• Optional fields: Not all customers provide complete information, but the constructor forces them to.

• Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.


Implement solution using the Builder Pattern to address the issue.

===== Problem Scenario Ends here =====

Your solution should include

1. Problem Scenario
2. UML Diagram
3. Source codes solution


# UML Diagram

(https![Blank diagram (12)](https://github.com/BabyleneRodriguez/softEng2_LabAss1_builderPattern/assets/142875371/726dd182-80e6-4356-a3f3-b93773f48ce1)



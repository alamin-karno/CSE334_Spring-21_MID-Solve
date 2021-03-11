# CSE334_Spring-21_MID-Solve

Do you know the secrete of your student id? Your student id has some inner meaning. For 
example, one student having this student id (182-15-12345). Every number separated by the 
hyphen (-) has some special meaning. Let me explain you one by one. The first portion contains 
182. The first two digits (18) indicates in which year a student has admitted and the last digit (2) 
indicates the semester. So, 182 means a student has admitted into DIU in summer 2018. Now 
come to the second portion, which contains 15. This is the code of the department of CSE. Every 
department in DIU has a unique department code. Moreover, the last portion contains 12345, is 
the student number of that student. Department Codes and Semester mapping are given below.
Now your job is to design an android application which will contain two activities
named StartActivity and InfoActivity. In the StartActivity, you will have three EditText
components and a button. First EditText component will suggest entering your Name, the
second one will suggest entering your student id (as string), and the third one will suggest you 
to entering your mobile number (as string). The button will be named as the “Go to Next” button. 
If you press the “Go to Next” button, you will be moved to the InfoActivity. Before going to the 
InfoActivity, it will pass your name, student id, and mobile number from the EditText 
components. The InfoActivity will contain one button named “Process Info” button and a 
TextView. After pressing the Process Info button, it will do some work in the background with 
the data it received from the StartActivity and show some text in the TextView. It will analyze the 
mobile number that has received from the StartActivity. Based on the last digit of the mobile 
number it will analyze the student id and show a message in the TextView. Samples are given 
below.Case Student id Message
If the last digit of the mobile 
number is Even
171-15-35124 Hasan has admitted in spring 
2017.
If the last digit of the mobile 
number is Odd
171-14-35124 Hasan has admitted in 
Software Engineering 
Department. 
*** Here “Hasan” is a random name. You have to use the name that will be taken as an input 
from StratActivity. And also mention your phone number on the top of your UI design
Now answer the following questions according to the above scenario: 
1. Briefly describe component of of Android app with easy example(don’t try to copy ). [05]
2. Draw the UI of the proposed APP with all proper details (indicate view type and view id 
name of both activities) and Write down the XML code of all the activities. [10]
3. Write down the Java code of all the activities. [10]
Semester Mapping:
Number Semester Name
1 Spring
2 Summer
3 Fall
Example: 183 Means Fall 2018
Department Codes:
Department Name Department Code
CSE 15
Software Engineering 14
BBA 13
English 12
Pharmacy 1

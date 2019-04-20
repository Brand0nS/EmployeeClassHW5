# EmployeeClassHW5
HW5-EmployeeClass
Assignment 5- This assignment can be submitted as many times as you want.  

However, only the last submission will be graded.  The earlier versions will not be graded.  
So make sure that your final submission works and produces the correct results.  Please do 
not cheat or copy. Write  a  program  to  enter  employee  data  into  an  ArrayList  of  type  Employee.  
The  dataincludes employee name,  employee Social Security Number,  employee job title,  and employeesalary.  
The  maximum  number  of  employees  is  100,  but  your  program  should  work  for  anynumber of employees less than 100. 
Your program should use two exception classes, one calledSSNLengthException for Social Security number 
entered - without dashes or spaces - is not ex-actly nine characters and the other SSNCharacterException 
for when any character in the SocialSecurity number is not a digit.  When an Exception is thrown, the user 
should be reminded ofof what he or she entered, told why it is inappropriate, and asked to reenter the data.  
After all data has been entered, your program should display the records for all employees, with anannotation stating 
whether the employee’s salary is above or below the average.  You will alsoneed to define the classes Employee,
SSNLengthException, SSNCharacterException.Derive the Employee class from the Person class.  The Person class should
have name andSocial Security Number, the date hired as the instance variables.The Employee class should have salary 
and position title as instance variables.  If you wantto add address, you need to define an Address class and include 
the Address object as instancevariable  in  the  Employee  class.   You  need  to  include  default  and  
four  or  five  parameter  con-structor (two for name, and SSN and the rest for Employee class), 
getter or accessor methods,mutator or setter methods.Every Employee record should record employee’s name, 
Social Security Number, address(optional),position title, salary, and hireDate.In  theEmployeeRecordclass, 
you  need  to  define  a  method  that  removes  the  hyphensfrom the Social Security number or uses Regex 
pattern to verify that there are correct numberof  digits.   Another  method  to  check  that  there  is  no  
character  in  place  of  a  digit.   So  in  thestatic main method of this class, use try - catch blocks to catch 
any Exceptions.  
The methodsisValidLength() and isValidDigits() should both include throws clause in the header line.

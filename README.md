# Railway-ticket-reservation

				Train ticket reservation application with thakkal 

## Modules:<br>
	1.Login
	2.Passenger 
	3.Admin

## 1.Login module<br>
     1.Passenger login:<br>
	     Get the name of passenger,
	     Get the password,
	     Password length should be greater than 8 characters.
   2.Admin login:<br>
	     Here,Only one admin is available,
	     After give the admin name and admin password,You can enter into admin module.

## 2.Passenger module:<br>
   1.Book:<br>
	    In book tickets,there are two types:<br>
	       1.Normal tickets<br> 2.Thakkal tickets<br><br>
	    1.Normal Tickets:<br>
	       First of all, passenger can search the train based on their  respective source and destination.
	       After saw the trains,we can give trainId  to book train tickets.
	       Passenger must give their name,age,prefered berth to book tickets.
	       Passenger details also added to the hashmap.<br>
	       There  are 5 tickets available:
		         Upper seats,lower seats,middle seats,waiting list,rac<br>
	   2.Thakkal tickets:<br>
	       Thakkal tickets will open only before the train date.
	       Passenger must give their name,age,prefered berth to book tickets.
	       Passenger details also added to the hashmap.
	       if we will book thakkal tickets,thakkal ticket are available.<br><br>
   2.Show trains:<br>
	      In this module,We can see the all trains.<br><br>
   3.Cancel:<br>
	       To cancel tickets,we should give trainId and passengerId.
	       After the cancel ticket,passenger details will be removed from the hash map.
	       preferred berth and seats will be increase in this trainId.<br><br>
	    
## 3.Admin:<br>
   1.Show all trains:<br>
    	 Here,we can see all trains.<br>
   2.Add train:<br>
	     Admin can add trains into  repository<br>
   3.Remove trains:<br>
	     Admin can remove specified train.<br><br>
	 
Pojo classes:<br>
   1.Train,<br>
   2.Passenger.<br><br>
   
Video explanation link:https://youtu.be/TN8A63t5-Zc

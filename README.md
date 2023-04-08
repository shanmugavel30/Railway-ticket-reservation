# Railway-ticket-reservation


				Train ticket reservation application with thakkal 
				
 video explanation link:

## Modules:
	1.Login
	2.Passenger 
	3.Admin

## 1.Login module:
     1.Passenger login:
	     -->Get the name of passenger,
	     -->Get the password,
	     -->Password length should be greater than 8 characters.
     2.Admin login:
	     -->Here,Only one admin is available,
	     -->After give the admin name and admin password,You can enter into admin module.

## 2.Passenger module:<br>
      1.Book:<br>
	    In book tickets,there are two types:
	       1.Normal tickets
	       2.Thakkal tickets
	    1.Normal Tickets:
	       -->First of all, passenger can search the train based on their  respective source and destination.
	       -->After saw the trains,we can give trainId  to book train tickets.
	       -->Passenger must give their name,age,prefered berth to book tickets.
	       -->Passenger details also added to the hashmap.<br>
	       -->There  are 5 tickets available:
		         Upper seats,lower seats,middle seats,waiting list,rac<br>
	   2.Thakkal tickets:
	       -->Thakkal tickets will open only before the train date.
	       -->Passenger must give their name,age,prefered berth to book tickets.
	       -->Passenger details also added to the hashmap.
	       -->if we will book thakkal tickets,thakkal ticket are available.
	       
       2.Show trains:
	    -->In this module,We can see the all trains.
	    
       3.Cancel:
	    -->To cancel tickets,we should give trainId and passengerId.
	    -->After the cancel ticket,passenger details will be removed from the hash map.
	    -->preferred berth and seats will be increase in this trainId.
	    
## 3.Admin:
       1.Show all trains:
    	    -->Here,we can see all trains.
       2.Add train:
	    -->Admin can add trains into  repository.
       3.Remove trains:
	    -->Admin can remove specified train.
	 
## Pojo classes:<br>
   1.Train,<br>
   2.Passenger.<br><br>
   
	link:https://youtu.be/TN8A63t5-Zc
  

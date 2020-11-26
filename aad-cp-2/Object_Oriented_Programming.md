<p align="center">
  <img src="https://scontent.fccu7-1.fna.fbcdn.net/v/t31.0-8/18121241_768124670017867_855626279729345474_o.png?_nc_cat=103&ccb=2&_nc_sid=cdbe9c&_nc_ohc=PKiRQBDs9PMAX9PfdxQ&_nc_ht=scontent.fccu7-1.fna&oh=d8e2201f79ef659750c35a62007c02ad&oe=5FE172FB" width=600px />
</p>
<h1><p align="center">Object Oriented Programming</p></h1>
<br/>
Most of you might have heard this term Object Oriented Programming while trying to learn a programming language. So, what exactly is this thing? Is it of any importance? Do we even need Object Oriented programming? Lets take a look into this.
<br/>
<h3>Various Programming Paradigms</h3>
<hr/>
Paradigm basically refers to a way of doing things. A programming paradigm defines the methodology of designing and implementing programs using the key features and other building blocks (such as key-words, etc.) of a programming language. So, a programming paradigm would give you an idea about the logic of a program i.e. how problems are generally analysed and solved in a particular programming language.
<img src="https://miro.medium.com/max/5514/1*Auy48pC39ps3AXEk-9WseA.png" width=600px align="right" />
<br/>
So, why did I talk about programming paradigms because this is where the concept and idea of Object Oriented programming begins. Object Oriented Programming (commonly known as OOP) or Procedural Oriented Programming(commonly known as POP) as nothing but different paradigms. So, lets take a look into what these two things namely OOP and POP actually mean.
<h3>Procedural Programming</h3>
<hr/>
Procedural Programming is a type of programming paradigm that lays more emphasis on procedure rather than on data. Procedural programming is basically used in programming languages such as c, Fortran, Pascal etc.
<br/>
Some advantages of Procedural programming paradigms are - 
<ul>
<li>It is highly structured</li>
  <li>It makes it easy to keep a track of program flow</li>
  <li>It is quite simple and easy to implement</li>
</ul>
Procedural programming paradigm separates the functions and data manipulated by them. Now this leads to many problems when it comes to extending software or maintaining software. This is explained as follows - 
<ul>
  <li>Procedural programming is susceptible to design changes</li>
  </ul>
  For example take a look at this code snippet - 
 

 
  ```C++
  struct employer {
  int empid;
  char name[100];
  char post;
  }
```

Now the members of the structure can be manipulated within the program as - 

```C++
  void reademployee(employer e1){
  cout<<"Enter id";
  cin>>e1.empid;
  cout<<"Enter Name";
  gets(e1.name);
  cout<<"Enter post";
  cin>>e1.post;
  }
```

Now if due to some reasons the structure employee needs to be changed and a new member employee number needs to be added - 
 ```C++
  struct employer {
  int empid;
  char name[100];
  char post;
  int empno;
  }
```

Now the manipulating fuction reademployee also needs to be rewritten. So, this is where it becomes hectic. Now imagine a program having huge numbers of structures and fuctions modifying them. Everytime the structure is modified the respective functions modifying them are needed to be changed.
<br/>
<ul>
  <li> Also procedural programming leads to increased time and cost overheads during design changes.</li>
</ul>
<h3>Object Oriented Programming</h3>
<hr/>

  *""Object-oriented programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code: data in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods).""*
  
<p align="right">-Wikipeida</p>

Object oriented programming gives more emphasis on objects. In OOP data and its assiciated functions are enclosed within a single entity - a class. Some benefits of OOP are - 
<ul>
  <li>Object based programming localizes the implementation details</li>
</ul>
Object oriented programming is a lot helpful when it comes up to the point of localization of implementation details. Let's take a look-

```C++
  class employer {
  int empid;
  char name[100];
  char post;
  int empno;
  
  public:
        void reademployee();
        void removeemployee();
  }
```
Don't get confused between a structure and a class. If you don't know the differences between a structure and a class. A class is basically a structure and it can even hold functions in it. And only declarations under public make the user interface. That's all that you need to know for now about structure and classes.
So, by now you might have the above code snippet similar to the one we had discussed in POP. The only difference being the member functions being present inside the class. Now, let me show you the beauty of OOP.

What if you need to add another field salary to class employer? Let's do it- 

```C++
  class employer {
  int empid;
  char name[100];
  char post;
  int empno;
  int salary;
  public:
        void reademployee();
        void removeemployee();
  }
```
So as you can see changes have been made to the class employer but whats the difference. The difference is the fact that the user would never know about the new field that has been added as the user can only view the public part. But now what about the funtion definitons, is it required to change them as well? Yes, it is necessary but now the point being that the changes are now localized to the definition of the changed function and the user cannot see them.

<ul>
  <li>OOP overcomes most shortcoming and drawbacks of POP</li>
  <li>OOP supports user-defined types</li>
  <li>OOP implements information hiding and abstraction,etc.</li>
</ul>

<h3>Basic concepts of OOP</h3>
<hr/>
The general concepts of OOP are - 
<ul>
  <li>Data Abstraction</li>
  <li>Data Encapsulation</li>
  <li>Modularity</li>
  <li>Inheritance</li>
  <li>Polymorphism</li>
</ul>
But before dicussing the basic concepts lets take a look into what classes and objects are. Why are we discussing them? This is because of the fact which i mentioned earlier i.e. 

**In OOP data and its assiciated functions are enclosed within a single entity - a class.**

<h3>Objects:-</h3>

*""An object is an identifable entity with some characteristics and behaviour""*

<img src="https://raw.githubusercontent.com/andrejrs/Object-Oriented-PHP/master/images/Wordane-OOP-car-class-eg-2.jpg" align="right"/>

To understand objects more clearly lets condider an example- Lets say a car is an object. So, we can say its characteristics are - It's green, It's a Ford Mustang and runs on gasoline. Similarly Objects are an entity that store data, have some characteristics and behaviour.
<br/>

<h3>Class:-</h3>

*""A class is a group of objects that share common properties and relationships""*

Let's consider the above example of objects. The different models Ford mustang, Toyota prius, Volkswagon polo are nothing but are different models of CARS. So, all these models of cars or what we can say Objects that share common properties are grouped under CARS or what we can say a class.

<br/>
Now let's discuss the basic concepts of OOP-
<ul>
  <li><h3>Data Abstraction:-</h3></li>
</ul>


*""Abstraction refers to the act of representing essential features without including the background details or explanations""*

So, data abstraction is all about acknowledging the user with the necessary details required. Let's consider an example -

<a href="https://imgbb.com/"><img align="right" src="https://i.ibb.co/SQknbzG/abstraction.jpg" alt="abstraction" border="0"></a><br />

What do you enquire when you buy a vehicle? Of course you want to know the specifications of the vehicle like model, size, color etc. But do you ever enquire any details such as wiring, motor working etc. ?. This is what data abstraction actually means. The user only sees the essential things, and the other things that are not required by the user are hidden.

<br/>
<br/>
<br/>
<br/>

<ul>
  <li><h3>Encapsulation:-</h3></li>
</ul>


*""The wrapping up of data and operations/functions (that operate on the data) into a single unit (called class) is known as Encapsulation""*

<img align="right" src="https://miro.medium.com/max/559/1*CLBzWEo22SXvh-0dT3eV_w.png" width="450px"/>

Encapsulation is the way of combining both data and the functions that operate on data under a single unit. Encapsulation can be best described by the diagram beside- the capsule is basically interpreted as a class containing or encapsulating different members and member functions. 
Now, you may wonder whats the difference between data abstraction and encapsulation? The answer is simple - Encapsulation is a way to implement data abstraction. Encapsulation hides the details of the implementaion of an object.

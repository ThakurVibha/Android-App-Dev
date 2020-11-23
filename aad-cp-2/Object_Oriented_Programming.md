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

Object oriented programming gives more emphasis on objects. In OOP data and its assiciated functions are enclosed within a single entity - a class. Some benefits of OOP over POP are - 
<ul>
  <li>Object based programming is not as suceptible to design changes as POP</li>
</ul>


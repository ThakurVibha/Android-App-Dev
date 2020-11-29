#include <iostream>

using namespace std;

class Employer{
    private:                        //Data abstraction, Encapsulation, Data Hiding
            int empid=1234432;
            int empno=1;
            string empname="Abhishek";
    public:
            void details(){
                cout<<"Name:"<<empname<<"\n";
                cout<<"ID:"<<empid<<"\n";
                cout<<"Employer No:"<<empno<<"\n";
            }
    
};
class SubEmployer:Employer{         //Inheritance
    private:                        
            int empid1=12342232;
            int empno1=2;
            string empname1="Trideep";
    
    public:
            void detailsFinal(){
                details();
                cout<<"Name:"<<empname1<<"\n";
                cout<<"ID:"<<empid1<<"\n";
                cout<<"Employer No:"<<empno1;
            }
            void poly(int x){                                       //Polymorphism using function overloading
                cout<<"Used function poly in one way:"<<x<<"\n";
            }
            void poly(double x){
                cout<<"Used function poly in another way:"<<x<<"\n";
            }
            void poly(string x){
                cout<<"Used function poly in yet another way:"<<x<<"\n";
            }
    
};
int main() //Driver Function
{
    SubEmployer emp;
emp.detailsFinal();
cout<<"Illustrated Polymorphism using Function overloading"<<"\n";
emp.poly(6);
emp.poly(7.8);
emp.poly("Polymorphism");
    return 0;
}

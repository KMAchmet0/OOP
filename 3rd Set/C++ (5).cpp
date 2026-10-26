#include <iostream>
#include <string>
using namespace std;

class Shape {
 protected:
 int points;
 double lenght;
 public:
 void set_values (int a, double b)
 {points = a; lenght = b ; }

};

class Rectangle: protected Shape {
public:

int points= 4;
int getArea()
{return (points*lenght)/2;}

};

class Triangle: protected Shape {
public:
int points= 3;
int getArea()
{return (points*lenght)/2;}
};

class Circle: protected Shape {
public:
int points= 1;
int getArea()
{return (points*lenght)/2;}
};

int main()
{
 Shape s;
 Rectangle r(2);
 Triangle t(3);
 Circle c(4);
 cout<<s.getClass()<<endl;
 cout<<r.getArea()<<endl;
 cout<<t.getArea()<<endl;
 cout<<c.getArea()<<endl;
 return 0;
}




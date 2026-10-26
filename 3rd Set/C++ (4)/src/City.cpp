#include <iostream>
#include <string>
using namespace std;
int main()
{
 string city = "";
 int population = 0;
 double area = 1;
 bool more = true;
 while (more)
 {
 string city2;
 int population2;
 double area2;
 cout << "Please enter city name: ";
 getline(cin, city2);
 cout << "Please enter city population: ";
 cin >> population2;
 cout << "Please enter city area in km^2: ";
 cin >> area2;
 string remainder; /* read remainder of line */
 getline(cin, remainder);
 if (population2 / area2 > population / area)
 {
 population = population2;
 area = area2;
 city = city2;
 }
 cout << "More data? (y/n) ";
 string answer;
 getline(cin, answer);
 if (answer != "y") more = false;
 }
 cout << "The densest city is: " << city
 << " (population density: " << population/area << "people per km^2)\n";
 return 0;
}

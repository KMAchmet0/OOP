#include <iostream>
#include <string>
using namespace std;
//προσθέστε τον ορισμό της κλάσης City
int main()
{
 City c1;
 c1.input();
 bool more = true;
 while (more)
 {
 City c2;
 c2.input();
 if (c2.isDenserThan(c1)) c1 = c2;
 cout << "More data? (y/n) ";
 string answer;
 getline(cin, answer);
 if (answer != "y") more = false;
 }
 cout << "The densest city is: ";
 c1.show();
 return 0;
}

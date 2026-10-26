#include<iostream>
using namespace std;


class Kouti
{
    private:
        double length;
        double breadth;
        double height;

    public:
        void GetSize(double lngh,double bth,double hgt)
        {
            length=lngh;
            breadth=bth;
            height=hgt;
        }
        double calculateOgkos()
        {
            return length*breadth*height;
        }
        void setMikos(double mikos)
            {
                length = mikos;
            }
        void setPlatos(double platos)
            {
                breadth = platos;
            }
        void setYpsos(double ypsos)
            {
                height = ypsos;
            }

        Kouti operator+(const Kouti& b)
        {
        Kouti kouti;


        kouti.length = this->length + b.length;
        kouti.breadth = this->breadth + b.breadth;
        kouti.height = this->height + b.height;
        return kouti;
        }

};
int main()
{
        Kouti KoutiA;
        KoutiA.GetSize(2.0,3.2,6.0);
        cout << "To apotelesma tou ogkou A =  " << KoutiA.calculateOgkos() << endl;



        Kouti KoutiB;
        KoutiB.GetSize(2.5,4.0,5.0);
        cout << "To apotelesma tou ogkou B =  " << KoutiB.calculateOgkos() << endl;






        Kouti KoutiC;
        KoutiC = KoutiA + KoutiB;
        cout << "To apotelesma tou ogkou C =  " << KoutiC.calculateOgkos() << endl;

return 0;
}

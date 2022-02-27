#include <iostream>
using namespace std;
class base
{

    int a;

public:
    int b;
    void setdata();

    int getdata();

    int getdata1();
};




void base ::setdata()
{
    a = 10;
    b = 20;
}
int base ::getdata()
{

    return a;
}
int base ::getdata1()
{
    return b;
}

/*                        public       private          protected derivation

private                  no             no                no  

public                   public       private             protected

protected               protected     private             protected
*/



class derived :public base
{
    int c;

public:
    int process();

    void display();
};
int derived ::process()
{
    c = b * getdata();
   
}
void derived::display()
{
    cout << "the value of a " << getdata() << endl;
    cout << "the value of b " << b << endl;
    cout << "the value of c " << c << endl;
}
int main()
{

    derived a;
    a.setdata();
    a.process();
    a.display();
}
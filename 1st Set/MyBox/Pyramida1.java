public class Pyramida1 extends MyBox
{
    boolean flag = true;
    double plevra,ypsos;
    Pyramida1(double plevra,double ypsos)
    {
        super(ypsos,plevra,plevra);
        
        if(plevra>0 && ypsos>0){
                    this.plevra =this.plevraA;
                    this.ypsos =ypsos;}
                    else{
                        this.flag=false;}
                    }
    public String toString(){
        if(this.flag==false)
        {return "Error";
        }
        else
        { return " Correct pyramid=" +compute()+"epifaneiaVasis" +epifaneiaVasis();
        }
    }
double compute(){
    return (plevra*plevra*ypsos)/3;

}
double epifaneiaVasis(){
    return (plevra*plevra);
}
}
    
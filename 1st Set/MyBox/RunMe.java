
class RunMe extends MyBox
public static void main(String[] args) {
MyBox cube  =new MyBox(1);
MyBox kouti = new MyBox(3,1,2);
Pyramida1 pyramida1 = new Pyramida1 (6,1);
MySmallBox mySmallBox= new MySmallBox(2,1,1,5);






System.out.println(“myBox:” + “plevraA ” +cube.plevraA+ “plevraB:” +cube.plevraB+ “ypsos” + cube.ypsos+ “EpifaneiaVasis” +cube.epifaneiaVasis());     
System.out.println(“myBox:” + “plevraA ” +kouti.plevraA+ “plevraB:” +kouti.plevraB+ “ypsos” + kouti.ypsos+ “EpifaneiaVasis” +kouti.epifaneiaVasis()); 
System.out.println(“pyramida” +  “EpifaneiaVasis” +pyramida.epifaneiaVasis());
System.out.println(“MySmallBox;” + “EpifaneiaVasis” +mySmallBox.epifaneiaVasis() “Varos” +mySmallBox.varos);
}
}

package java_github_practice;

public class Inheritance {

    //Dairenin alanını hesalayan bir method oluşturunuz.(matematik işlemleri için inheritance kullanınız)
    public static void main(String[] args) {

        daireAlani(5);
        daireAlani(3);

    }

    static void daireAlani(int r){

        Daire daireObjesi = new Daire();
        System.out.println(daireObjesi.carpma(daireObjesi.piSayisi,daireObjesi.karesiniAl(r)) );

    }

}


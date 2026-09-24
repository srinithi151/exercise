class product{
    String productname;
    int productnumber;
    int price;
    product(String productname,int productnumber,int price){
        this.productname=productname;
        this.productnumber=productnumber;
        this.price=price;

    }
    void information(){
       System.out.println("Productname:"+productname);
       System.out.println("Productnumber:"+productnumber);
       System.out.println("Price:"+price); 
    }

}
class Ecommerce{
    public static void main(String[]args){
        product p1=new product("dailymilk",50,120);
        product p2=new product("kit kat",51,100);
        p1.information();
        p2.information();

    }
}
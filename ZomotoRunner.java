class ZomotoRunner{
	
public static void main(String[] args){
 int price=0; 
 
 price=Zomoto.checkItem("Hoskote Biriyani");
 System.out.println("for one plate:"+price);
 
 int totalPrice=Zomoto.checkItem("Hoskote Biriyani",price,90); 
System.out.println("toatlPrice:"+totalPrice);
 } 
 } 
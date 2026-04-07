class Zomoto{

static int checkItem(String foodItem){
int price=0;
if("Hoskote Biriyani"==foodItem){
System.out.println("food Item is:"+foodItem);
price=90;
return price;
}else if("manglore fish masala"==foodItem){
System.out.println("food Item is:"+foodItem);
price=100;
return price;
}else if("kabab"==foodItem){
System.out.println("food Item is:"+foodItem);
price=150;
return price;

}else if("chikan masala"==foodItem){
System.out.println("food Item is:"+foodItem);
price=170;
return price;
}else if("fish thava fry"==foodItem){
System.out.println("food Item is:"+foodItem);
price=70;
return price;
}else if("egg rice"==foodItem){
System.out.println("food Item is:"+foodItem);
price=50;
return price;
}else if("egg masala"==foodItem){
System.out.println("food Item is:"+foodItem);
price=80;
return price;
}else if("egg frid rice"==foodItem){
System.out.println("food Item is:"+foodItem);
price=60;
return price;
}else if("pannir masala"==foodItem){
System.out.println("food Item is:"+foodItem);
price=120;
return price;
}else if("roti"==foodItem){
System.out.println("food Item is:"+foodItem);
price=130;
return price;
}else if("dosa"==foodItem){
System.out.println("food Item is:"+foodItem);
price=80;
return price;
}else if("idli"==foodItem){
System.out.println("food Item is:"+foodItem);
price=40;
return price;
}else if("puri"==foodItem){
System.out.println("food Item is:"+foodItem);
price=30;
return price;
}else if("anna sambar"==foodItem){
System.out.println("food Item is:"+foodItem);
price=50;
return price;
}else if("curd rice"==foodItem){
System.out.println("food Item is:"+foodItem);
price=20;
return price;
}else{
	System.out.println("No item founds");
	return 0;
}
}

 static int checkItem(String foodItem, int price,int noItems){
int totalPrice=0;
if("Hoskote Biriyani"==foodItem){
totalPrice=price * noItems;
return totalPrice;
 }else if("manglore mio mio masala"==foodItem){
totalPrice=price * noItems;
return totalPrice;
 }else if("kabab"==foodItem){
totalPrice=price * noItems;
return totalPrice;
 }else if("chikan masala"==foodItem){
totalPrice=price * noItems;
return totalPrice;
 }else{
	 return 0;
 }
 }

}

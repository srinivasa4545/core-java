class AppRunner{
 public static void main(String[] app){ 
 
 App app1 = new App();
 
 app1.appName = "Instagram"; 
 app1.personName = "kushal";
 app1.email = "kushal@gmail.com";
 app1.phNo = 9874563898l; 
 app1.dob = "02-05-2006";
 app1.userName = "king_kushal_143"; 
 app1.password = "kushal@123"; 
 System.out.println("app1 Company Name:" + App.companyName); 
 System.out.println("app1 App Name:" + app1.appName); 
 System.out.println("app1 person Name:" + app1.personName); 
 
 
 App app2 = new App(); 
 
 app2.appName = "Instagram"; 
 app2.personName = "mohammed";
 app2.email = "mohammed@gmail.com";
 app2.phNo = 874512369l;
 app2.dob = "07-05-2005";
 app2.userName = "200%_IQ_mohammed";
 app2.password = "mohammed@123";
 System.out.println("app2 Company Name:" + App.companyName);
 System.out.println("app2 App Name:" + app2.appName);
 System.out.println("app2 person Name:" + app2.personName);
 }
 }

 class sun3{
    public static void main(String[]args){
    String f1="this is exercise 1";
    String f2="this is Exercise 1";
    int result= f1.compareToIgnoreCase(f2);
    if(result<0){
        System.out.println("f1 is greater");
    }
    else if(result>0){
        System.out.println("f2 is greater");
    }
      else{
        System.out.println(" f1,f2is equal");
      }
    }

    }


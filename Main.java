class Main {
  public static void main(String[] args) {
    int i ;
    System.out.println("You entered: ");
    for(i =0;i<args.length;i++){
        System.out.println(args[i]);
    }
    System.out.println("You entered " + i + " arguements");
  }
}
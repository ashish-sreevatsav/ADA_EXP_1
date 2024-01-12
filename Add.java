public class Add {
    public static void main(String[] args){
        if(args.length<1){
            System.out.println("Enter Valid number fo arguments");
        }
        else{
            System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
        }
    }
}

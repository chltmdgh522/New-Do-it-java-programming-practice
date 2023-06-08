public class Test {
    public static void main(String[] args) {
        try{
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public static void findClass() throws ClassNotFoundException{
        Class.forName("a");
    }
}

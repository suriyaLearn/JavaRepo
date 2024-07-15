public class Loops {

    public static void main(String[] args) {
        Loops obj = new Loops();
//        obj.forLoopDemo();
        obj.ifElseLoop();
    }

    public void forLoopDemo() {
        int random = 10;

        for (int i = 0; i < random; i++) {
            System.out.println(i);
        }
    }

    public void ifElseLoop(){
        String name = "sur";
        if(name.equals("smur")){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }

}

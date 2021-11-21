class A extends Thread{
    public void run(){
        for(int i=1;i<2;i++){
            System.out.println("Scoobythread");
            System.out.println("Shaggythread");
        }
    }
    class B{
        public static void main(String[] args) {
            A r=new A();
            Thread t1=new Thread(r);
            t1.start();

        }
    }

}
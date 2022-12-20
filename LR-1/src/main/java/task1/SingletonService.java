package task1;

class SingletonService {

    public void exec() {
        Conection connection1 = Conection.getInstance();
        Conection connection2 = Conection.getInstance();

        if (connection1.toString().contains(connection2.toString())){
            System.out.println("Singleton is working. connection is " + connection1.toString());
        }
        else {
            System.out.println("Singleton isn't working: connection 1 is " + connection1.toString() + " but connection 2 is " + connection2.toString());
        }
    }

}
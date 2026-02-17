public class Admin extends User {

    // TODO: constructor
    public Admin(String name,int userId){
        super(name,userId);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        // print admin managing message
        System.out.println(getName()+"упровляет"+s.getServiceName());

    }

    @Override
    public void useService(Service s) {

        // TODO:
        System.out.println(getName()+"использует"+s.getServiceName());
        s.performService();

    }
}
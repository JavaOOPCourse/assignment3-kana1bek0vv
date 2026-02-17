public class Customer extends User {

    // TODO: constructor
    public Customer(String name,int userId){
        super(name,userId);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        System.out.println(getName()+"Управление услугами доступно только администраторам");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print customer using message
        // call performService()
        System.out.println(getName()+"использует"+s.getServiceName());
        s.performService();

    }
}
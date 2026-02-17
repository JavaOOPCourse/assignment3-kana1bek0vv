import javax.xml.namespace.QName;

public abstract class Service {

    // TODO: declare private fields
    private  String serviceName;
    private int serviceId;
    private boolean isActive;


    // TODO: constructor
    public Service(String serviceName, int serviceId){
        this.serviceName=serviceName;
        this.serviceId=serviceId;
        this.isActive=false;
        }


    public void activateService() {
        isActive = true;
         System.out.println("active Massage");
    }


    public void deactivateService() {
        isActive= false;
        System.out.println("deactivation message");
    }


    // TODO: getter for serviceName

    public String getServiceName() {
        return serviceName;
    }



    public boolean isActive() {
        return isActive;
    }
// TODO: getter for isActive

    abstract void performService();

}
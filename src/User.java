public abstract class User {

    // TODO: declare fields
    // name
    // id
    private String name;
    private int id;

    public User(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    // TODO: constructor


    public abstract void manageService(Service s);


    public abstract void useService(Service s);

}
class User extends Account {

    public User(Integer id, String name, String document, String email,String password) {
        super(name,document);
        this.email = email;
        this.password = password;
        this.id = id;
    }

    void  printDataUser(){
        System.out.println("email: " + email + "\n" + "password: " + password);
    }

}

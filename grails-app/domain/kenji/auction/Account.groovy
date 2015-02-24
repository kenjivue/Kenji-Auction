package kenji.auction

class Account {
    Integer accountID
    String name
    String email
    String password
    List<Address> addresses
    Date dateCreated
    Date lastUpdated
    static hasMany = [addresses:Address]
    static constraints = {
        accountID (nullable:false, editable:false, unique: true)
        name(nullable: false)
        email(email: true)
        password(size:8..16, nullable: false,password:true)
        dateCreated(nullable: false)
        lastUpdated(nullable: false)
    }
}

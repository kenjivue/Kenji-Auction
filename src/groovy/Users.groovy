/**
 * Created by kenjivue on 2/20/15.
 * This is the base user class
 */
class Users {
    Long userid
    String firstname
    String lastname
    String email
    String password
    Date datecreated
    def constraints =
            {
                email(email:true)
                password(blank:false, password:true)
                firstname(blank:false)
                lastname(blank:false)
                datecreated(blank:false)

            }

}

package kenji.auction

class Delivery {
    String location
    static constraints = {
        location(nullable: false)
    }
}

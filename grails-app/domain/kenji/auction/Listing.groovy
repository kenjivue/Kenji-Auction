package kenji.auction

class Listing {
    String name
    String description
    Date startDate
    Integer listingDays
    Currency startingPrice
    Delivery deliverylocation
    static belongsTo = [Account]
    static constraints = {
        name(nullable: false)
        description(nullable: false)
        startDate(nullable: false)
        listingDays(nullable: false, min: 1)

    }
}

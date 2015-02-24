package kenji.auction

class Bid {
    Currency amount
    Date bidDate
    Account userAccount
    Listing bidListing
    static constraints = {
        amount (blank:false, nullable: false)
        bidDate(nullable:false,blank:false)
        userAccount(nullable: false)
        bidListing(nullable: false)
    }
}

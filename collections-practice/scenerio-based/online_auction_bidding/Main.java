package online_auction_bidding;

public class Main {
    public static void main(String[] args) {

        AuctionItem item = new AuctionItem("iPhone 15");

        User u1 = new User(1, "Rahul");
        User u2 = new User(2, "Amit");
        User u3 = new User(3, "Neha");

        try {
            item.placeBid(u1, 50000);
            item.placeBid(u2, 55000);
            item.placeBid(u3, 53000); // lower bid -> exception
        } 
        catch (InvalidBidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            item.placeBid(u3, 60000);
        } 
        catch (InvalidBidException e) {
            System.out.println(e.getMessage());
        }

        item.showAllBids();
        item.showHighestBid();
    }
}


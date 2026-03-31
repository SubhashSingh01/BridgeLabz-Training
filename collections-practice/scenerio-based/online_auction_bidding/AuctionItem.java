package online_auction_bidding;

import java.util.*;

class AuctionItem {
    private String itemName;
    private TreeMap<User, Bid> bids = new TreeMap<>();
    private double highestBid = 0.0;

    public AuctionItem(String itemName) {
        this.itemName = itemName;
    }

    public void placeBid(User user, double amount) throws InvalidBidException {
        if (amount <= highestBid) {
            throw new InvalidBidException(
                "Bid must be higher than current highest bid: ₹" + highestBid
            );
        }

        Bid bid = new Bid(user, amount);
        bids.put(user, bid);
        highestBid = amount;

        System.out.println(user.getName() + " placed bid: ₹" + amount);
    }

    public void showAllBids() {
        System.out.println("All Bids for " + itemName + ":");
        for (Bid bid : bids.values()) {
            System.out.println(bid);
        }
    }

    public void showHighestBid() {
        if (bids.isEmpty()) {
            System.out.println("No bids yet.");
            return;
        }

        Bid highest = null;
        for (Bid bid : bids.values()) {
            if (highest == null || bid.getAmount() > highest.getAmount()) {
                highest = bid;
            }
        }

        System.out.println("Highest Bid:");
        System.out.println(highest);
    }
}


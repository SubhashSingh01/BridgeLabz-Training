package online_auction_bidding;

class User implements Comparable<User> {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User u) {
        return this.userId - u.userId; // sorting by userId
    }

}


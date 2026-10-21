
import java.util.*;

class Twitter {

    Map<Integer, Set<Integer>> following;
    Map<Integer, List<int[]>> tweets;
    int time;

    public Twitter() {
        following = new HashMap<>();
        tweets = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId, new ArrayList<>());
        tweets.get(userId).add(new int[]{time++, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        List<int[]> allTweets = new ArrayList<>();

        // Include the user's own tweets
        if (tweets.containsKey(userId)) {
            allTweets.addAll(tweets.get(userId));
        }

        // Include tweets from followed users
        if (following.containsKey(userId)) {
            for (int followee : following.get(userId)) {
                if (tweets.containsKey(followee)) {
                    allTweets.addAll(tweets.get(followee));
                }
            }
        }

        // Sort newest tweets first
        allTweets.sort((a, b) -> Integer.compare(b[0], a[0]));

        List<Integer> feed = new ArrayList<>();

        for (int i = 0; i < Math.min(10, allTweets.size()); i++) {
            feed.add(allTweets.get(i)[1]);
        }

        return feed;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }

        following.putIfAbsent(followerId, new HashSet<>());
        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}

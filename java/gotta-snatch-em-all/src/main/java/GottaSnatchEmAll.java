import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
      return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
      return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
      int totalCards = myCollection.size() + theirCollection.size();
      boolean myCollectionIsPopulated = !myCollection.isEmpty();
      boolean theirCollectionIsPopulated = !theirCollection.isEmpty();
      myCollection.retainAll(theirCollection);
      return myCollectionIsPopulated && theirCollectionIsPopulated && (myCollection.size() != totalCards/2);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
      int numberCollections = collections.size();
      Set<String> cards = new HashSet<>();
      List<String> allCards = new ArrayList<>();
      collections.forEach(collection -> {
        cards.addAll(collection);
        allCards.addAll(collection);
      });
      cards.removeIf(card -> {
        long count = allCards.stream().filter(card::equals).count();
        return count < numberCollections;
      });
      return cards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
      Set<String> cards = new HashSet<>();
      collections.forEach(collection -> {
        cards.addAll(collection);
      });
      return cards;
    }
}

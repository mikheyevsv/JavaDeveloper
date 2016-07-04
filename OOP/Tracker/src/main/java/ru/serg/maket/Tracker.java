package ru.serg.maket;

import java.util.Random;

/**
 * @author Serg on 11.03.2016.
 * Create Tracker
 */
public class Tracker {

    /**
     * Position in array items.
     */

    private int position = 0;
    private int bidposition = 0;

    /**
     * Array Item on five actions.
     */

    private Item[] items = new Item[5];
    private Bid[] bids = new Bid[2];
    private static final Random RAND = new Random();


    public Tracker() {
    }

    /**
     *
     * @param item
     * @return Item.
     */

    public Item addItem(final Item item) {
        item.setId(generateID());
        this.items[position++] = item;
        return item;
    }

//    public Bid addBid(final Bid bid) {
//        bid.setId(generateID());
//        this.bids[bidposition++] = bid;
//        return bid;
//    }

    /**
     *
     * @param id
     * @return result deleted id.
     */

    public Item deleteItem(final String id) {
        Item res = null;
        for (Item item : items) {
            if (item != null && item.equals(this.findById(id))) {
                res = item;
                break;
            }
        }
        return res;
    }

//    public Bid deleteBid(final String bidId) {
//        Bid res = null;
//        for (Bid bid : bids) {
//            if (bid != null && bid.equals(this.findById(bidId))) {
//                res = bid;
//                break;
//            }
//        }
//        return res;
//    }

    /**
     *
     * @param newItem
     */

    public void editItem(final Item newItem) {
        for (int index = 0; index != items.length; ++index) {
            Item item = items[index];
            if (item != null && item.getId().equals(newItem.getId())) {
                items[index] = newItem;
                break;
            }
        }
    }

//    public void updateBid(Bid newBid) {
//        for (int index = 0; index != bids.length; ++index) {
//            Bid bid = bids[index];
//            if (bid != null && bid.getId().equals(newBid.getId())) {
//                bids[index] = newBid;
//                break;
//            }
//        }
//    }

    /**
     * Seartch Item by id.
     * @param id .
     * @return Item.
     */

    public Item findById(String id) {
        Item res = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                res = item;
                break;
            }
        }
        return res;
    }


    /**
     * Generate id.
     * @return id as string.
     */

    public String generateID() {
        return String.valueOf(System.currentTimeMillis() + RAND.nextInt());
    }


    /**
     *
     * @return Array Item
     */

    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

//    public Bid[] getAllBid() {
//        Bid[] result = new Bid[this.bidposition];
//        for (int index = 0; index != this.bidposition; index++) {
//            result[index] = this.bids[index];
//        }
//        return result;
//    }
}

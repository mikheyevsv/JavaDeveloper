package ru.serg.maket;

/**
 * @author Serg
 * Created Item
 */
public class Item {
    /**
     * name Item.
     */

    private String name;

    /**
     * deskription Item.
     */

    private String deskription;
   // private long create;

    /**
     *  id Item
     */

    private String id;

    /**
     * Constructor
     * @param name
     * @param deskription
     * @param id
     */

    public Item(String name, String deskription, String id) {
        this.name = name;
        this.deskription = deskription;
        this.id = id;
    }


    public Item(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeskription() {
        return deskription;
    }

    public void setDeskription(String deskription) {
        this.deskription = deskription;
    }

//    public long getCreate() {
//        return create;
//    }

//    public void setCreate(long create) {
//        this.create = create;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package ru.serg;

import java.util.*;

/**
 * This class implements the menu.
 * @author Serg
 */
public class Menu implements Select, Input {

    private String description;
    private String menuId;
    private boolean isSected;

    /**
     * default Constructor.
     */
    public Menu(){}

    /**
     *
     * @param description
     * @param menuId
     */
    public Menu(String description, String menuId){
        this.description = description;
        this.menuId = menuId;
    }

    public String getDescription() {
        return description;
    }

    public String getMenuId() {
        return menuId;
    }



    /**
     *
     method builds a menu.
     * @param menus
     * @return
     */
    private  Map<String, Set<String>> buildMenuMap(List<Menu> menus){
        final Map<String, Set<String>> menuMap = new HashMap<String, Set<String>>();
        for (Menu menu : menus) {
            if(!menuMap.containsKey(menu.getMenuId())){
                menuMap.put(menu.getMenuId(), new HashSet<String>());
            }
            menuMap.get(menu.getMenuId()).add(menu.getDescription());
        }
        return menuMap;
    }

    /**
     * method displays a menu in a tree.
     * @param root
     * @param level
     * @param menuMap
     */
    private void showMenu(String root, int level, Map<String, Set<String>> menuMap) {
        if (menuMap.containsKey(root)) {
            for (String name : menuMap.get(root)) {
                if (level > 0) {
                    System.out.printf("%" + level * 2 + "s%s%n", "", name);
                } else {
                    System.out.println(name);
                }
                showMenu(name, level + 1, menuMap);
            }

        }
    }

    /**
     * @inheritDoc Input.
     * @param menus
     */
    public void printMenu(List<Menu> menus){
        final Map<String, Set<String>> printMenuMap = buildMenuMap(menus);
        showMenu(null, 0, printMenuMap);
    }

    /**
     * @inheritDoc Select.
     * @return
     */
    public boolean isSelect() {
        return this.isSected;
    }
}

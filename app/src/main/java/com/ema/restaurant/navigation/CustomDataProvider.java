package com.ema.restaurant.navigation;


import android.content.Context;

import com.ema.restaurant.R;

import java.util.ArrayList;
import java.util.List;


public class CustomDataProvider {

    private static final int MAX_LEVELS = 3;

    private static final int LEVEL_1 = 1;
    private static final int LEVEL_2 = 2;
    private static final int LEVEL_3 = 3;
    private static List<BaseItem> mMenu = new ArrayList<>();
    Context context;

    public static List<BaseItem> getInitialItems() {
        //return getSubItems(new GroupItem("root"));

        List<BaseItem> rootMenu = new ArrayList<>();

        rootMenu.add(new Item("Home", R.drawable.ic_home_black_24dp));
        rootMenu.add(new GroupItem("Menu", R.drawable.ic_menu2));
        rootMenu.add(new Item("Orders", R.drawable.ic_assignment_black_24dp));
        rootMenu.add(new Item("Coupons", R.drawable.ic_error_black_24dp));
        rootMenu.add(new Item("Account", R.drawable.ic_widgets_black_24dp));
        rootMenu.add(new Item("Feedback", R.drawable.ic_help_black_24dp));
        return rootMenu;
    }

    public static List<BaseItem> getSubItems(BaseItem baseItem) {

        List<BaseItem> result = new ArrayList<>();
        int level = ((GroupItem) baseItem).getLevel() + 1;
        String menuItem = baseItem.getName();

        GroupItem groupItem = (GroupItem) baseItem;
        if (groupItem.getLevel() >= MAX_LEVELS) {
            return null;
        }

        if (level == LEVEL_1) {
            switch (menuItem.toUpperCase()) {
                case "CATEGORY":
                    result = getListCategory();
                    break;
                case "MENU":
                    result = getListMenu();
                    break;
            }
        }
        return result;
    }

    public static boolean isExpandable(BaseItem baseItem) {
        return baseItem instanceof GroupItem;
    }

    private static List<BaseItem> getListCategory() {
        List<BaseItem> list = new ArrayList<>();
        list.add(new Item("Category-1"));
        list.add(new Item("Category-2"));
        list.add(new Item("Category-3"));
        return list;
    }

    private static List<BaseItem> getListMenu() {
        List<BaseItem> list = new ArrayList<>();
        list.add(new Item("Pizza"));
        list.add(new Item("Hamburgers"));
        list.add(new Item("Kebabs"));
        list.add(new Item("Pasta"));
        return list;
    }
}

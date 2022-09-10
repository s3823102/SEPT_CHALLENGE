package com.SEPT.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.SEPT.demo.model.ftModel;

@Component
public class ftDao {

    private static int i = 0;

    private static List<ftModel> items = new ArrayList<>();

    public ftModel createItem(ftModel item) {
        if (item.getId() == 0) {
            item.setId(++i);
        }

        items.add(item);
        return item;
    }

    public ftModel getItem(int id) {
        Predicate<? super ftModel> predicate = item -> item.getId() == id;
        return items.stream().filter(predicate).findFirst().orElse(null);
    }

    public List<ftModel> getAllItems() {
        return items;
    }

    public String updateItem(ftModel item) {
        boolean itemFound = false;
        for (ftModel currentItems : items) {
            if (currentItems.getName().equals(item.getName())) {
                itemFound = true;
                currentItems.setDesc(item.getDesc());
                currentItems.setRate(item.getRate());
            }
        }
        if (itemFound == false) {
            item.setId(++i);
            items.add(item);
        }
        return "Item Updated";
    }

    public void deleteItem(String name) {
        Predicate<? super ftModel> predicate = item -> item.getName().equals(name);
        items.removeIf(predicate);
    }

}

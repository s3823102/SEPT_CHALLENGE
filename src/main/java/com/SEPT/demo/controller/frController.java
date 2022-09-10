package com.SEPT.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SEPT.demo.dao.ftDao;
import com.SEPT.demo.model.ftModel;

@RestController
public class frController {

    private ftDao itemsDao;

    frController(ftDao itemsDao) {
        this.itemsDao = itemsDao;
    }

    @PostMapping("/item")
    public void createItem(@RequestBody ftModel item) {
        itemsDao.createItem(item);
    }

    @GetMapping("/item/{id}")
    public ftModel getItem(@PathVariable int id) {
        return itemsDao.getItem(id);
    }

    @GetMapping("/item/item")
    public List<ftModel> getAll() {
        return itemsDao.getAllItems();
    }

    @PutMapping("/item/{name}")
    public void updateItem(@PathVariable String name, @RequestBody ftModel item) {
        itemsDao.updateItem(item);
    }

    @DeleteMapping("/item/{name}")
    public void DeleteItem(@PathVariable String name) {
        itemsDao.deleteItem(name);
    }
}

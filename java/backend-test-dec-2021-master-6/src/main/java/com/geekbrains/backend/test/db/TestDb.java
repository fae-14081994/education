package com.geekbrains.backend.test.db;

import java.util.List;

import com.geekbrains.db.dao.ProductsMapper;
import com.geekbrains.db.model.Products;
import com.geekbrains.db.model.ProductsExample;

public class TestDb {

    public static void main(String[] args) {

        DbService dbService = new DbService();
        ProductsMapper productsMapper = dbService.getProductsMapper();
        Products product = productsMapper.selectByPrimaryKey(1L);
        System.out.println(product);

//        1
        Categories forCreate = new Categories();
        forCreate.setTitle("Выпечка");
        forCreate.setID(3L);
//        2
        Categories forCreate = new Categories();
        forCreate.setTitle("Автозапчасти");
        forCreate.setID(4L);
//        3
        Categories forCreate = new Categories();
        forCreate.setTitle("Бытовая химия");
        forCreate.setID(5L);
//        4
        Categories forCreate = new Categories();
        forCreate.setTitle("Мебель");
        forCreate.setID(6L);

        categoriesMapper.insert(forCreate);

//        1
        Products forCreate = new Products();
        forCreate.setTitle("Манты");
        forCreate.setPrice(75);
        forCreate.setCategoryId(3L);
//        2
        Products forCreate = new Products();
        forCreate.setTitle("Треугольники");
        forCreate.setPrice(40);
        forCreate.setCategoryId(3L);
//        3
        Products forCreate = new Products();
        forCreate.setTitle("Чебуреки");
        forCreate.setPrice(45);
        forCreate.setCategoryId(3L);
//        4
        Products forCreate = new Products();
        forCreate.setTitle("Колесо");
        forCreate.setPrice(5000);
        forCreate.setCategoryId(4L);
//        5
        Products forCreate = new Products();
        forCreate.setTitle("Руль");
        forCreate.setPrice(5050);
        forCreate.setCategoryId(4L);
//        6
        Products forCreate = new Products();
        forCreate.setTitle("Дворники");
        forCreate.setPrice(2500);
        forCreate.setCategoryId(4L);
//        7
        Products forCreate = new Products();
        forCreate.setTitle("Доместос");
        forCreate.setPrice(50);
        forCreate.setCategoryId(5L);
//        8
        Products forCreate = new Products();
        forCreate.setTitle("Стиральный порошок");
        forCreate.setPrice(50);
        forCreate.setCategoryId(5L);
//        9
        Products forCreate = new Products();
        forCreate.setTitle("Зубная паста");
        forCreate.setPrice(50);
        forCreate.setCategoryId(5L);
//        10
        Products forCreate = new Products();
        forCreate.setTitle("Дверь");
        forCreate.setPrice(50);
        forCreate.setCategoryId(6L);
//        11
        Products forCreate = new Products();
        forCreate.setTitle("Окно");
        forCreate.setPrice(50);
        forCreate.setCategoryId(6L);
//        12
        Products forCreate = new Products();
        forCreate.setTitle("Стул");
        forCreate.setPrice(50);
        forCreate.setCategoryId(6L);

        Products forCreate = new Products();
        forCreate.setTitle("Coca cola");
        forCreate.setPrice(50);
        forCreate.setCategoryId(1L);

        productsMapper.insert(forCreate);

        ProductsExample filter = new ProductsExample();

        List<Products> products = productsMapper.selectByExample(filter);
        System.out.println(products);

        filter.createCriteria()
                .andCategoryIdEqualTo(2L);

        System.out.println(productsMapper.selectByExample(filter));

//        Я не знаю, как вывести тут, но с SQL это примерно так
//        SELECT TOP (3) ProductId, ProductName, Price
//        FROM TestTable
//        ORDER BY Price DESC

        filter.clear();
        filter.createCriteria()
                .andPriceBetween(51, 1000);

        System.out.println(productsMapper.selectByExample(filter));

        product.setPrice(105);
        productsMapper.updateByPrimaryKey(product);

        System.out.println(productsMapper.selectByPrimaryKey(1L));
    }

}

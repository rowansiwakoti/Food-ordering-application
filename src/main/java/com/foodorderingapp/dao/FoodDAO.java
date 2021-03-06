package com.foodorderingapp.dao;

import com.foodorderingapp.commons.PageModel;
import com.foodorderingapp.model.Food;

import java.util.List;

/**
 * Created by TOPSHI KREATS on 11/29/2017.
 */
public interface FoodDAO {
    boolean deleteFood(Food food);
    boolean updateFood(Food food);
    List<Food> getAll();
    Food getFoodById(int id);
    List<Food> getFoodByRestaurantId(int id);
    List<Food> addFoodsToRestaurant(List<Food> foodList);
    Food getFoodByResName(String restaurantName,String foodName);
    List<Food> getPaginatedFood(PageModel pageModel, int id);
    long countFood(int id);
}

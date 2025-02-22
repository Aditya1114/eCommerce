package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "categories")
// Below annotation helps in creating the setter,getter and constructor for our field.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryID;
    private String categoryName;
//    public Long getCategoryID() {
//        return categoryID;
//    }
//
//    public void setCategoryID(Long categoryID) {
//        this.categoryID = categoryID;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public Category(Long categoryID, String categoryName) {
//        this.categoryID = categoryID;
//        this.categoryName = categoryName;
//    }
////default constructor not needed but its good practice.
//    public Category() {
//    }
}

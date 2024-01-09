package org.commerceproject.ecommerceprodcutservice.Models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    private int price;
    private Cateogry cateogry;

}
